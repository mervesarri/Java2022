package methodOverloading;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		System.out.println("2+3=" + dortIslem.Topla(2, 3));
		System.out.println("2+3+5=" + dortIslem.Topla(2, 3, 5));

	}

}
