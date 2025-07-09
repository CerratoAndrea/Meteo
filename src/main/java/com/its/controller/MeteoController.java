package com.its.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.its.dto.MeteoDto;
import com.its.service.MeteoService;

@Controller
public class MeteoController {
	
	 @Autowired
	    private MeteoService meteoService;

	    private static final List<String> CITTA = List.of("Roma", "Milano", "Napoli", "Torino");

	    @GetMapping("/")
	    public String index(Model model) {
	        model.addAttribute("cittaDisponibili", CITTA);
	        return "index";
	    }

	   
	    @GetMapping("/meteo")
	    public String meteo(@RequestParam(name="citta", required=false, defaultValue="Roma") String citta,
	                       Model model) {
	        model.addAttribute("cittaDisponibili", CITTA);
	        model.addAttribute("cittaSelezionata", citta);

	        MeteoDto meteo = meteoService.getMeteoPerCitta(citta);
	        model.addAttribute("temperatura", meteo.getTemperatura());
	        model.addAttribute("percepita", meteo.getTemperaturaPercepita());

	        return "meteo";
}
}
