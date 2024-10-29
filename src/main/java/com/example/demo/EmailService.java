package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import java.util.List;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmailWithImage(String to, String subject, String text, List<String> imagePaths) throws MessagingException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

        helper.setTo(to);
        helper.setSubject(subject);
        helper.setFrom("email");

        // Costruisci l'HTML con i CID per le immagini
        StringBuilder htmlContent = new StringBuilder("<html><body>");
        htmlContent.append("<p>").append(text).append("</p>");

        // Aggiungi ogni immagine come allegato inline con un Content ID unico
        for (int i = 0; i < imagePaths.size(); i++) {
            ClassPathResource image = new ClassPathResource("static/" + imagePaths.get(i));
            helper.addInline("image" + i, image); // Aggiungi l'immagine come allegato inline
            htmlContent.append("<img src='cid:image").append(i).append("' style='width: 300px; height: auto; margin: 10px;'/>");
        }

        htmlContent.append("</body></html>");
        helper.setText(htmlContent.toString(), true); // 'true' per indicare che il testo è in HTML

        mailSender.send(mimeMessage);
    }
}
