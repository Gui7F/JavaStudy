package VetorExercicios.ex02_negative_numbers.application;
//Program to read a vector of numbers and print the negative ones with their positions.
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter the size of the number vector:");
       int n = sc.nextInt();
       double[] vector = new double[n];

       for (int i = 0; i < n; i++){
              System.out.print("Enter a number for position " + i + ": ");
              vector[i] = sc.nextDouble();
       }

       for (int i = 0; i < n; i++){
              if (vector[i] < 0) {
                  System.out.printf("Negative number at position %d: %.1f%n", i, vector[i]);
              }
       }

       sc.close();
       System.out.println("End of program.");
       System.out.println("Thank you for using the program!");
       System.out.println("Goodbye!");
    }
}
