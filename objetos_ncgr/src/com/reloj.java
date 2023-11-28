package com;

public class reloj {
	
	//atributos- QUE
	 String color;
	 String tipo;
	 String materiales;
	 
	 int horas, minutos;
	 
	 //constructores
	 public reloj() {
		 
	 }
	 
	 public reloj(String materiales, int horas, int minutos) {
			super();
			this.materiales = materiales;
			this.horas = horas;
			this.minutos = minutos;
		}
	 
	 public reloj(String color, String tipo, String materiales, int horas, int minutos) {
		super();
		this.color = color;
		this.tipo = tipo;
		this.materiales = materiales;
		this.horas = horas;
		this.minutos = minutos;
	}

	 
	 // getters & setters
	 
	 public String getColor() { //devuelve valor de acuerdo a int,string,double
			return color;
		}

		public void setColor(String color) { //entrada de datos al objeto
			this.color = color;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public String getMateriales() {
			return materiales;
		}

		public void setMateriales(String materiales) {
			this.materiales = materiales;
		}

		public int getHoras() {
			return horas;
		}

		public void setHoras(int horas) {
			this.horas = horas;
		}

		public int getMinutos() {
			return minutos;
		}

		public void setMinutos(int minutos) {
			this.minutos = minutos;
		}

	 
	
    //toString
	 @Override
		public String toString() {
			return "reloj [color=" + color + ", tipo=" + tipo + ", materiales=" + materiales + ", horas=" + horas
					+ ", minutos=" + minutos + "]";
		}

	
	 
		 
	 }

