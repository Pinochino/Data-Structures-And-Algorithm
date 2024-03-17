/**
 * The program implements an O(n) algorithm to rearrange a input array so that,
 * every negative element goes to the left,
 * following is the zero element and then all the positive elements. 
 * 
 * @author (nxthang) 
 * @version (1.0)
 */
import java.util.Scanner;

public class Exercise_3
{

    public static void print_array(int [] a)
    {
        for (int i=0; i<a.length; i++)
        {
           System.out.print(a[i]+" ");
        }        
        System.out.println(" ");
    }

    /**
     * This method implement an O(n) algorithm to rearrange array a so that
     * the left part is the elements that is smaller than m,
     * the right part is the elements that is bigger than m.
     */    
    public static void Rearrange(int [] a, int m)
    {
        int left=0;
        int right=a.length-1;
        while (left<right)
        {
            while ((a[left]<m)&&(left<a.length))
                left++;
            while ((a[right]>m)&&(right>=0))
                right--;
            if (left<right)
            {
                int tmp=a[left];
                a[left]=a[right];
                a[right]=tmp;
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
        
        Rearrange(a,0);

        System.out.println("The rearranged array is : ");
        print_array(a);        
    }
}
