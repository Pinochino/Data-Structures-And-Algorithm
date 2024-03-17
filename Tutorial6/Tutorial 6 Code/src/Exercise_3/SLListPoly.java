package Exercise_3;


/**
 * Class SLListPoly implement a linked-list data structure that is used to store a polynomial.
 * @author (nxthang) 
 * @version (1.0)
 * 
 */
public class SLListPoly
{
    private SLNodePoly head;

    /**
     * Constructor for objects of class SLListPoly.
     * This constructor will create an empty list.
     */
    public SLListPoly()
    {
        head=null;
    }

    /**
     * This operation returns true if the list is empty, otherwise it returns false
     */

    public boolean isEmpty()
    {
        if (head==null)
            return true;
        else
            return false;
    }

    /**
     * This operation adds a newNode into the beginning of the list
     */
    
    public void add(SLNodePoly newNode)
    {
        newNode.setNext(head);
        head=newNode;
    }

    /**
     * This is a private operation (supplementary operation). It returns the node at the pos position of the list.
     */    
    private SLNodePoly traversing(int pos)
    {
        int count=1;
        SLNodePoly current = head;
        while (count < pos)
        {
            count++;
            current=current.getNext();
        }
        return current;
    }

    /**
     * This operation adds a newNode right after the pos position of the list.
     */    
    public void addAt(int pos, SLNodePoly newNode)
    {
        SLNodePoly posNode=traversing(pos);
        newNode.setNext(posNode.getNext());
        posNode.setNext(newNode);
    }

    /**
     * This operation delete the node at the pos postition of the list.
     */    
    public void remove(int pos)
    {
        if (!isEmpty())
        {
            if (pos == 1)
            {
                head=head.getNext();
            }
            else
            {
                SLNodePoly prevNode=traversing(pos-1);
                SLNodePoly posNode=prevNode.getNext();
                prevNode.setNext(posNode.getNext());
            }            
        }
    }

    /**
     * This operation remove all nodes from the list.
     */    
    public void removeAll()
    {
        head=null;
    }

    /**
     * This operation returns the node at the pos position of the list.
     */    
    public SLNodePoly get(int pos)
    {
        if (!isEmpty())
            return traversing(pos);
        else
            return null;
    }

    /**
     * This operation returns the current length of the list. 
     */    
    public int getLength()
    {
        int count=0;
        SLNodePoly current=this.head;
        while (current != null)
        {
            count++;
            current=current.getNext();
        }
        return count;
    }

    /**
     * This operation evaluate the first derivative of the polynomial. 
     */    
    public void derivative()
    {
        SLNodePoly current= head;
        while (current != null)
        {            
            current.derivative();
            current=current.getNext();            
        }        
    }
}
