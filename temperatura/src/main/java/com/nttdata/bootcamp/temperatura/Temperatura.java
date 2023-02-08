package com.nttdata.bootcamp.temperatura;

public class Temperatura {

//	private Double temperatura;
	private String medida;
	
	public Temperatura(String medida) {
//		this.temperatura = temperatura;
		this.medida = medida;
	}
	
	public Double convertirTemperatura(Double temperatura) {
		
		Double tempConvertida = 0.0;
		
		if (medida.equals("celsius")) {
			tempConvertida = (temperatura - 32) / 1.8;
		}else{
			tempConvertida = temperatura * 1.8 + 32;
		}
		
		return tempConvertida;
	}
}
