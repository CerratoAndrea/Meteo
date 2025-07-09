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

Passaggio 1: Scaricare il Progetto da GitHub
Apri il tuo terminale (o il prompt dei comandi su Windows).

Naviga nella directory dove vuoi salvare il progetto. Ad esempio:

Bash

cd C:\Users\TuoUtente\Documents\Progetti
o

Bash

cd ~/Documenti/Progetti
Clona il repository del progetto. Sostituisci <URL_DEL_TUO_REPOSITORY> con l'URL effettivo del repository GitHub del progetto (es. https://github.com/tuo-utente/nome-repo.git):

Bash

git clone <URL_DEL_TUO_REPOSITORY>
Entra nella directory del progetto che hai appena scaricato:

Bash

cd nome-cartella-progetto  # Sostituisci con il nome effettivo della cartella
Passaggio 2: Dockerizzare il Progetto
Ora costruiremo l'immagine Docker dell'applicazione. Questa operazione prenderà il codice sorgente, lo compilerà e lo impacchetterà in un'immagine eseguibile da Docker.

Assicurati di essere ancora nella directory radice del progetto (quella che contiene il file pom.xml e il Dockerfile).

Costruisci l'immagine Docker eseguendo il seguente comando. Il processo potrebbe richiedere qualche minuto, specialmente la prima volta che scarica le dipendenze di Maven e l'immagine base:

Bash

docker build -t meteo-app:1.0 .
meteo-app:1.0: È il nome e il tag (versione) che stiamo dando all'immagine Docker. Puoi cambiarli se preferisci.

.: Indica a Docker di cercare il Dockerfile nella directory corrente.

Passaggio 3: Avviare l'Applicazione con Docker
Una volta che l'immagine è stata costruita con successo, puoi avviare l'applicazione in un container Docker.

Avvia il container Docker:

Bash

docker run -p 8080:8080 meteo-app:1.0
-p 8080:8080: Questo comando mappa la porta 8080 del tuo computer (host) alla porta 8080 all'interno del container. L'applicazione Java è configurata per ascoltare su questa porta.

meteo-app:1.0: Specifica quale immagine Docker utilizzare per avviare il container.

L'applicazione dovrebbe ora essere in esecuzione. Vedrai i log dell'applicazione nel tuo terminale.

Accedi all'applicazione aprendo il tuo browser web e visitando l'indirizzo:

http://localhost:8080/
