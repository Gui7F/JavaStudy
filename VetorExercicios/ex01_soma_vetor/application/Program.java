// This code is part of a Java application that calculates the sum and average of a vector of numbers.
package  VetorExercicios.ex01_soma_vetor.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Enter the size of the number vector: ");
        int n = sc.nextInt();
        double[] vector = new double[n];

        for(int i = 0 ; i < vector.length; i++){
            System.out.print("Enter a number for position " + i + ": ");
            vector[i] = sc.nextDouble();
        }
        
        double sum = 0.0;
        for(int i = 0 ; i < vector.length; i++){
            sum += vector[i];
        }

        double average = sum / vector.length;

        System.out.println("The sum of the numbers is: " + sum);
        System.out.printf("Average of the numbers: %.2f%n", average);
        
        sc.close();
    }
}
