package polymorhism_samples_oop;

public class PolimorDeneme {
	public static void main(String[] args) {
     GeometrikNesneYazd�r(new Cember(5.0,"mavi",true));

	}

	public static void GeometrikNesneYazd�r(GeometrikNesne gn) {
		System.out.println("YARATILMA TARIHI " + gn.getOlusturulmaTarihi() + " RENG�: " + gn.getRenk()+" DOLU MU?: "+gn.isDolu());
	}

}
