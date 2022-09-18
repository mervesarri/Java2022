package arraysDemo;

public class main {

	public static void main(String[] args) {
		String ogrenci1 = "Merve";
		String ogrenci2 = "Ensar";
		String ogrenci3 = "Ertuğrul";
		String ogrenci4 = "Hamza";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("------------");

		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Merve";
		ogrenciler[1] = "Ensar";
		ogrenciler[2] = "Ertuğrul";
		ogrenciler[3] = "Hamza";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}

		System.out.println("------------");

		// Kodun farklı versiyonu
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}

	}

}
