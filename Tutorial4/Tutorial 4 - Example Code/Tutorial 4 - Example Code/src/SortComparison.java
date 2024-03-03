import java.util.Random;

public class SortComparison
{

    public static void print_array(int [] a)
    {
        for (int i=0; i<a.length; i++)
        {
           System.out.print(a[i]+" ");
        }        
        System.out.println(" ");
    }
    
    public static void Selection_Sort(int [] a)
    {
        for (int i=a.length-1; i>0; i--)
        {
            int max=a[i];
            int pos=i;
            for(int j=i-1; j>=0; j--)
            {
                if (max<a[j])
                {
                    max=a[j];
                    pos=j;        
                }
            }
            a[pos]=a[i];
            a[i]=max;
        }
    }
    
    public static void Insertion_Sort(int [] a)
    {
        for (int j=1; j<a.length; j++)
        {
            int key=a[j];
            int i=j-1;
            while ((i>=0)&&(a[i]>key))
            {
                a[i+1]=a[i];
                i=i-1;
            }
            a[i+1]=key;
        }
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
    
    public static void Merge(int [] a, int left, int mid, int right)
    {
        int [] c;
        c = new int[right - left+1];
        int i=left;
        int j=mid+1;
        int k=0;

        while ((i<=mid)&&(j<=right))
        {
            if (a[i]<a[j])
            {
                c[k]=a[i];
                i++;
            }
            else
            {
                c[k]=a[j];
                j++;
            }
            k++;
        }
        
        for (int t=i;t<=mid;t++)
        {
            c[k]=a[t];
            k++;
        }
        
        for (int t=j;t<=right;t++)
        {
            c[k]=a[t];
            k++;
        }               

        for (int t=0;t<k;t++)
            a[left+t]=c[t];        
    }
    
    public static void Merge_Sort(int [] a, int left, int right)
    {
        if (left < right)
        {
            int mid = (left + right)/2;
            Merge_Sort(a,left,mid);
            Merge_Sort(a,mid+1,right);
            Merge(a,left,mid,right);
        }
    }
        
    public static void main(String[]args)
    {
        int n;
        int [] data; 
        int [] a;

        n=100000;
        data=new int[n];
        a=new int[n];       
        
        Random rand = new Random(); 
        for (int i=0; i<n; i++)
        {
            data[i]=rand.nextInt(65000) + 1;
        }        
        
        for (int i=0; i<n; i++)
        {
            a[i]=data[i];
        }        

        long startTime, stopTime, elapsedTime;

        System.out.println("Sorting a list of "+n+" random integers using Selection sort algorithm ...");
        startTime=System.currentTimeMillis();
        Selection_Sort(a);
        stopTime=System.currentTimeMillis();
        elapsedTime=stopTime - startTime;
        System.out.println("Algorithm took : " + elapsedTime + " milliseconds to finish");
        //System.out.println("The list of sorted integers is: ");       
        //print_array(a);        

        for (int i=0; i<n; i++)
        {
            a[i]=data[i];
        }                
        System.out.println("Sorting a list of "+n+" random integers using Insertion sort algorithm ...");
        startTime=System.currentTimeMillis();
        Insertion_Sort(a);
        stopTime=System.currentTimeMillis();
        elapsedTime=stopTime - startTime;
        System.out.println("Algorithm took : " + elapsedTime + " milliseconds to finish");    

        for (int i=0; i<n; i++)
        {
            a[i]=data[i];
        }                
        System.out.println("Sorting a list of "+n+" random integers using Bubble sort algorithm ...");
        startTime=System.currentTimeMillis();
        Insertion_Sort(a);
        stopTime=System.currentTimeMillis();
        elapsedTime=stopTime - startTime;
        System.out.println("Algorithm took : " + elapsedTime + " milliseconds to finish");
   
        
        for (int i=0; i<n; i++)
        {
            a[i]=data[i];
        }                
        System.out.println("Sorting a list of "+n+" random integers using Merge sort algorithm ...");
        startTime=System.currentTimeMillis();
        Merge_Sort(a,0,n-1);
        stopTime=System.currentTimeMillis();
        elapsedTime=stopTime - startTime;
        System.out.println("Algorithm took : " + elapsedTime + " milliseconds to finish");
        
    }        
}
