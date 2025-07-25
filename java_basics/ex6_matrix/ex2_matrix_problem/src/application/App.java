package application;

import java.util.Scanner;
import entities.Matrix;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner();
        System.out.print("Enter the number of rows and columns for matrix: ");

        System.out.println("Number of rows: ");
        int numberOfRows = sc.nextInt();
        sc.nextLine();

        System.out.println("Number of columns: ");
        int numberOfColumns = sc.nextInt();
        sc.nextLine();

        Matrix matrix = new Matrix(numberOfColumns, numberOfRows);
        

        System.out.println("Enter all numbers for matrix: ");
        matrix.makeMatrix();

        System.out.print(matrix);
        

        
    }
}
