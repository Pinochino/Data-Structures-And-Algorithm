/**
 * The greatest common divisor (gcd) of two integers is the largest integer that divides both.
 * For example the gcd(50,15)=5. 
 * The class FasterGCD presents algorithms to compute quickly the value of gcd(M,N), assumming M>=N.
 * The time complexity of the algorithm is O(logN)
 * 
 * @author (nxthang) 
 * @version (1.0)
 */

import java.util.Scanner;

public class FasterGCD
{
    /**
     * Constructor for objects of class FasterGCD
     */
    public FasterGCD()
    {
    }

    //gcd(m,n) = gcd(n,m%n)
    public static int RecGCD(int m, int n)
    {
        //Base case
        if (n == 0)
            return m;
        else
            return RecGCD(n,m % n);
    }
    public static void main(String[]args)
    {
        int m,n;
        System.out.println("Please enter the integer m:");
        Scanner scanner = new Scanner(System.in);
        m=scanner.nextInt();        
        
        System.out.println("Please enter the integer n (n<=m):");
        n=scanner.nextInt();        
        
        System.out.println("The gcd("+ m + "," + n + ") is: " + RecGCD(m,n));
        scanner.close();
    }
    
}
