
import entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);

       Triangle x, y;
       x = new Triangle();
       y = new Triangle();

         System.out.println("Enter mesuare of triangle X:");
         x.a = sc.nextDouble();
         x.b = sc.nextDouble();
         x.c = sc.nextDouble();

         System.out.println("Enter mesuare of triangle Y:");
         y.a = sc.nextDouble();
         y.b = sc.nextDouble();
         y.c = sc.nextDouble();

         double areaX = x.area();
         double areaY = y.area();

         System.out.printf("Area of triangle X: %.4f%n", areaX);
         System.out.printf("Area of triangle Y: %.4f%n", areaY);

            if (areaX > areaY) {
                System.out.println("Triangle X has a larger area.");
            } else if (areaY > areaX) {
                System.out.println("Triangle Y has a larger area.");
            } else {
                System.out.println("Both triangles have the same area.");
            }

         sc.close();

    }
}