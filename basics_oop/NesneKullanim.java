package basics_oop;

import java.util.Scanner;

public class NesneKullanim {
	public static void main(String[] args) {
		
		NesneTest nesneler=new NesneTest();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("ID YI YAZINIZ ");
		nesneler.setId(scan.nextInt());
		System.out.println("PARAYI GIRINIZ ");
	    nesneler.setPara(scan.nextInt());
	    System.out.println("*************************");
	    System.out.println("ID : "+nesneler.getId());
	    System.out.println("PARA : "+nesneler.getPara());
	    System.out.println("*************************************************");
	 
	    
	      NesneTest nesneler2=new NesneTest();
		System.out.println("ID YI YAZINIZ ");
	    nesneler2.setId(scan.nextInt());
		System.out.println("PARAYI GIRINIZ ");
	    nesneler2.setPara(scan.nextInt());
	    System.out.println("*************************");
	    System.out.println("ID 2 : "+nesneler2.getId());
	    System.out.println("PARA 2 : "+nesneler2.getPara());
	    
	    System.out.println("ID : "+nesneler.getId());
	    System.out.println("PARA : "+nesneler.getPara());
	    
	 
		
		
		
		
	}

}
