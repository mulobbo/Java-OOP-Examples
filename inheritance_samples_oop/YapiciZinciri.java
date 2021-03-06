package inheritance_samples_oop;

public class YapiciZinciri {

	public static void main(String[] args) {
		new Akademisyen();
	}
}

class Akademisyen extends Calisan{
	public Akademisyen() {
		//burda gizli bir "super()" var
		System.out.println("Akademisyenin yapicisi calisti");
	}

}

class Calisan extends Insan {

	public Calisan() {
		//burda gizli bir "super()" var
		this("caisanin yuklenmis yapicisini cagiriyoruz");
		System.out.println("Calisanin yapicisi cagrildi");
	}

	public Calisan(String s) {
		System.out.println(s);

	}

}

class Insan {
	public Insan() {

		System.out.println("Insanin yapýcýsý calisti");

	}

}
