package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class SobrecargaDeConstrutor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		//String name = sc.nextLine();
		String name = "TV";
		System.out.print("Price: ");
		//double price = sc.nextDouble();
		double price = 900;
		
		Product product = new Product(name, price);
		
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		//int quantity = sc.nextInt();
		int quantity = 10;
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		//quantity = sc.nextInt();
		quantity = 5;
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		sc.close();

	}

}
