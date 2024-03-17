package Exercise_2;


/**
* Write a description of class SLListApp here.
* @author (nxthang) 
* @version (1.0)
* 
*/
public class SLListApp
{
/**
 * Constructor for objects of class SLListApp
 */
	public SLListApp()
	{
	}

	public static void printList(SLList list)
	{
	    int l=list.getLength();
	    String str="";
	    for (int i=1; i<l; i++)
	    {
	        SLNode aNode=list.get(i);
	        str=str+aNode.getData()+" <-- ";
	    }
	    SLNode aNode=list.get(l);
	    str=str+aNode.getData();
	    System.out.println(str);
	}
	public static void main(String[]args)
	{
	    SLList myList=new SLList();
	    myList.add(new SLNode("The First String"));
	    myList.add(new SLNode("The Second String"));
	    myList.add(new SLNode("The Third String"));        
	    myList.add(new SLNode("The Forth String"));                
	    printList(myList);
	    myList.addAt(3,new SLNode("ABC"));    
	    printList(myList);
	    myList.remove(4);
	    printList(myList);
	    myList.removeAll();
	    myList.add(new SLNode("1st new string"));
	    myList.add(new SLNode("2nd new string"));
	    myList.add(new SLNode("3rd new string"));
	    myList.add(new SLNode("4th new string"));
	    myList.add(new SLNode("5th new string"));        
	    printList(myList);
	    String data="2nd new string";
	    System.out.println("Searching for: "+data);
	    System.out.println("Result: "+myList.search(data));        
	    String data1="new string";
	    System.out.println("Searching for: "+data1);
	    System.out.println("Result: "+myList.search(data1));        
	    
	}    
}
