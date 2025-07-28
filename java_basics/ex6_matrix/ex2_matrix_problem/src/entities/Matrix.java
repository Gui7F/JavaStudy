package entities;
import java.util.Scanner;

public class Matrix {
    private int rows;
    private int columms;
    private int [][] matrix;

    public Matrix(int columms, int rows){
        this.rows = rows;
        this.columms = columms;
    }

    public int getRows(){
        return rows;
    }
    
    public int getColumms(){
        return columms;
    }

    public int[][] getMatrix(){
        return matrix;
    }

    public void makeMatrix(){
        matrix = new int[getRows()][getColumms()];
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < matrix.length; i++){
            for (int j = 0 ; j < matrix[i].length; j++ ){
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public void printMatrix() {
        System.out.println("Your matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}