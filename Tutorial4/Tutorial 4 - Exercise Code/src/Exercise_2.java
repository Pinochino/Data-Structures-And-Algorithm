import java.util.Scanner;
import java.lang.String;

public class Exercise_2
{

    public static void print_student_list(String [] names, int [] marks)
    {
        int n=marks.length;
        System.out.println("");        
        System.out.println("The list of " + n +" students is");
        for (int i=0; i<n; i++)
            System.out.println("Name: "+names[i]+"  Mark: "+ marks[i]);
        System.out.println("");    
    }

    /**
     * This method employs Insertion sort to sort the list of N students by their mark
     */    
    public static void sort_student_by_mark(String [] names, int [] marks)
    {
        int n=marks.length;
        for (int j=1; j<n; j++)
        {
            int key=marks[j];
            String name=names[j];
            int i=j-1;
            while ((i>=0)&&(marks[i]<key))
            {
                marks[i+1]=marks[i];
                names[i+1]=names[i];
                i--;
            }
            marks[i+1]=key;
            names[i+1]=name;
        }
    }
    
    /**
     * This method shows the first M students from the sorted list
     */    
    public static void show_students(String [] names, int [] marks, int m)
    {
        System.out.println("The list of " + m +" students who has the highest mark is:");
        for (int i=0; i<m; i++)
            System.out.println("Name: "+names[i]+"  Mark: "+ marks[i]);

    }
    
    public static void main(String[]args)
    {
        int n,m;
        int [] marks;  
        String [] names;

        System.out.println("How many students in the list? ");
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();        
        System.out.println("Please input m: ");
        m=scanner.nextInt();               
        //Remove newline character after calling nextInt()
        String tmp=scanner.nextLine();            
        
        marks=new int[n];
        names=new String[n];
        
        for (int i=0; i<n; i++)
        {
            System.out.println("Please input the name and mark of student "+i+":");
            System.out.println("Name: ");
            names[i]=scanner.nextLine();
            System.out.println("Mark: ");            
            marks[i]=scanner.nextInt();
            //Remove newline character after calling nextInt()
            tmp=scanner.nextLine();            
        }               

        print_student_list(names,marks);
        
        sort_student_by_mark(names,marks);
        show_students(names,marks,m);
        scanner.close();

    }
    
}
