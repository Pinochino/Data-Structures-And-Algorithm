import java.util.Scanner;

public class PolyEvaluate
{
    public static void print_poly(double [] c)
    {
        System.out.println("The polynomial is:");
        for (int i=c.length-1; i>0; i--)
        {
           if (i != 1) 
             System.out.print(c[i] + "*x^" + i + " + ");
           else
             System.out.print(c[i] + "*x" + " + ");
        }        
        System.out.println(c[0]);
    }
    
    public static double Evaluate(double [] c, double x)
    {
        double s=0;
        for (int i=0; i<c.length; i++)
        {
            double p=1;
            if (i != 0)
            {
                for (int k=1; k<=i; k++)
                    p=p*x;
            }
            s=s+c[i]*p;
        }
        return s;
    } 
    
    public static void main(String[]args)
    {
        int n;
        double [] c;
        double x;

        System.out.println("Please enter the degree n of the polynomial:");
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();        

        c=new double[n+1];
        
        for (int i=0; i<c.length; i++)
        {
            System.out.println("Please enter the coefficient c["+i+"]:");
            c[i]=scanner.nextDouble();
        }        
        print_poly(c);
        
        System.out.println("Please enter the value of x:");
        x=scanner.nextDouble();
        
        System.out.println("The value P(" + x + ") = " + Evaluate(c,x));
    }
}
