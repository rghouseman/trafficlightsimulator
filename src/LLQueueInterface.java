
public interface LLQueueInterface <T> {
public void enqueue(T data);
public T Ndequeue() throws QueueUnderFlowException;
public T Sdequeue() throws QueueUnderFlowException;
public T Edequeue() throws QueueUnderFlowException;
public T Wdequeue() throws QueueUnderFlowException;
public boolean isEmpty();
}