package com.nttdata.bootcamp.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("temperatura.sistema")
public class TemperaturaProperties {

	private String medida = "celsius";
	
	public String getMedida() {
		return medida;
	}

	public void setMedida(String medida) {
		this.medida = medida;
	}
	
	
}
