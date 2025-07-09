# Meteo

## Introduzione
Questo progetto è un'applicazione web minimalista che permette agli utenti di selezionare una città da un elenco predefinito e visualizzare la temperatura attuale per quella località. È stato sviluppato con Spring Boot per il backend e Thymeleaf per il frontend.

## Contenuti
- [Introduzione](#introduzione)
- [Funzionalità](#funzionalità)
- [Tecnologie Utilizzate](#tecnologie-utilizzate)
- [Come Avviare il Progetto](#come-avviare-il-progetto)
- [Prerequisiti](#prerequisiti)
- [Compilazione ed Esecuzione Locale](#compilazione-ed-esecuzione-locale)
- [Dockerizzazione](#dockerizzazione)
- [Struttura del Progetto](#struttura-del-progetto)
- [API Esterna](#api-esterna)

## Funzionalità
- **Selezione Città:** Un'interfaccia utente semplice permette di scegliere tra diverse città italiane (Roma, Milano, Napoli, Torino).
- **Visualizzazione Meteo:** Mostra la temperatura e la temperatura percepita per la città selezionata.
- **Integrazione API Esterna:** Recupera i dati meteorologici tramite chiamate REST all'API Open-Meteo.

## Tecnologie Utilizzate
- **Java 17:** Linguaggio di programmazione.
- **Spring Boot:** Framework per lo sviluppo rapido di applicazioni Java.
- **Maven:** Strumento per la gestione del ciclo di vita del progetto e delle dipendenze.
- **Thymeleaf:** Motore di template per la generazione delle pagine web HTML.
- **RestTemplate:** Client HTTP di Spring per l'interazione con l'API Open-Meteo.
- **Docker:** Per la containerizzazione dell'applicazione.

## Come Avviare il Progetto

### Clona la repository
```sh
git clone https://github.com/CerratoAndrea/Meteo.git
cd meteo
```

### Compila il progetto
```sh
./mvnw clean package -DskipTests
```

Apri il tuo browser e vai a:  
[http://localhost:8080](http://localhost:8080)

## Dockerizzazione

### Costruisci l'immagine Docker
```sh
docker build -t meteo-app .
```

### Esegui il container Docker
```sh
docker run -p 8080:8080 meteo-app:1.0
