package VetorExercicios.ex05_highest_position.application;

import java.util.Locale;
import java.util.Scanner;
import VetorExercicios.ex05_highest_position.utils.GetHighestNumber;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter quantity of numbers:");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for(int i = 0 ; i < numbers.length; i++){
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        

        GetHighestNumber.Result getHighestNumber = GetHighestNumber.getHighestPosition(numbers);
        System.out.println("Highest value: " + getHighestNumber.value);
        System.out.println("Position of highest value: " + getHighestNumber.position);
        
        
        sc.close();
    }
}
