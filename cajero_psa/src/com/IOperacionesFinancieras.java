package com;

public interface IOperacionesFinancieras {

	// PENSAR EN LA SALIDA, TIPO DE DATO, M�TODO, ARGUMENTOS
	Object[] retirar(String numTarjeta, double monto); 
	
	void consultarSaldo(String numTarjeta);
	
	
}
