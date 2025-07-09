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

Passaggio 1: Scaricare il Progetto da GitHub
Apri il tuo terminale (o il prompt dei comandi su Windows).

Naviga nella directory dove vuoi salvare il progetto. Ad esempio:
cd C:\Users\TuoUtente\Documents\Progetti
o
cd ~/Documenti/Progetti

Clona il repository del progetto. Sostituisci <URL_DEL_TUO_REPOSITORY> con l'URL effettivo del repository GitHub del progetto (es. https://github.com/tuo-utente/nome-repo.git):
git clone https://github.com/CerratoAndrea/Meteo.git

Entra nella directory del progetto che hai appena scaricato:
cd Meteo  

Passaggio 2: Dockerizzare il Progetto
Ora costruiremo l'immagine Docker dell'applicazione. 

./mvnw clean package
docker-compose up --build

Passaggio 3: Avviare l'Applicazione con Docker
Una volta che l'immagine è stata costruita con successo, puoi avviare l'applicazione in un container Docker.

Avvia il container Docker:

docker run -p 8080:8080 meteo-app:1.0
-p 8080:8080: meteo-app:1.0:

Accedi all'applicazione aprendo il tuo browser web e visitando l'indirizzo:

http://localhost:8080
