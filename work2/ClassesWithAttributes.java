package work2;

public class ClassesWithAttributes {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.id = 1;
		product.name = "Laptop";
		product.destcription = "Casper Laptop";
		product.price = 7500;
		product.stockAmount = 10;
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		

	}

}
