
public class LLQueue <T> implements LLQueueInterface<T>{
Node<T> front, rear, current;
public static int NCount = 0;
public static int NorthTotalTime = 0;
public static int NorthAverage = 0;
public static int NorthTotalTraffic = 0;

public LLQueue() 
    {
    front = null;
    rear = null;
    current = null;
    
    }
        
    @Override
    public void enqueue(T data) {
       Node<T> newNode = new Node<T>(data);
                if (isEmpty()) 
                {
                    front = newNode;
                    rear = front;
                    current = front;
                } 
                else 
                {
                // not empty queue
                rear.setLink(newNode);
                }
                
                rear = newNode;
                NCount++;
    }

    @Override
    public T Ndequeue() throws QueueUnderFlowException {
	if (!isEmpty()) 
        {
            
            T element = front.getData();
            String n = front.getData().toString();
            front = front.getLink();
            current = front;
            NCount--;
            if(front==null) 
            {
                rear = null;
                current = front;
            }
                
                TrafficStatFrame.CurPlate.setText(n);
                return element;
                
                
        } 
        else 
        {
        throw new QueueUnderFlowException("Empty Queue");
        } 
    }
    public T Sdequeue() throws QueueUnderFlowException {
	if (!isEmpty()) 
        {
            
            T element = front.getData();
            String s = front.getData().toString();
            front = front.getLink();
            current = front;
            NCount--;
            if(front==null) 
            {
                rear = null;
                
            }
                TrafficStatFrame.CurPlate1.setText(s);
                
                return element;
        } 
        else 
        {
        throw new QueueUnderFlowException("Empty Queue");
        } 
    }
    
    public T Edequeue() throws QueueUnderFlowException {
	if (!isEmpty()) 
        {
            
            T element = front.getData();
            String e = front.getData().toString();
            front = front.getLink();
            current = front;
            NCount--;
            if(front==null) 
            {
                rear = null;
                
            }
               
                TrafficStatFrame.CurPlate2.setText(e);
                return element;
        } 
        else 
        {
        throw new QueueUnderFlowException("Empty Queue");
        } 
    }
    
    public T Wdequeue() throws QueueUnderFlowException {
	if (!isEmpty()) 
        {
            
            T element = front.getData();
            String w = front.getData().toString();
            front = front.getLink();
            current = front;
            NCount--;
            if(front==null) 
            {
                rear = null;
                
            }
               
                TrafficStatFrame.CurPlate3.setText(w);
                return element;
        } 
        else 
        {
        throw new QueueUnderFlowException("Empty Queue");
        } 
    }

    @Override
    public boolean isEmpty() 
    {
        return (front == null);
    }
    
    public String toString(Node nNode) 
    {
        	
               String List = (String)nNode.getData();
    
     return List;
        
    }
}
