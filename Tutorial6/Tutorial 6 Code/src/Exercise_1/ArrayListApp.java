package Exercise_1;

/**
 * Write a description of class ArrayListApp here.
 * @author (nxthang) 
 * @version (1.0)
 * 
 */
public class ArrayListApp
{

    /**
     * Constructor for objects of class ArrayListApp
     */
    public ArrayListApp()
    {
    }

    public static void printList(ArrayList list)
    {
        int l=list.getLength();
        String str="";
        for (int i=1; i<l; i++)
        {
            str=str+list.get(i)+"-->";
        }
        str=str+list.get(l);
        System.out.println(str);
    }
    
    public static void main(String[]args)
    {
        ArrayList myList=new ArrayList();
        myList.add(1,100);
        myList.add(2,200);
        myList.add(3,300);
        myList.add(4,400);        
        System.out.println(myList.getLength());
        printList(myList);
        System.out.println("Is the list empty? " + myList.isEmpty());
        myList.removeAll();
        System.out.println("Is the list empty? " + myList.isEmpty());        
        myList.add(1,1000);
        myList.add(2,2000);        
        myList.add(3,3000);        
        myList.add(4,4000);                
        printList(myList);
        myList.remove(2);
        myList.remove(3);
        printList(myList);        
    }    
}
