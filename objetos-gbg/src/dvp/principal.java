package dvp;


public class principal {

public static void main (String[] args) {
		
		Agenda a1 = new Agenda();
		a1.setColor("gris");
		a1.setTipo("electronica");
		a1.setMes("enero");
		a1.setDia(15);
		a1.setHora(30);
		Agenda a2 = new Agenda("rosa", "papel", "febrero",4, 14);
		
		
		System.out.println(a1);
		System.out.println(a2);
	
		
		
		
		
	}


}
