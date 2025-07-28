package application;

import entities.CalculateMatrix;
import entities.Matrix;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns for matrix: ");

        System.out.println("Number of rows: ");
        int numberOfRows = sc.nextInt();
        sc.nextLine();

        System.out.println("Number of columns: ");
        int numberOfColumns = sc.nextInt();
        sc.nextLine();

        Matrix matrix = new Matrix(numberOfColumns, numberOfRows);
        

        System.out.println("Enter all numbers for matrix: ");
        matrix.makeMatrix();
        matrix.printMatrix();

        System.out.println("Enter one number of your matrix to see how many equals and your neighbors:");
        int numberChoice = sc.nextInt();
        sc.nextLine();
        CalculateMatrix calc = new CalculateMatrix(matrix.getMatrix(), numberChoice);
        calc.printAllNeighbors();

        sc.close();
    }
}
