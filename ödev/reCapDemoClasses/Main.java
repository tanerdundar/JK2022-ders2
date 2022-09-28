package javademos.reCapDemoClasses;

public class Main {

	public static void main(String[] args) {
		
        DortIslem dortislem = new DortIslem();
        int toplama = dortislem.topla(8, 10);
        System.out.println("Toplama: " + toplama);
        int bolme = dortislem.bol(42, 7);
        System.out.println("Bolme: " + bolme);
        int carpma = dortislem.carp(6, 0);
        System.out.println("Carpma: " + carpma);
        int cikarma = dortislem.cikar(9, 5);
        System.out.println("Cikarma: " + cikarma);



	}

}
