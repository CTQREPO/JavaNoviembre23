package com;

public class Practicaja extends Cajero_Concepto implements IOperacionesFinancieras{

	public Practicaja() {
		this.setFolio(0);
	}
	
	@Override
	public Object[] retirar(String numTarjeta, double monto) {
	
		return null;
	}

	@Override
	public void consultarSaldo(String numTarjeta) {
	
		
	}

	
}
