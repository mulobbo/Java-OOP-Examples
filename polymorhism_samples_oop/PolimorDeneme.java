package polymorhism_samples_oop;

public class PolimorDeneme {
	public static void main(String[] args) {
     GeometrikNesneYazdır(new Cember(5.0,"mavi",true));

	}

	public static void GeometrikNesneYazdır(GeometrikNesne gn) {
		System.out.println("YARATILMA TARIHI " + gn.getOlusturulmaTarihi() + " RENGİ: " + gn.getRenk()+" DOLU MU?: "+gn.isDolu());
	}

}
