/**
 * Class FasterSearch implements the Binary Search algorithm (iterative and recursive versions)
 * The time complexity of this algorithm is O(logN)
 * 
 */

import java.util.Scanner;

public class FasterSearch
{

//iterative binary search    
	
    public static int Search(int [] a, int m, int left, int right)
    {
        while (left <= right)
        {
            int mid = (int) ((left + right)/2);
            if (a[mid] == m)
                return mid;
            else
            {
                if (m < a[mid])
                    right=mid-1;
                else
                    left=mid+1;
            }            
        }
        return -1;        
    }

//recursive binary search   
    
    public static int RecSearch(int []a, int m, int left, int right)
    {
        
        if (left > right)
            return -1;
        else
        {
            int mid = (int) ((left + right)/2);

            if (a[mid] == m)
                return mid;
            else
            {
                if (m < a[mid])
                    return (RecSearch(a,m,left,mid-1));
                else
                    return (RecSearch(a,m,mid+1,right));
            }
        }
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
        
        System.out.println("Please enter the integer m for searching:");
        m=scanner.nextInt();                
        
        System.out.println("The search result is (using iterative version): " + Search(a,m,0,a.length-1));
        System.out.println("The search result is (using recursive version): " + RecSearch(a,m,0,a.length-1));        
    }
}
