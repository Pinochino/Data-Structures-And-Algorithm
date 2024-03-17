/**
 * Class FasterPolyEvaluate provides a quick solution to evaluate the value of a polynomial of degree n.
 * The time complexity of this algorithm is O(N)
 */

import java.util.Scanner;

public class FasterPolyEvaluate
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
    
    public static double SimpleEvaluate(double [] c, double x)
    {
    	double s=0;
    	double p=1;
    	for(int i=0; i<c.length;i++)
    	{
    		s=s+p*c[i];
    		p=p*x;
    	}
    	return s;
    }
    
    public static double Evaluate(double [] c, double x)
    {
        double s=0;
        for (int i=c.length-1; i>=0; i--)
        {
            s=x*s+c[i];
        }
        return s; 
    }

    public static double RecEvaluate(double [] c, double x, int i)
    {
        //Base case
        if (i==c.length-1)
            return c[i];
        else
            return RecEvaluate(c,x,i+1)*x+c[i];
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
        System.out.println("Using SimpleEvaluate method, The value P(" + x + ") = " + SimpleEvaluate(c,x));
        System.out.println("Using Evaluate method, The value P(" + x + ") = " + Evaluate(c,x));
        System.out.println("Using a recursive method, the value P(" + x + ") = " + RecEvaluate(c,x,0));        
    }
}
