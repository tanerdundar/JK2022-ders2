package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade oranı";

		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("bilmemne1.jpg");

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(9);
		product2.setUnitPrice(4500);
		product2.setUnitsInStock(6);
		product2.setImageUrl("bilmemne2.jpg");

		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(11);
		product3.setUnitPrice(8500);
		product3.setUnitsInStock(5);
		product3.setImageUrl("bilmemne3.jpg");

		Product[] products = { product1, product2, product3 };

		System.out.println("<ul>");

		for (Product product : products) {

			System.out.println("<li>" + product.getName() + "</li>");

		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhoneNumber("05222222222");
		individualCustomer.setCustomerNumber("1235");
		individualCustomer.setFirstName("Taner");
		individualCustomer.setLastName("Dundar");
		
		CoorporateCustomer coorporateCustomer = new CoorporateCustomer();
		coorporateCustomer.setId(2);
		coorporateCustomer.setCompanyName("Kodlama.io");
		coorporateCustomer.setPhoneNumber("05666666666");
		coorporateCustomer.setTaxNumber("12345623512");
		coorporateCustomer.setCustomerNumber("63594");
		
		Customer [] customers = {individualCustomer,coorporateCustomer};
		

	}

}
