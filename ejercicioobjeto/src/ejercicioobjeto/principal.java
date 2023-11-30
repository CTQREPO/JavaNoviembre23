package ejercicioobjeto;



public class principal {
 public static void main(String[] args) {
	
	
	 Zapatos r1= new Zapatos();
	 r1.setMarca("puma");
	 r1.setColor("Negro");
	 r1.setTipo("Formal");
	 r1.setTalla(8);
	 
	  Zapatos r2= new Zapatos("Flexi", "Cafe", "Casual", 7);
	 
	 
	 
	 System.out.println(r2);
	 System.out.println(r1);
	 
}

}
