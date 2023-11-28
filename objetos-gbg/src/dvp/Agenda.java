package dvp;

public class Agenda {
	String color;
	String tipo;
	String mes;
	int dia,hora;
	
	public Agenda(){
		
	}

	public Agenda(String color, String tipo, String mes, int dia, int hora) {
		super();
		this.color = color;
		this.tipo = tipo;
		this.mes = mes;
		this.dia = dia;
		this.hora = hora;
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

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	@Override
	public String toString() {
		return "Agenda [color=" + color + ", tipo=" + tipo + ", mes=" + mes + ", dia=" + dia + ", hora=" + hora + "]";
	}
	
	
}
