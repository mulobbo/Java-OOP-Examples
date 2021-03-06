package vucut_kitle_endeksi_oop;

public class VkeMetodlar {
	private double boy;
	private double kg;
	private String isim;
	private String soyisim;

	public VkeMetodlar() {

		System.out.println("metodu bo� ge�tiniz");
	}

	public VkeMetodlar(String isim, String soyisim, double boy, double kg) {
		this.isim = isim;
		this.soyisim = soyisim;
		this.boy = boy;
		this.kg = kg;

	}

	public String getDurum() {
		if (getIndex() <= 18) {
			return "ZAYIF";
		} else if (getIndex() <= 25) {
			return "NORMAL";
		} else if (getIndex() <= 30) {
			return "FAZLA K�LOLU";
		} else if (getIndex() <= 35) {
			return "���MAN";
		} else if (getIndex() <= 45) {
			return "A�IRI K�LOLU";
		} else {
			return "OBEZ";
		}

	}

	public double getIndex() {
		return Math.round(this.kg / ((this.boy / 100) * (this.boy / 100)));
	}

	public double getBoy() {
		return boy;
	}

	public void setBoy(double boy) {
		this.boy = boy;
	}

	public double getKg() {
		return kg;
	}

	public void setKg(double kg) {
		this.kg = kg;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;

	}
	public void getSonuc() {
		System.out.println("�sim :"+getIsim()+" Soyisim:"+getSoyisim()+" Kitle �ndexi: "+getIndex()+" Durumu: "+getDurum());
	}

}
