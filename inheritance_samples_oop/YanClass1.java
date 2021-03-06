package inheritance_samples_oop;


public class YanClass1 extends AnaClass {
	
	private double yukseklik;
	private double genislik;
	
	
	
	
	

	public double alanHesapla() {
		return genislik * yukseklik;
	}

	public double cevreHesapla() {
		return 2 * (genislik + yukseklik);
	}
	
	public void yazdir() {
		System.out.println("genislik ="+genislik+"uzunluk"+yukseklik+"");
		
		
	}

}
		
		

			
		

