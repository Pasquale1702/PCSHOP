package com.example.demo;

import java.util.ArrayList;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;



@Controller
public class MyController {

	@Autowired
	EmailService emS;
	
	PcJdbcTemplate db;
	ArrayList<Pc> listapc = new ArrayList<>();
	ArrayList<PcSelezionato> pcSelezionati = new ArrayList<>();

	/*
	 * Questo oggetto lo iniettiamo nel controller tramite costruttore
	 */
	@Autowired
	public MyController(PcJdbcTemplate db) {
		this.db = db;
		this.listapc = db.getLista();
	}

	@GetMapping("/")
	public String getIndex(Model m1) {

		m1.addAttribute("listapc", listapc);
		return "index";
	}

	@PostMapping("/process")
	public String buy(@RequestParam("nome") String nome, @RequestParam("num") int num) {

		if (num > 0) {
			// trovare l'oggetto con quel nome
			for (Pc pc : listapc) {
				if (pc.getNome().equals(nome)) {
					// se disponibile in magazzino
					if (pc.qntMagazzino >= num) {
						// aggiungerlo al carrello
						pcSelezionati.add(new PcSelezionato(pc, num));
						// diminuire la quantità disponibile e aumentare la quantità venduta
						// TO DO: aggiornare db
						// db.updateQnt(num, nome);
						// pc.qntMagazzino -= num;
						// pc.qntVenduta += num;
					}
				}
			}
		}
		return "redirect:/carrello";
	}
	
	@PostMapping("/rimuovi")
	public String removeProduct(@RequestParam("nome") String nome) {
		pcSelezionati.removeIf(pc -> pc.getNome().equals(nome));
		return "redirect:/carrello";
	}

	@PostMapping("/modifica")
	public String rimuovi(@RequestParam("nome") String nome, @RequestParam("num") int num) {
		for(Pc pc : listapc) {
			if(pc.getNome().equals(nome)) {
				for(PcSelezionato pcCom : pcSelezionati) {
					if (pcCom.getNome().equals(nome) && pc.qntMagazzino >= num) {
						pcCom.setQnt(num);
						break;
					}
				}				
			}
		}
		return "redirect:/carrello";
	}

	@GetMapping("/carrello")
	public String printCarrello(Model m1){
		double somma = 0;
		for (PcSelezionato pc : pcSelezionati) {
			somma += pc.getPrezzo() * pc.getQnt();
		}
		m1.addAttribute("somma", somma);
		m1.addAttribute("lista", pcSelezionati);
		return ("carrello");
	}
	@PostMapping("/compra")
	public String fattura(Model m1) throws MessagingException{
		ArrayList<String> url = new ArrayList<String>();
		double somma = 0;
		for (PcSelezionato pc : pcSelezionati) {
			somma += pc.getPrezzo() * pc.getQnt();
			db.updateQnt(pc.getQnt(), pc.getNome());
			url.add(pc.getUrl());
		}
		m1.addAttribute("somma", somma);
		m1.addAttribute("lista", pcSelezionati);
		return ("fattura");
	}

	@GetMapping("/email")
	public String fatturaEmail(@RequestParam("index") String mail, Model m1) throws MessagingException {
	    ArrayList<String> url = new ArrayList<>();
	    double somma = 0;
	    StringBuilder str = new StringBuilder();
	    str.append("<h2 style='color: #2c3e50;'>Grazie di aver acquistato da noi!</h2>");
	    str.append("<p>Ecco un riepilogo dei tuoi acquisti:</p>");
	    str.append("<table style='width:100%; border-collapse: collapse; font-family: Arial, sans-serif;'>");
	    str.append("<thead style='background-color: #f2f2f2;'><tr>")
	       .append("<th style='border: 1px solid #dddddd; padding: 8px;'>Marca</th>")
	       .append("<th style='border: 1px solid #dddddd; padding: 8px;'>Nome</th>")
	       .append("<th style='border: 1px solid #dddddd; padding: 8px;'>Descrizione</th>")
	       .append("<th style='border: 1px solid #dddddd; padding: 8px;'>Prezzo</th>")
	       .append("<th style='border: 1px solid #dddddd; padding: 8px;'>Quantità</th>")
	       .append("<th style='border: 1px solid #dddddd; padding: 8px;'>Immagine</th>")
	       .append("</tr></thead>");
	    str.append("<tbody>");

	    for (PcSelezionato pc : pcSelezionati) {
	        somma += pc.getPrezzo() * pc.getQnt();
	        str.append("<tr>")
	           .append("<td style='border: 1px solid #dddddd; padding: 8px;'>").append(pc.getMarca()).append("</td>")
	           .append("<td style='border: 1px solid #dddddd; padding: 8px;'>").append(pc.getNome()).append("</td>")
	           .append("<td style='border: 1px solid #dddddd; padding: 8px;'>").append(pc.getDescrizione()).append("</td>")
	           .append("<td style='border: 1px solid #dddddd; padding: 8px;'>").append(String.format("%.2f", pc.getPrezzo())).append(" €</td>")
	           .append("<td style='border: 1px solid #dddddd; padding: 8px;'>").append(pc.getQnt()).append("</td>")
	           .append("<td style='border: 1px solid #dddddd; padding: 8px;'><img src='").append(pc.getUrl()).append("' style='width: 50px; height: auto;'/></td>")
	           .append("</tr>");
	        url.add(pc.getUrl());
	    }

	    str.append("</tbody></table>");
	    str.append("<h3 style='color: #2c3e50;'>Totale: ").append(String.format("%.2f", somma)).append(" €</h3>");
	    str.append("<p>Grazie per aver scelto i nostri prodotti!</p>");

	    emS.sendEmailWithImage(mail, "Riepilogo del tuo acquisto", str.toString(), url);
	    System.out.println("Email di acquisto inviata con successo a: " + mail);

	    return "redirect:/";
	}
	
}
