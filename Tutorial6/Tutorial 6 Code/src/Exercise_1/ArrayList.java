package Exercise_1;

/**
 * Class ArrayList implements an array-based list data structure. Each element of the list is an integer.
 * Please refer to Lecture 6 for the array-based list ADT in detail. 
 * @author (nxthang) 
 * @version (1.0)

 */
public class ArrayList
{
    private int[] items;
    private static final int maxSize=100;
    private int length;
    /**
     * Constructor for objects of class ArrayList.
     * This constructor creates an empty list.
     */
    public ArrayList()
    {
        items=new int[maxSize];
        length=0;
    }
    
    public boolean isEmpty()
    {
        if (length==0)
            return true;
        else
            return false;
    }
    
    public int getLength()
    {
        return length;
    }
    
    public void add(int pos, int newItem)
    {
        if (length<maxSize)
        {
            length++;
            for (int i=length-1; i>pos; i--)
                items[i]=items[i-1];
            items[pos-1]=newItem;
        }
    }
    
    public void remove(int pos)
    {
        for (int i=pos-1;i<length-1;i++)
            items[i]=items[i+1];
        length--;
    }
    
    public void removeAll()
    {
        length=0;
    }
    
    public int get(int pos)
    {
        return items[pos-1];
    }
}
