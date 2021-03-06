package inheritance_samples_oop;

public class OverridingDeneme {
	public static void main(String[] args) {
		A ametod = new A();
		System.out.println(ametod.p(123.1));
		System.out.println(ametod.p(123));
		System.out.println(ametod.yeni("seni seviyorum"));
	}

}

class B {
	public double p (double i) {
		return i*2 ;

	}
	public String yeni (String metin) {
		return metin+" orjinal super metod " ;

	}

}

class A extends B {
	public String yeni (String metin) {
		return super.yeni(metin)+"||"+metin+" burda override ettik " ;

	}
	
	@Override
	public double p(double i) {
		return super.p(i)+5;
	}
}
