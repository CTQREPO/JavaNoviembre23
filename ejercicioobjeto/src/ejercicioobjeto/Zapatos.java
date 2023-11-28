package ejercicioobjeto;

public class Zapatos {
	

	String marca;
	String color;
	String tipo;
	int talla;
	
	public Zapatos() {
		
	}

	public Zapatos(String marca, String color, String tipo, int talla) {
		super();
		this.marca = marca;
		this.color = color;
		this.tipo = tipo;
		this.talla = talla;
		
	}
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
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

	public int getTalla() {
		return talla;
	}

	public void setTalla(int talla) {
		this.talla = talla;
	}

	
	
	@Override
	public String toString() {
		return "Zapatos [marca=" + marca + ", color=" + color + ", tipo=" + tipo + ", talla=" + talla + "]";
	}

}
