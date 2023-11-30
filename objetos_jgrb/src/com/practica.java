package com;

public class practica {

	public static void main(String[] args) {
		
		Auto a1 = new Auto();  //vacío
		
		a1.setColor("Plata");
		a1.setMateriales("fibra de carbono");
		a1.setTipo("deportivo");
		a1.setMotor(2);
		a1.setTransmision(10);
		
		Auto a2 = new Auto("Negro", "Lámina", "Todo terreno", 2, 6); //específico
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a2.getMateriales());
		
	}

}
