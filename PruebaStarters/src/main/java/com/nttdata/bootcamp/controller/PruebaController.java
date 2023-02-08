package com.nttdata.bootcamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.saludoidioma.domain.Saludo;
import com.nttdata.bootcamp.temperatura.Temperatura;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

@RestController
public class PruebaController {

	@Autowired
	private Saludo saludo;

	@Autowired
	private Temperatura temperatura;
	
	private Counter counter;
	
	public PruebaController(MeterRegistry registry) {
		this.counter = Counter.builder("invocaciones.hello").description("Invocaciones totales").register(registry);
	}

	@GetMapping(path = "/prueba")
	public String pruebaSaludo() {
		return saludo.mensajeSaludo();
	}

	@GetMapping(path = "/grados")
	public String pruebaTemperatura(String temp) {
		return Double.toString(temperatura.convertirTemperatura(Double.valueOf(temp)));
	}

	@GetMapping(path = "/helloWorld")
	public String helloWorld() {
		counter.increment();
		return "hello World";
	}

}
