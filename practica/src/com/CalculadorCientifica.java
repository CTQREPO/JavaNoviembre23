package com;

public class CalculadorCientifica extends Calculadora{

 
	int numero1;
	int numero2;
	int resultaodo;
	
	
	
	public CalculadorCientifica() {
		
		

	 
	 
}
	
	
	
	
	public CalculadorCientifica(int numero1, int numero2, int resultaodo) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.resultaodo = resultaodo;
	}
	




	public int getNumero1() {
		return numero1;
	}




	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}




	public int getNumero2() {
		return numero2;
	}




	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}




	public int getResultaodo() {
		return resultaodo;
	}




	public void setResultaodo(int resultaodo) {
		this.resultaodo = resultaodo;
	}




	@Override
	public String toString() {
		return "CalculadorCientifica [numero1=" + numero1 + ", numero2=" + numero2 + ", resultaodo=" + resultaodo
				+ ", resultado=" + resultado + ", resultado2=" + resultado2 + ", resultado3=" + resultado3
				+ ", getNumero1()=" + getNumero1() + ", getNumero2()=" + getNumero2() + ", getResultaodo()="
				+ getResultaodo() + ", getResultado()=" + getResultado() + ", getResultado2()=" + getResultado2()
				+ ", getResultado3()=" + getResultado3() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
               
	}


