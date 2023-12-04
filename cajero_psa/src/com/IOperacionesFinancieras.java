package com;

public interface IOperacionesFinancieras {

	// PENSAR EN LA SALIDA, TIPO DE DATO, MÉTODO, ARGUMENTOS
	Object[] retirar(String numTarjeta, double monto); 
	
	void consultarSaldo(String numTarjeta);
	
	
}
