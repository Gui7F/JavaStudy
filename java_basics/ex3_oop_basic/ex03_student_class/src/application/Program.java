package application;

import entities.Student;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter student name:");
        System.out.print("Name: ");
        student.name = sc.nextLine();

        System.out.println("Enter the grades for three periods:");
        System.out.println("Period 1: ");
        student.period1 = sc.nextDouble();
        System.out.println("Period 2: ");
        student.period2 = sc.nextDouble();
        System.out.println("Period 3: ");
        student.period3 = sc.nextDouble();

        System.out.println("\n" + student.toString());
        if(student.caculatePercetage() < 60.00) {
            System.out.println("You failed the course.");
            double missingPoints = 60.00 - student.caculatePercetage();
            System.out.printf("You need %.2f points to pass the course.%n", missingPoints);
        } else {
            System.out.println("You passed the course.");
        }

        sc.close();
    }
}
