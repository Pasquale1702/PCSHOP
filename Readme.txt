ITA

Questi codici rappresentano una parte di un'applicazione web per un negozio di PC, realizzata utilizzando Java e Thymeleaf per il rendering delle pagine, insieme a JavaScript per l'interattività.

La Classe Pc
Questa classe rappresenta un prodotto PC nel sistema, con attributi come nome, marca, descrizione, prezzo, URL dell'immagine, quantità in magazzino e quantità venduta. Include metodi getter e setter per ciascun attributo, consentendo l'accesso e la modifica delle proprietà del prodotto.

La Classe PcJdbcTemplate
Questa classe gestisce le operazioni di database per i prodotti PC, utilizzando JdbcTemplate di Spring. Permette di:

1. Inserire nuovi PC nel database.
2. Eliminare PC esistenti.
3. Recuperare una lista di tutti i PC dal database.
4. Aggiornare la quantità di un prodotto.

La Classe PcSelezionato
Questa classe rappresenta un PC selezionato dall'utente, comprensivo di dettagli come nome, marca, descrizione, prezzo e quantità desiderata. È utile per gestire gli articoli nel carrello dell'utente.

La Pagina HTML per il Carrello
Questa pagina mostra gli articoli nel carrello dell'utente, utilizzando Thymeleaf per visualizzare i dati. Include funzionalità per:

Visualizzare una lista di prodotti, mostrando nome, marca, prezzo, immagine e quantità.
Modificare la quantità di un prodotto.
Rimuovere un prodotto dal carrello.
Mostrare il totale dell'acquisto e un pulsante per procedere all'acquisto.


Pagina HTML per la Fattura
Questa pagina mostra i dettagli degli acquisti effettuati, inclusi nome, marca, prezzo, immagine e quantità di ciascun prodotto. Include un modulo per inviare l'indirizzo email dell'utente, per la ricezione della fattura.

La Pagina Principale del Negozio Index
Questa pagina è la home del negozio, presentando una descrizione dell'azienda e i prodotti disponibili. Utilizza JavaScript per caricare dinamicamente i dati, mostrando immagini e dettagli.


L'uso di JavaScript per caricare dati dinamicamente rende l'esperienza utente più fluida.
L'utente può facilmente visualizzare e gestire gli articoli nel proprio carrello.
Le pagine sono strutturate per adattarsi a diversi dispositivi, migliorando l'accessibilità.
Questa applicazione combina tecnologie backend e frontend per fornire un'esperienza di acquisto online completa e interattiva.


ENG.

These codes represent a part of a web application for a PC store, developed using Java and Thymeleaf for rendering pages, along with JavaScript for interactivity.

Pc Class
This class represents a PC product in the system, with attributes such as name, brand, description, price, image URL, quantity in stock, and quantity sold. It includes getter and setter methods for each attribute, allowing access to and modification of the product's properties.

PcJdbcTemplate Class
This class manages database operations for PC products using Spring's JdbcTemplate. It allows for:

Inserting new PCs into the database.
Deleting existing PCs.
Retrieving a list of all PCs from the database.
Updating the quantity of a product.

PcSelezionato Class
This class represents a PC selected by the user, including details like name, brand, description, price, and desired quantity. It is useful for managing items in the user's shopping cart.

HTML Page for the Cart
This page displays the items in the user's cart using Thymeleaf to render data. It includes features for:

Displaying a list of products, showing name, brand, price, image, and quantity.
Modifying the quantity of a product.
Removing a product from the cart.
Showing the total purchase amount and a button to proceed with the purchase.

HTML Page for the Invoice
This page shows the details of the completed purchases, including the name, brand, price, image, and quantity of each product. It includes a form to submit the user's email address for receiving the invoice.

Main Store Page
This page serves as the homepage for the store, presenting a description of the company and available products. It uses JavaScript to dynamically load data.


Interactivity: The use of JavaScript for dynamically loading data enhances the user experience.
Users can easily view and manage items in their cart.
The pages are structured to adapt to different devices, improving accessibility.
This application combines backend and frontend technologies to provide a comprehensive and interactive online shopping experience.

