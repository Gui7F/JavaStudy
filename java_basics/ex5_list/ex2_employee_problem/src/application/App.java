package application;

import entities.Employee;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        
        int register [] = new int[n];

        Employee employe;

        List<Employee> employees = new java.util.ArrayList<>();
        
        for (int i = 0; i < register.length; i++) {
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            sc.nextLine(); // Consume the newline character
            employe = new Employee(id, name, salary);
            employees.add(employe);
        }

        System.out.println("List of employees:");
        System.out.println(employees);

        System.out.print("Enter the id of employee that will have salary increase: ");
        Integer id = sc.nextInt();

        Employee foundEmployee = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if(foundEmployee == null){
            System.out.print("This employee was not in the list");
        }else{
            System.out.print("Enter the percentage: ");
            int percent = sc.nextInt();
            foundEmployee.increaseSalary(percent);
        }
        
        System.out.print("List of employees updated");
        System.out.println(employees);

        sc.close();
    }
}
