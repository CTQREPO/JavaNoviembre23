package com;

public class Auto {

	//Atributos QUE
		String color;
	    String tipo;
	    String materiales;
	    
	    int motor, transmision;
	    
		//Constructores
	    public Auto () {
		
	}
		public Reloj(String color, String tipo, String materiales, int horas, int minutos) {
			super();
			this.color = color;
			this.tipo = tipo;
			this.materiales = materiales;
			this.horas = horas;
			this.minutos = minutos;
		}
		@Override
		public String toString() {
			return "Reloj [color=" + color + ", tipo=" + tipo + ", materiales=" + materiales + ", horas=" + horas
					+ ", minutos=" + minutos + "]";
		}
		
		
		//Getters & Setters
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
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
	}
}
