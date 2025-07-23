// Este exercicio constiste em criar uma matrix por input de dado
// printar a diagonal principal e tambem os numeros negativos presentes se houver
package application;

import java.util.Scanner;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tamanho de N ou seja uma matriz NxN: " );

        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        //Vamos percorre preencher os dados da matrix por input
        System.out.println("Digite todos os numeros da matrix NxN: ");
        for(int i = 0 ; i < matrix.length ; i++ ){ //Percorre as linhas;
           for(int j = 0 ; j < matrix[i].length ; j++){ //Percorre as colunas.  
                 matrix[i][j] = sc.nextInt(); //Adiciona em cada posição                     
           }
        }

        System.out.print("A diagonal principal tem os seguintes elementos: ");
        for(int i = 0 ; i < matrix.length ; i++){
            System.out.print(matrix[i][i] + " ");
        }


        
        
        List <Integer> numberNegatives = new java.util.ArrayList<>();

        for(int i = 0 ; i < matrix.length ; i++){
            for (int j = 0 ; j < matrix[i].length; j++ ){
               if (matrix[i][j] < 0) {
                 numberNegatives.add(matrix[i][j]);
               }
            }
        }

        System.out.println("Os numeros negativos são estes: ");
        System.out.print(numberNegatives);



        sc.close();
    }
}
