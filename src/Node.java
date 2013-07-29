
public class Node <T> {
T data;
Node <T> link;

public Node(T data) {
this.data = data;
this.link = null;
}

public T getData() {

return data;
}

public void setData(T data) {
this.data = data;
}

public Node<T> getLink() {
return link;
}

public void setLink(Node<T> link) {
this.link = link;
}
}