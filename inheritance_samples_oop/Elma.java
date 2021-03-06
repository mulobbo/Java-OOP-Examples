package inheritance_samples_oop;

class mainyeri{
	public static void main(String[] args) {
		new Elma();
		
		
	}
}


class Elma extends Meyve  {
Elma(){
	super("abc");
}
     
	
}




class Meyve{
	public Meyve(String isim ) {
		System.out.println("Selamlar");
		}
		
			
	public String toString() {	
		return "TOSTRING METODU";
	}
		
		
	}
	
	
