package LinkedList;

/*
 * @param head is used to point to head node
 * @param tail is used to point to tail node
 */
public class LinkedList<K> {
	public INode<K> head;
	public INode<K> tail;
	
	public LinkedList() {
		this.head = null;
		this.tail = null;	
	}
	// Add nodes on top of the nodes by changing head
	public void add(INode<K> newNode) { 
		if(this.tail == null) {
			this.tail = newNode;
		}
		if(this.head == null) {
			this.head = newNode;
		}
		else {
			INode<K>tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}
	//Append nodes by changing tail
	public void append(INode<K> newNode) {
		if(this.head == null) {
			this.head = newNode;
		}
		if(this.tail == null) {
			this.tail = newNode;
		}
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;

		}
	}
	//Insert nodes between two nodes
	public void insert(INode<K> Node,INode<K> newNode) {
		INode<K> tempNode = Node.getNext();
		Node.setNext(newNode);
		newNode.setNext(tempNode);
	}
	public void printNodes() {
		System.out.println("My Nodes: "+head);
	}
	
}