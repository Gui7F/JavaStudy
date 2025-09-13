package application;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import enums.WorkerLevel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class
App {
     public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name of department: ");
        String departmentName = sc.nextLine();

        System.out.print("Enter worker's name: ");
        String workerName = sc.nextLine();

        System.out.print("Enter worker's level (JUNIOR, MID_LEVEL, SENIOR): ");
        String workerLevel = sc.nextLine().toUpperCase();

        System.out.print("Enter worker's base salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(departmentName));

        System.out.print("How many contracts to this worker? : ");
        int numberOfContracts = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < numberOfContracts ; i++){
            System.out.print("Enter contract date (DD/MM/YYYY): ");
            String date = sc.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate contractDate = LocalDate.parse(date, formatter);
            System.out.print("Enter value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Enter duration (hours): ");
            int hours = sc.nextInt();
            sc.nextLine();
            worker.addContract(new HourContract(contractDate, valuePerHour, hours));
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.nextLine();
         int month = Integer.parseInt(monthAndYear.split("/")[0]);
         int year = Integer.parseInt(monthAndYear.split("/")[1]);
        double income = worker.income(year, month);

        System.out.printf("Name: %s%n", worker.getName());
        System.out.printf("Department: %s%n", worker.getDepartament());
        System.out.printf("Income for %02d/%d: %.2f%n", month, year, income);

        sc.close();
     }
}
