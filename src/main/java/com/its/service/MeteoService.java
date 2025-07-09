package com.its.service;

import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.its.dto.MeteoDto;

@Service
public class MeteoService {
	  private static final Map<String, double[]> COORDINATE_CITTA = Map.of(
	            "Roma", new double[]{41.9028, 12.4964},
	            "Milano", new double[]{45.4642, 9.1900},
	            "Napoli", new double[]{40.8518, 14.2681},
	            "Torino", new double[]{45.0703, 7.6869},
	            "Firenze", new double[]{43.7696, 11.2558},
	            "Venezia", new double[]{45.4371, 12.3325},
	            "Bologna", new double[]{44.4949, 11.3426},
	            "Genova", new double[]{44.4056, 8.9463},
	            "Palermo", new double[]{38.1157, 13.3615},
	            "Bari", new double[]{41.1171, 16.8719}
	    );

	    private static final String OPEN_METEO_URL = "https://api.open-meteo.com/v1/forecast";

	    private final RestTemplate restTemplate = new RestTemplate();

	    public MeteoDto getMeteoPerCitta(String citta) {
	        double[] coord = COORDINATE_CITTA.getOrDefault(citta, new double[]{41.9028, 12.4964});

	        String url = UriComponentsBuilder.newInstance()
	                .scheme("https") // o "http"
	                .host("api.open-meteo.com") // Il dominio della tua URL base
	                .path("/v1/forecast") // Il path della tua URL base
	                .queryParam("latitude", coord[0])
	                .queryParam("longitude", coord[1])
	                .queryParam("current_weather", true)
	                .build()
	                .toUriString();                  

	        OpenMeteoResponse response = restTemplate.getForObject(url, OpenMeteoResponse.class);

	        if (response != null && response.currentWeather != null) {
	            Double temperatura = response.currentWeather.temperature;
	            Double temperaturaPercepita = response.currentWeather.apparentTemperature;
	            return new MeteoDto(temperatura, temperaturaPercepita);
	        }
	        return new MeteoDto(null, null);
	    }

	    private static class OpenMeteoResponse {
	        @JsonProperty("current_weather")
	        public CurrentWeather currentWeather;
	    }

	    private static class CurrentWeather {
	        @JsonProperty("temperature")
	        public Double temperature;

	        @JsonProperty("apparent_temperature")
	        public Double apparentTemperature;
	    }
}
