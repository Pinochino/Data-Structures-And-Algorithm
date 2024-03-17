import java.util.Scanner;

public class SimpleSearch
{
    public static void print_array(int [] a)
    {
        for (int i=0; i<a.length; i++)
        {
           System.out.print(a[i]+" ");
        }        
        System.out.println(" ");
    }
    
    public static int Search(int [] a, int m)
    {
        for (int i=0; i<a.length; i++)
          if (a[i] == m)
            return i;
        return -1;
    }
    
    public static void main(String[]args)
    {
        int n,m;
        int [] a;  

        System.out.println("Please enter the integer n:");
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();        

        a=new int[n];
        
        for (int i=0; i<a.length; i++)
        {
            System.out.println("Please enter the integer a["+i+"]:");
            a[i]=scanner.nextInt();
        }        
        print_array(a);//O(n)
        System.out.println("Please enter the integer m for searching:");
        m=scanner.nextInt();                
        
        System.out.println("The search result is: " + Search(a,m));//O(n)
        scanner.close();
    }
}
