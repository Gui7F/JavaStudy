package JavaBasics.VetorExercicios.ex04_even_numbers.application;

import JavaBasics.VetorExercicios.ex04_even_numbers.utils.IsEven;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        // This program reads a specified number of integers from the user,
        // checks if each number is even, and counts how many even numbers were entered.
        // It also stores the even numbers in an array and prints them.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        int evenCount = 0;
        int[] evenNumbers = new int[size];

        for(int i =0 ; i < numbers.length; i++){
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
            sc.nextLine();

            if(IsEven.isEven(numbers[i])){
                evenNumbers[evenCount] = numbers[i];
                evenCount++;
            }

        }

        for(int i = 0; i < evenCount; i++) {
            System.out.println("Even number " + (i + 1) + ": " + evenNumbers[i]);
        }

        System.out.println("Total even numbers: " + evenCount);

        sc.close();
    }
}
