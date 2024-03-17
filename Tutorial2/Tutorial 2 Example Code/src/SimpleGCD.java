import java.util.Scanner;

public class SimpleGCD
{
    public static int GCD(int m, int n)
    {
        int i=n;
        while (i>1)
        {
            if (((m % i)==0) && ((n % i)==0))
                return i;
            i--;
        }
        return 1;
    }
    public static void main(String[]args)
    {
        int m,n;
        
        System.out.println("Please enter the integer m:");
        Scanner scanner = new Scanner(System.in);
        m=scanner.nextInt();        
        
        System.out.println("Please enter the integer n (n<=m):");
        n=scanner.nextInt();        
        
        System.out.println("The gcd("+ m + "," + n + ") is: " + GCD(m,n));
        scanner.close();
    }
    
}
