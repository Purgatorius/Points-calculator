import java.util.Scanner;

/**
 * Created by B4RT on 2017-06-07.
 */
public class Main {
    public static void main(String[] args)
    {
        System.out.println("This is the program that calculate points. We've got points for the style, effects and result-each one is a different weight point");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Style: ");
        double styl = scanner.nextDouble() * 0.2;
        
        System.out.println("Effects: ");
        double effects = scanner.nextDouble() * 0.3;
        
        System.out.println("Result: ");
        double result = scanner.nextDouble() * 0.5;
        
        double suma = styl + effects + result;
        System.out.println("_____________________");
        System.out.println("Ok, the sum of the points is: ");
        System.out.println(suma);
    }
}
