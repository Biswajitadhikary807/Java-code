//importing the Java Scanner class
import java.util.Scanner;

public class Percentages2 {

    public static void main(String[] args) {
        //using the object of Scanner class
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        //calling the method of nextDouble() to take user input at the runtime
        double n1 = in.nextDouble();
        System.out.print("Enter second number: ");
            //calling the method of nextDouble() to take user input at the runtime
        double n2 = in.nextDouble();
        //calling the method to compute the percentage
        computePercent(n1, n2);
    }
     //method to determinig the percentage of double x to double y .
    public static void computePercent(double x, double y) {
        System.out.println(x + " is " + ((x/y)*100) + " percent of " + y);
    }
}
