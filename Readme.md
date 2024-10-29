Questi codici rappresentano una parte di un'applicazione web per un negozio di PC, realizzata utilizzando Java e Thymeleaf per il rendering delle pagine, insieme a JavaScript per l'interattività.

1
Nella Classe PC, vengono definiti gli attributi della classe (nome, marca ecc). Viene definito il costruttore PC(), e i metodi getter e setter per l'integrità dei dati e per consentire l'accesso e la modifica.

2
Nella Classe EmailService, viene stabilita la connessione per il collegamento per l'invio della mail.
Viene costruito L'Html con i Cid per le immagini e crea un contenuto HTML per l'email, iniziando con un paragrafo che contiene il testo fornito.
al ciclo for Itera attraverso i percorsi delle immagini, creando un "ClassPathResource" per ciascuna immagine. Le immagini sono aggiunte come allegati inline, con un Content ID unico per ogni immagine, che permette di referenziarle nell'HTML.
Completa il contenuto HTML e imposta il testo dell'email come HTML. Infine, l'email viene inviata tramite mailSender

3
Nel codice MailConfig configura un bean `JavaMailSender` per inviare email utilizzando il server SMTP di Gmail. Utilizza l'annotazione `@Configuration` per dichiarare che la classe contiene configurazioni di bean. All'interno del metodo `getJavaMailSender()`, imposta l'host e la porta di Gmail, oltre a fornire le credenziali di accesso. Configura anche le proprietà necessarie per l'autenticazione e la sicurezza (STARTTLS). Il bean viene quindi restituito per l'iniezione in altri componenti dell'applicazione. È importante gestire le credenziali in modo sicuro, specialmente se si utilizza l'autenticazione a due fattori.


4
Nel Codice MyController,  definisce un controller per gestire un'applicazione esso Inietta EmailService e PcJdbcTemplate per la gestione delle email e l'accesso al database. Contiene la lista dei pc disponibili, e tiene traccia di quelli selezionati dall'utente.
Si utilizzano i metodi GET e POST per mappare i percorsi e modificare, visualizzare, gestire i vari processi. All interno e presente anche la funzionalità di invio mail, utilizzando un messaggio html.


5
Nella Classe PcJdbcTemplate, gestisce l'interazione con il database usando l'iniezione delle dipendenze per eseguire operazioni sul database tramite setJdbcTemplateObject().
Abbiamo i metodi di: 
InsertPc per inserire un nuovo PC nel database
Delete per eliminare un pc in base a nome e marca
GetLista per recuperare tutti i i pc nella lista
UpdateQnt per aggiornare la quantità in magazzino e venduta.

6
Nella Classe PcSelezionato rappresenta un Pc selezionato dal carrello.
Gli attributi della classe sono il nome, la marca, la descrizione ecc... mentre il costruttore: Pc, accetta un oggetto Pc e una quantità, copiando i valori dall'oggetto Pc e impostando la quantità.
Abbiamo ad esso il metodo toString() per fornire una rappresentazione stringa dettagliata dell'oggetto, utile per il debug e la visualizzazione delle informazioni.

---------------------------------------------------------------------------------------------------------------------------------------------------------

PARTE HTML

---------------------------------------------------------------------------------------------------------------------------------------------------------

INDEX.HTML

Il codice HTML è un template Thymeleaf per LA pagina del negozio di PCSHOP.
Possiede vari parametri, tra cui l'introduzione i prodotti disponibili con foto, descrizione, selezione ecc e permette all'utente di selezionarne la quantità.
C'e una sezione dedicata di Amiibo cui viene visualizzata una figurina in una scheda dettagliata creata con un div contenitore e materialize(API SEZIONE COCKTAIL/AMIIBO).



CARRELLO.HTML
Rappresenta una pagina di carrello per un negozio online, utilizzando il framework Thymeleaf e Materialize CSS.
Esso possiede funzionalità del Carrello, come Modifica, Rimozione e Riepilogo acquisto. Inoltre un pulsante di Acquisto con un icona di carrello ed un badge che mostra il numero di articoli nel carrello.



FATTURA.HTML
Rappresenta una pagina di fattura, per un acquisto effettuato in un negozio online.

All'interno è rappresentata la tabella degli acquisti con messaggio e totale (somma), form invio mail con effettivo pulsante per inviare l'indirizzo email.


----------------------------------------------------------------------------------------------------------------------------------------------

!!!ATTENZIONE!!!

COPIARE I FILE IN ECLIPSE NELLA DIRECTORY DEL PROGRAMMA
ASSICURARSI DI AVER INSTALLATO SPRINGBOOT E DI AVER SELEZIONATO NELLA CREAZIONE DEL NUOVO PROGETTO 

SPRING DATA JDBC
SPRING WEB
THYMELEAF
JAVA MAIL SENDER
MYSQL DRIVER
SPRINGBOOT DEVTOOLS

CREARE UNA TABELLA MYSQL CON NOME PC_SHOP E INSERIRE I VARI ATTRIBUTI COME NELLA CLASSE "PC".

MODIFICARE IL PROGRAMMA CON LA PROPRIA MAIL E LA PROPRIA PASSWORD PER LE APP DI GOOGLE.

----
------------------------------------------------------------------------------------------------------------------------------------------

Screenshot relativi al programma
----------------------------------------------------------------------------------------------------------------------------------------



![4](https://github.com/user-attachments/assets/53111ffd-1518-4630-9e1f-52924933b9e4)




--------------------------------------------------------------------------------------------------------------------------------------




![2](https://github.com/user-attachments/assets/f4d54dfe-f0c9-4762-973d-130c8a9ba835)




----------------------------------------------------------------------------------------------------------------------------------------




![3](https://github.com/user-attachments/assets/a0a1d0ba-0942-4520-8dd6-77fccf589eeb)




----------------------------------------------------------------------------------------------------------------------------------------
MAIL CON RIEPILOGO DELL'ACQUISTO



![1](https://github.com/user-attachments/assets/051e6370-e1b0-4d6f-b027-a62994619ab2)




----------------------------------------------------------------------------------------------------------------------------------------



