package entities;

public class Matrix {
    private int rows;
    private int columms;

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

    public void makeMatrix(){
        int[][] matrix = new int[getRows()][getColumms()];

        for(int i = 0 ; i < getRows(); i++){
            for (int j = 0 ; j < getColumms(); j++ ){
                matrix[i][j] = sc.nextInt();
            }
        }
    }


}