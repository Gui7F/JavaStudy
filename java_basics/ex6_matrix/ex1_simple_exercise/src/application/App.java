// Este exercicio constiste em criar uma matrix por input de dado
// printar a diagonal principal e tambem os numeros negativos presentes se houver
package application;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter para uma matriz quadratica ou seja NxN: " );
        int n = sc.nextInt();
        sc.nextLine();

        int [][] matrix = new int [n][n];

        //Vamos percorre preencher os dados da matrix por input
        System.out.println("Digite todos os numeros da matrix NxN: ");
        for(int i = 0 ; i < matrix.length ; i++ ){ //Percorre as linhas;
           for(int j = 0 ; j < matrix[i].length ; i++){ //Percorre as colunas.
                 int element = sc.nextInt();   
                 matrix[i][j] = element; //Adiciona em cada posição                     
           }
        }

        System.out.print("A diagonal principal tem os seguintes elementos: ");
        for(int i = 0 ; i < matrix.length ; i++){
            System.out.print(matrix[i][i]);
        }
    }
}
