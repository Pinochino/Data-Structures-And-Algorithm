import java.util.Scanner;

public class SimplePow
{
    public static double Pow(double x, int n)
    {
        double s=1;
        if (n == 0)
            return s;
        for (int i=1; i<=n; i++)
            s=s*x;
        return s;
    } 
    public static void main(String[]args)
    {
        int n;
        double x;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value of x:");
        x=scanner.nextDouble();
        
        System.out.println("Please enter the degree n:");
        n=scanner.nextInt();        

        System.out.println("The value of (" + x + ")^" + n + " is: " + Pow(x,n));
    }
    
}
