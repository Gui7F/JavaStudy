import java.util.Locale;
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
         
        Locale.setDefault(Locale.US);
        
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Enter three integer numbers:");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt()

        System.out.println("Enter three double numbers:");
        double d1 = scanner.nextDouble(); 
        double d2 = scanner.nextDouble();
        double d3 = scanner.nextDouble();

        scanner.nextLine(); // Consume the newline character left by nextDouble()

        System.out.println("Enter three characters:");
        char c1 = scanner.next().charAt(0);
        char c2 = scanner.next().charAt(0);
        char c3 = scanner.next().charAt(0);

        System.out.println("Enter three strings without spaces:");
        String s1 = scanner.next(); 
        String s2 = scanner.next();
        String s3 = scanner.next();

        System.out.println("Enter one phase:");
        String phrase = scanner.nextLine();

        
        System.out.println("You entered:");
        System.out.println("Integers: " + n1 + ", " + n2 + ", " + n3);
        System.out.println("Doubles: " + d1 + ", " + d2 + ", " + d3);
        System.out.println("Characters: " + c1 + ", " + c2 + ", " + c3);
        System.out.println("Strings: " + s1 + ", " + s2 + ", " + s3);
        System.out.println("Phrase: " + phrase);


      scanner.close();
    }
}