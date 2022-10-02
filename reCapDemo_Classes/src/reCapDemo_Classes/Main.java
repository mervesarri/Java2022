package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int sonuc = dortIslem.Topla(8, 2);
		System.out.println(sonuc);

		int sonuc1 = dortIslem.Cıkar(8, 2);
		System.out.println(sonuc1);

		int sonuc2 = dortIslem.Carp(8, 2);
		System.out.println(sonuc2);

		int sonuc3 = dortIslem.Bolme(8, 2);
		System.out.println(sonuc3);
	}

}
