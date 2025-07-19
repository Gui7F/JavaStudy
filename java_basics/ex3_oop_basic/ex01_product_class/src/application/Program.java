package src.application;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
    
    public static void main(String[] args){
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter product data:");
      System.out.print("Name: ");
      String name = sc.nextLine();
      System.out.print("Price:");
      double price = sc.nextDouble();
      System.out.print("Quantity in stock:");
      int quantity = sc.nextInt();

      Product product = new Product(name, price, quantity);

      System.out.println();
      System.out.print("Product data:" + product);
      System.out.println();
      System.out.println("Enter quantity to add in stock:");
      quantity =  sc.nextInt();
      product.addProducts(quantity);

      System.out.println();
      System.out.print("Updated data: " + product);
      System.out.println();
      
      System.out.println();
      System.out.println("Enter quantity to remove in stock");
      
      int removeQuantity = sc.nextInt();
      product.removeProducts(removeQuantity);
      System.out.println();
      System.out.print("Updated data: " + product);

      sc.close();
    }
}