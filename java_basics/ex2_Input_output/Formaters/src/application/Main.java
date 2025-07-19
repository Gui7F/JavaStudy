package application;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Define o locale para US, para usar ponto como separador decimal
        //Vamos fazer um exercicios para praticar saida de dados em java 
        // Vamos criar variaveis e concatena-las para exibir na tela
        // Vamos utilizar o System.out.printlf para mostrar elas formatadas
        // Vamos utilizar os marcadores de formatação para exibir os valores corretamente
        // Vamos utilizar o %s para String, %d para inteiro, %f para double e %.2f para double com duas casas decimais

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;
        System.out.printf("""
                          Products:
                          %s, which price is $%.2f
                          %s, which price is $%.2f
                          Record: %d years old, code %d and gender %c
                          Measure with eight decimal places: %.8f
                          Rounded (three decimal places): %.2f
                          US decimal point: %.2f
                          """,
                product1, price1, product2, price2, age, code, gender, measure, measure, measure
        );

    }
}
