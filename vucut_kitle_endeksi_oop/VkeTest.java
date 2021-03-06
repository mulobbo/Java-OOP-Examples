package vucut_kitle_endeksi_oop;

import java.util.Scanner;

public class VkeTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("AD GIRINIZ:");
			String ad = scan.nextLine();
			System.out.println("SOYAD GIRINIZ:");
			String soyad = scan.nextLine();
			System.out.println("BOY GIRINIZ(cm):");
			double boy = scan.nextDouble();
			System.out.println("KILO GIRINIZ(kg) :");
			double kg = scan.nextDouble();
			VkeMetodlar yeni1 = new VkeMetodlar(ad, soyad, boy, kg);
			yeni1.getSonuc();
			
		}
	}

}
