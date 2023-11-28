package com;

public class Audifonos {
	
				//Atributos
			String color;
			String tipo;
			String material;
		
			
			public Audifonos() {
				
			}

			public Audifonos(String color, String tipo) {
				super();
				this.color = color;
				this.tipo = tipo;
				
			}

			public Audifonos(String color, String tipo, String material) {
				super();
				this.color = color;
				this.tipo = tipo;
				this.material = material;
			}

			@Override
			public String toString() {
				return "Audifonos [color=" + color + ", tipo=" + tipo + ", material=" + material + "]";
			}

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

			public String getMaterial() {
				return material;
			}

			public void setMaterial(String material) {
				this.material = material;
			}
			
			
			
			

}
