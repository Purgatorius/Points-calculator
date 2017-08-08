import java.util.Scanner;

/**
 * Created by B4RT on 2017-08-08.
 */
public class Zadanie3 {
    public static void main (String[] args)
    {
        System.out.println("This is a program designed to calculate the final score for a three groups of points with different weights.");
        System.out.println("We have got points for a style, effects and the result");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the points for a style: ");
        double style = scanner.nextDouble() * 0.2;

        System.out.println("Please enter the points for the effects: ");
        double effects = scanner.nextDouble() * 0.3;

        System.out.println("Please enter the points for a style: ");
        double rezult = scanner.nextDouble() * 0.5;

        double sum;
        sum = style + effects + rezult;
        sum *= 100; //rounding the result
        sum = Math.round(sum);
        sum /= 100;



        System.out.println("The final score is: ");
        System.out.println(sum);



    }
}
