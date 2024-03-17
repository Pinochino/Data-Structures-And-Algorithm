/**
 * The program rearranges a input array so that,
 * every negative element goes to the left,
 * following is the zero element and then all the positive elements. 
 * 
 * @author (nxthang) 
 * @version (1.0)
 */
import java.util.Scanner;

public class Exercise_1
{

    public static void print_array(int [] a)
    {
        for (int i=0; i<a.length; i++)
        {
           System.out.print(a[i]+" ");
        }        
        System.out.println(" ");
    }
    
    public static void Bubble_Sort(int [] a)
    {
        Boolean isSorted = false;
        while (!isSorted)
        {
            isSorted=true;
            for (int i=0; i<a.length-1; i++)
                if (a[i]>a[i+1])
                {
                    int tmp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=tmp;
                    isSorted=false;
                }
        }
    }
    
    public static void main(String[]args)
    {
        int n;
        int [] a;  

        System.out.println("Please input the integer N:");
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();        

        a=new int[n];
        
        for (int i=0; i<n; i++)
        {
            System.out.println("Please input the integer a["+i+"]:");
            a[i]=scanner.nextInt();
        }        
        
        System.out.println("The input array is : ");
        print_array(a);
        
        Bubble_Sort(a);

        System.out.println("The rearranged array is : ");
        print_array(a);        
    }
}
