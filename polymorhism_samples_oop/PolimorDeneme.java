package polymorhism_samples_oop;

public class PolimorDeneme {
	public static void main(String[] args) {
     GeometrikNesneYazdýr(new Cember(5.0,"mavi",true));

	}

	public static void GeometrikNesneYazdýr(GeometrikNesne gn) {
		System.out.println("YARATILMA TARIHI " + gn.getOlusturulmaTarihi() + " RENGÝ: " + gn.getRenk()+" DOLU MU?: "+gn.isDolu());
	}

}
