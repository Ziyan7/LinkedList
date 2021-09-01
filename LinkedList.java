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
	
	//Insert nodes between two nodes
	public void insert(INode<K> Node,INode<K> newNode) {
		INode<K> tempNode = Node.getNext();
		Node.setNext(newNode);
		newNode.setNext(tempNode);
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
			sort();
		}
	}
	
	//method to sort the nodes in the linked list in ascending order
	 
	private void sort() 
	{
		INode<K>current = this.head;
		INode<K>index=null;
		K temp;
		if(this.head == null) {
			System.out.println("List is empty");
		}
		else {
			while(current != null)
			{
				index = current.getNext();   //Node index will point to node next to current
				while(index != null) {
					//If current node's data is greater than index's node data, swap the data between them
					if((int)current.getKey()>(int)index.getKey()){
						temp = current.getKey();
						current.setKey(index.getKey());
						index.setKey(temp);
					}
					index = index.getNext();
	                }
	                current = current.getNext();
			}  		
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
	//delete top node
	public INode<K> pop(){
		INode<K> tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}
	//Delete the last node
	public INode<K> poplast(){
		INode<K> tempNode = this.head;
		while(tempNode.getNext()!= this.tail) {
			tempNode=tempNode.getNext();
		}
		this.tail = tempNode;
		INode<K> tempNode2;
		tempNode2=tempNode.getNext();
		tempNode.setNext(null);
		return tempNode2;
	}
	
	//Search key value is present
	public INode<K> searchNode(K Key) {
		INode<K> tempNode = head;
		while(tempNode != null && tempNode.getNext() != null) {
			if (tempNode.getKey().equals(Key)){
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		return null;
	}
	
	//Search for the key and then delete node
	public INode<K> deleteNode(K Key) {
		if(head == null || head.getNext() == null) {
			return null;
		}
		INode<K> currentNode = this.head;
		INode<K> previousNode = null;
		
		while(currentNode != null && currentNode.getKey() != Key) {
			previousNode = currentNode;
			currentNode = currentNode.getNext();
		}
		
		if(currentNode == null) {
			System.out.println("key not found");
			return head;
		}
	    System.out.println(currentNode.getKey()+" deleted");
		previousNode.setNext(currentNode.getNext());
		return head;
	}
	
	//Count the number of nodes
	public int countNode(INode<K> head) {
		INode<K> tempNode = head;
		if(tempNode == null)
			return 0;
		if(tempNode.getNext() == null)
			return 1;
		int count = 1;
		while(tempNode != null && tempNode.getNext() != null) {
			tempNode = tempNode.getNext();
			count++;
		}
		return count;
	}
	public void printNodes() {
		System.out.println("My Nodes: "+head);
	}
	
}