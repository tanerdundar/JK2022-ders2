package javademos.classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		

        Product product = new Product(1, "Laptop", "Asus x550vx-dm277dc", 3650, 3,
                "Gri");
        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Laptop");
        product2.setDescription("Monster xxx");
        product2.setPrice(9000);
        product2.setStockAmount(12);

        ProductManager productManager = new ProductManager();
        productManager.add(product);
        System.out.println("Ürün Kodu: " + product.getKod());
        System.out.println("Ürün Kodu: " + product2.getKod());

	}

}
