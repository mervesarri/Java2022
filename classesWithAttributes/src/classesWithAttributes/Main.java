package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.name = "Telefon";
		product.id = 13;
		product.description = "Samsung Telefon";
		product.price = 8599;
		product.stockAmount = 6;

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
	}

}
