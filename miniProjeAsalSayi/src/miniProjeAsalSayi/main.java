package miniProjeAsalSayi;

public class main {

	public static void main(String[] args) {
		String scan = new String();
		int sayi = 23;
		int sayac = 0;
		int i = 2;

		while (i < sayi) {
			if (sayi % i == 0) {
				sayac++;
			}
			i++;
		}
		if (sayac == 0) {
			System.out.println(sayi + " Asal bir sayidir.");
		} else {
			System.out.println(sayi + " Asal bir sayi degildir.");
		}

	}

}
