package recapDemo1;

public class main {

	public static void main(String[] args) {
		int sayi1 = 142;
		int sayi2= 143;
		int sayi3 = 144;
		int enBuyuk = sayi1;
		
		if(enBuyuk<sayi2){
			enBuyuk = sayi2;
		}
        if(enBuyuk<sayi3) {
        	enBuyuk = sayi3;
         }
        System.out.println("En büyük = "+enBuyuk);
	}

}
