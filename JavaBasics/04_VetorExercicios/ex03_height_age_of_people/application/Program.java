package JavaBasics.VetorExercicios.ex03_height_age_of_people.application;

import JavaBasics.VetorExercicios.ex03_height_age_of_people.entites.Person;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter the number of people who will be on the list");
       int n = sc.nextInt();
       sc.nextLine(); // Consume the newline character
       
       Person[] people = new Person[n];

       for (int i = 0; i < people.length; i++) {
            System.out.printf("Enter the name of person %d: ", i + 1);
            String name = sc.nextLine();
            System.out.printf("Enter the age of person %d: ", i + 1);
            int age = sc.nextInt();
            System.out.printf("Enter the height of person %d: ", i + 1);
            double height = sc.nextDouble();
            sc.nextLine(); // Consume the newline character
            people[i] = new Person(name, age, height);  
        }
        
         System.out.println("List of people:");
        
        double sumOfHeight = 0.0;
        for(int i=0 ; i < people.length; i++){
             sumOfHeight += people[i].height();
        }

        double averageHeight = sumOfHeight / people.length;


        double percentageUnder16 = 0.0;
        String namesUnder16 = "";
        
        for (int i = 0; i < people.length; i++) {
            if (people[i].getAge() < 16) {
                namesUnder16 += people[i].getName() + " ";
                percentageUnder16++;
            }
        }

        double percentage = (double) percentageUnder16 / people.length * 100;
        System.out.printf("Average height: %.2f%n", averageHeight);
        System.out.printf("Percentage of people under 16 years old: %.1f%%%n", percentage);
        System.out.println("Names of people under 16 years old: " + namesUnder16.trim());
       
        sc.close();
    }
}
