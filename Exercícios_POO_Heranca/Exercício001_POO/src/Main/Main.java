package Main;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the product data:" );
		System.out.println("Name:");
		String name = sc.nextLine();
		System.out.println("Price: ");
		double price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		System.out.println();
		System.out.println(product.toString() );
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + quantity);
		sc.close();
		
	}

}
