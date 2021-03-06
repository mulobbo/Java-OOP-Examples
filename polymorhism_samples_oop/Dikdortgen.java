package polymorhism_samples_oop;

public class Dikdortgen extends GeometrikNesne {
	
	private double genislik;
	private double yukseklik;

	
	public Dikdortgen(String renk, boolean dolu, double genislik, double yukseklik) {
		super(renk, dolu);
		this.genislik = genislik;
		this.yukseklik = yukseklik;
	}

	public double alanHesapla() {
		return genislik * yukseklik;
	}
	
	public double cevreHesapla() {
		return 2 * (genislik + yukseklik);
	}
	
	public void yazdir() {
		System.out.println(getOlusturulmaTarihi() +  " tarihinde olusturuldu "
				+ "ve genislik: " + genislik + " yukseklik: " + yukseklik);
	}
	
	@Override
	public String toString() {
		return "Dikdortgen";
	}

	public double getGenislik() {
		return genislik;
	}
	public void setGenislik(double genislik) {
		this.genislik = genislik;
	}
	public double getYukseklik() {
		return yukseklik;
	}
	public void setYukseklik(double yukseklik) {
		this.yukseklik = yukseklik;
	}
}
