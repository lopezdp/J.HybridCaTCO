/**
 * David P. Lopez
 * COP2800
 * Bank Account Application
 */

package Hybrid;
import java.util.Scanner;

/**
 * 305.467.5719
 * @author david.lopez016@mymdc.net
 */
public class HybridCar {
    
    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        final int NOYEARS = 5;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What is the cost of the Hybrid Car?");
        double initialCost = scan.nextDouble();
        
        System.out.println("How many miles per year will you drive the car?");
        int mpy = scan.nextInt();
        
        System.out.println("What is the cost of a gallon of gas?");
        double gasPrice = scan.nextDouble();
        
        System.out.println("How many mpg does the car average?");
        double mpg = scan.nextDouble();
        
        System.out.println("What is the resell value of the car after 5 Years");
        double resalePrice = scan.nextDouble();
        
        double totalCost = initialCost + (((mpy * NOYEARS)/mpg) * gasPrice) - resalePrice;
        
        System.out.println("The total lifetime cost of the vehicle is: " + totalCost);     
        
    }
    
}
