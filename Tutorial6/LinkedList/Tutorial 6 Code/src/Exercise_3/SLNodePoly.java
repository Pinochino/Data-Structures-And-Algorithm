package Exercise_3;

/**
 * Class SLNodePoly implement an elements (a node) of a linked-list data structure.
 * Each element of the list contains: 
 *  - data: an integer (degree) and a real number (coefficient)
 *  - link: a reference variable named next.
 * @author (nxthang) 
 * @version (1.0)
 */
public class SLNodePoly
{
    private int degree;
    private float coeff;
    private SLNodePoly next;

    /**
     * Constructor for objects of class SLNode
     * This constructor create a node from an input string (data)
     */
    public SLNodePoly(float coeff, int degree)
    {
        this.coeff=coeff;
        this.degree=degree;
    }

    /**
     * This operation sets the next reference to the node specify in the parameter (next)
     */    
    public void setNext(SLNodePoly next)
    {
        this.next=next;
    }

    /**
     * This operation return the next reference
     */    
    public SLNodePoly getNext()
    {
        return this.next;
    }

    /**
     * This operation assigns the degree of the node to the input value
     */        
    public void setDegree(int degree)
    {
        this.degree=degree;
    }

    /**
     * This operation assigns the coefficient of the node to the input value
     */        
    public void setCoeff(float coeff)
    {
        this.coeff=coeff;
    }

    /**
     * This operation return the current degree of the node
     */        
    public int getDegree()
    {
        return this.degree;
    }    

    /**
     * This operation return the current coefficient of the node
     */        
    public float getCoeff()
    {
        return this.coeff;
    }        
    
    /**
     * This operation calculate the first derivative of the node
     */        
    public void derivative()
    {
        if (degree==0)
            coeff=0;
        else
        {            
            coeff=coeff*degree;
            degree--;
        }
    }        
}