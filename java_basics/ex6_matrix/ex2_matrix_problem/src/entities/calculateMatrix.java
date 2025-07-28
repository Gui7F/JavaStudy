package entities;

import java.util.ArrayList;
import java.util.List;

public class CalculateMatrix {
    private int[][] matrix;
    private int numberChoice;

    public CalculateMatrix(int[][] matrix, int numberChoice) {
        this.matrix = matrix;
        this.numberChoice = numberChoice;
    }

    public List<int[]> getAllPositions() {
        List<int[]> positions = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == numberChoice) {
                    positions.add(new int[]{i, j});
                }
            }
        }

        return positions;
    }

    public void calculateTopElement(int[] position) {
        int row = position[0];
        int col = position[1];

        if (row > 0) {
            int top = matrix[row - 1][col];
            System.out.println("Top Element: " + top);
        } else {
            System.out.println("Top Element: N/A");
        }
    }

    public void calculateRightElement(int[] position) {
        int row = position[0];
        int col = position[1];

        if (col + 1 < matrix[row].length) {
            int right = matrix[row][col + 1];
            System.out.println("Right Element: " + right);
        } else {
            System.out.println("Right Element: N/A");
        }
    }

    public void calculateLeftElement(int[] position) {
        int row = position[0];
        int col = position[1];

        if (col > 0) {
            int left = matrix[row][col - 1];
            System.out.println("Left Element: " + left);
        } else {
            System.out.println("Left Element: N/A");
        }
    }

    public void calculateBottomElement(int[] position) {
        int row = position[0];
        int col = position[1];

        if (row + 1 < matrix.length) {
            int bottom = matrix[row + 1][col];
            System.out.println("Bottom Element: " + bottom);
        } else {
            System.out.println("Bottom Element: N/A");
        }
    }

    public void printAllNeighbors() {
        List<int[]> positions = getAllPositions();

        for (int[] pos : positions) {
            int row = pos[0];
            int col = pos[1];
            System.out.println("Posição encontrada: (" + row + ", " + col + ")");
            calculateRightElement(pos);
            calculateLeftElement(pos);
            calculateTopElement(pos);
            calculateBottomElement(pos);
            System.out.println();
        }
    }
}

