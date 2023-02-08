package com.everis.bootcamp.priceservice.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.everis.bootcamp.priceservice.model.Prices;
import com.everis.bootcamp.priceservice.service.PriceService;

@RestController("api")
public class PriceController {

	private PriceService priceService;

	public PriceController(PriceService priceService) {
		this.priceService = priceService;
	}
	
	// Se ha modificado PostMapping por GetMapping puesto que es una petición Get

	// Petición de tipo GET para obtener el precio del elemento con el "id" especificado
	@GetMapping(value= "/price/get-price/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Prices getPrice(@PathVariable Integer id) {
		return priceService.get(id);
		
	}
	
	// Se ha modificado PostMapping por GetMapping puesto que es una petición Get
	
	// Petición de tipo GET para obtener todos los precios
	@GetMapping(value="/price/get-all-prices", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Prices> getAllPrices() {
		return priceService.getAllPrices();
	}

}
