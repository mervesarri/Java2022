package multiDimensionalArrayDemo;

public class main {

	public static void main(String[] args) {
		String[][] sehirler = new String[5][5];
		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Kocaeli";
		sehirler[0][2] = "Yalova";
		sehirler[0][3] = "Bursa";
		sehirler[0][4] = "Bilecik";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Eskişehir";
		sehirler[1][3] = "Kayseri";
		sehirler[1][4] = "Sivas";
		sehirler[2][0] = "Elazığ";
		sehirler[2][1] = "Ardahan";
		sehirler[2][2] = "Erzurum";
		sehirler[2][3] = "Bingöl";
		sehirler[2][4] = "Muş";
		sehirler[3][0] = "Antalya";
		sehirler[3][1] = "Isparta";
		sehirler[3][2] = "Adana";
		sehirler[3][3] = "Mersin";
		sehirler[3][4] = "Burdur";
		sehirler[4][0] = "Rize";
		sehirler[4][1] = "Bayburt";
		sehirler[4][2] = "Trabzon";
		sehirler[4][3] = "Tokat";
		sehirler[4][4] = "Ordu";

		for (int i = 0; i <= 4; i++) {
			System.out.println("---------------------");
			for (int j = 0; j <= 4; j++) {
				System.out.println(sehirler[i][j]);
			}
		}
	}

}
