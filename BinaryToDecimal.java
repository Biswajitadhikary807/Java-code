import java.util.Scanner;
public class BinaryToDecimal{
    public static void main(String []args){
        try (Scanner scnr = new Scanner(System.in)) {
            double G=6.673e-11;
            double M=5.98e24;
            double accelGravity;
            double distCenter;
            System.out.println("Enter the distance:");
            distCenter=scnr.nextDouble();
            accelGravity=(G*M)/(distCenter*distCenter);
             System.out.println(accelGravity);
        }
    }
}
