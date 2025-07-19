package  application;
import java.util.Locale;
import java.util.Scanner;
import utils.CurrentConverter;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the current value of the dollar in reais: ");
        double dollarInReais = sc.nextDouble();
        System.out.println("Enter the amount in dollars you want to buy:");
        double amount = sc.nextDouble();
        double convertedAmount = CurrentConverter.convert(dollarInReais, amount, CurrentConverter.IOF);
        System.out.printf("Amount to be paid in reais = %.2f%n", convertedAmount);
    }
}