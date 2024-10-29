------------
ITA
------------

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

----------
ENG.
----------

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

----------
FRA
----------

Ces codes représentent une partie d'une application web pour un magasin de PC, réalisée en utilisant Java et Thymeleaf pour le rendu des pages, ainsi que JavaScript pour l'interactivité.

La Classe Pc
Cette classe représente un produit PC dans le système, avec des attributs tels que le nom, la marque, la description, le prix, l'URL de l'image, la quantité en stock et la quantité vendue. Elle inclut des méthodes getter et setter pour chaque attribut, permettant l'accès et la modification des propriétés du produit.

La Classe PcJdbcTemplate
Cette classe gère les opérations de base de données pour les produits PC, en utilisant JdbcTemplate de Spring. Elle permet de :

Insérer de nouveaux PC dans la base de données.
Supprimer des PC existants.
Récupérer une liste de tous les PC dans la base de données.
Mettre à jour la quantité d'un produit.
La Classe PcSelezionato
Cette classe représente un PC sélectionné par l'utilisateur, comprenant des détails tels que le nom, la marque, la description, le prix et la quantité désirée. Elle est utile pour gérer les articles dans le panier de l'utilisateur.

La Page HTML pour le Panier
Cette page montre les articles dans le panier de l'utilisateur, utilisant Thymeleaf pour afficher les données. Elle inclut des fonctionnalités pour :

Afficher une liste de produits, montrant le nom, la marque, le prix, l'image et la quantité.
Modifier la quantité d'un produit.
Retirer un produit du panier.
Afficher le total de l'achat et un bouton pour procéder à l'achat.
Page HTML pour la Facture
Cette page montre les détails des achats effectués, y compris le nom, la marque, le prix, l'image et la quantité de chaque produit. Elle inclut un formulaire pour envoyer l'adresse email de l'utilisateur, pour la réception de la facture.

La Page Principale du Magasin Index
Cette page est la page d'accueil du magasin, présentant une description de l'entreprise et les produits disponibles. Elle utilise JavaScript pour charger dynamiquement les données, affichant images et détails.

L'utilisation de JavaScript pour charger des données de manière dynamique rend l'expérience utilisateur plus fluide.
L'utilisateur peut facilement visualiser et gérer les articles dans son panier.
Les pages sont structurées pour s'adapter à différents dispositifs, améliorant l'accessibilité.
Cette application combine des technologies backend et frontend pour fournir une expérience d'achat en ligne complète et interactive.

---------
JAP
---------

これらのコードは、JavaとThymeleafを使用してページをレンダリングし、JavaScriptを組み合わせてインタラクティブ性を実現したPCストアのWebアプリケーションの一部を表しています。

### PCクラス
このクラスは、システム内のPC製品を表し、名前、ブランド、説明、価格、画像URL、在庫数量、販売数量などの属性を持っています。それぞれの属性に対するgetterとsetterメソッドを含んでおり、製品のプロパティへのアクセスと変更を可能にします。

### PcJdbcTemplateクラス
このクラスは、PC製品に対するデータベース操作を管理し、SpringのJdbcTemplateを使用しています。以下のことを可能にします：

1. 新しいPCをデータベースに挿入する。
2. 既存のPCを削除する。
3. データベースからすべてのPCのリストを取得する。
4. 製品の数量を更新する。

### PcSelezionatoクラス
このクラスは、ユーザーが選択したPCを表し、名前、ブランド、説明、価格、希望数量などの詳細を含みます。これは、ユーザーのカート内のアイテムを管理するのに役立ちます。

### カートのHTMLページ
このページは、ユーザーのカート内のアイテムを表示し、Thymeleafを使用してデータを表示します。以下の機能を含みます：

- 名前、ブランド、価格、画像、数量を表示する製品リスト。
- 製品の数量を変更する。
- カートから製品を削除する。
- 購入合計を表示し、購入手続きに進むためのボタン。

### 請求書のHTMLページ
このページは、購入した商品の詳細を表示し、各製品の名前、ブランド、価格、画像、数量を含みます。請求書を受け取るためにユーザーのメールアドレスを送信するフォームが含まれています。

### ストアのメインページ
このページはストアのホームページで、会社の説明と利用可能な製品を紹介しています。JavaScriptを使用してデータを動的に読み込み、画像や詳細を表示します。

JavaScriptを使用してデータを動的に読み込むことで、ユーザーエクスペリエンスがよりスムーズになります。  
ユーザーはカート内のアイテムを簡単に表示および管理できます。  
ページはさまざまなデバイスに対応するように構築されており、アクセシビリティが向上しています。  
このアプリケーションは、バックエンドとフロントエンドの技術を組み合わせて、完全でインタラクティブなオンラインショッピング体験を提供します。
