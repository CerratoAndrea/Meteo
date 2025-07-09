Introduzione
Questo progetto è un'applicazione web minimalista che permette agli utenti di selezionare una città da un elenco predefinito e visualizzare la temperatura attuale per quella località. È stato sviluppato con Spring Boot per il backend e Thymeleaf per il frontend.

Contenuti:
- Introduzione
- Funzionalità
- Tecnologie Utilizzate
- Come Avviare il Progetto
- Prerequisiti
- Compilazione ed Esecuzione Locale
- Dockerizzazione
- Struttura del Progetto
- API Esterna
- 


Funzionalità
Selezione Città: Un'interfaccia utente semplice permette di scegliere tra diverse città italiane (Roma, Milano, Napoli, Torino).

Visualizzazione Meteo: Mostra la temperatura e la temperatura percepita per la città selezionata.

Integrazione API Esterna: Recupera i dati meteorologici tramite chiamate REST all'API Open-Meteo.

Tecnologie Utilizzate:
Java 17: Linguaggio di programmazione.
Spring Boot: Framework per lo sviluppo rapido di applicazioni Java.
Maven: Strumento per la gestione del ciclo di vita del progetto e delle dipendenze.
Thymeleaf: Motore di template per la generazione delle pagine web HTML.
RestTemplate: Client HTTP di Spring per l'interazione con l'API Open-Meteo.
Docker: Per la containerizzazione dell'applicazione.

Comandi per l'esecuzione

Per clonare la repo:
git clone https://github.com/CerratoAndrea/Meteo.git
cd meteo

Compila il progetto con Maven:
Bash
mvn clean package

Esegui l'applicazione:
Bash
java -jar target/il-nome-del-tuo-jar.jar

Apri il tuo browser e vai a:
http://localhost:8080

Dockerizzazione

Costruisci l'immagine Docker:
Bash
docker build -t meteo-app:1.0 .

Esegui il container Docker:
Bash
docker run -p 8080:8080 meteo-app:1.0
