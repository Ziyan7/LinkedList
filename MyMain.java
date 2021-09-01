package LinkedList;

/**
 * the MyLinkedListTest class implements 
 * a main function which will call
 * Create() method to create a linked list 
 */

public class MyMain {
	
	
	public static void Create() {
		Node<Integer> myFirstNode = new Node<>(56);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(70);
		
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		
	}
	
	/*This method adds the element to the top of the linked list
	 *head needs to be changed
	 */
	public static void addOnTop() {
		Node<Integer> myFirstNode = new Node<>(70);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(56);
		
		LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.printNodes();
	}
	
	/*This method adds the element to the bottom of the linked list
	 *tail needs to be changed
	 */
	public static void addBottom() {
		Node<Integer> myFirstNode = new Node<>(56);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(70);
		
		LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.printNodes();
	}
	
	//This method insert the element in between the linked list
	public static void betweenNodes() {
		Node<Integer> myFirstNode = new Node<>(56);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(70);
		
		LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode,mySecondNode);
		myLinkedList.printNodes();
	}
	//@method to delete the first node
	public static void DeleteTopNode() {
		Node<Integer> myFirstNode = new Node<>(70);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(56);
		
		LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		INode<Integer> temp =myLinkedList.pop();
		System.out.println(temp.getKey()+" has been deleted");
		myLinkedList.printNodes();
	}
	
	//@method to delete the Last node
		public static void DeleteLastNode() {
			Node<Integer> myFirstNode = new Node<>(70);
			Node<Integer> mySecondNode = new Node<>(30);
			Node<Integer> myThirdNode = new Node<>(56);
			
			LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
			myLinkedList.add(myFirstNode);
			myLinkedList.add(mySecondNode);
			myLinkedList.add(myThirdNode);
			INode<Integer> temp =myLinkedList.poplast();
			System.out.println(temp.getKey()+" has been deleted");
			myLinkedList.printNodes();
		}
		
		//method to search element in the linked list
		public static void searchCenterNode() {
			Node<Integer> myFirstNode = new Node<>(70);
			Node<Integer> mySecondNode = new Node<>(30);
			Node<Integer> myThirdNode = new Node<>(56);
		
			LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
			myLinkedList.add(myFirstNode);
			myLinkedList.add(mySecondNode);
			myLinkedList.add(myThirdNode);
			INode<Integer> result = myLinkedList.searchNode(30);
			if(result == null)
				System.out.println("Element not present");
			else
				System.out.println(result.getKey()+" is present");
			myLinkedList.printNodes();
		}
	public static void main(String [] args) {
		Create();
		addOnTop();
		addBottom();
		betweenNodes();
		DeleteTopNode();
		DeleteLastNode();
		searchCenterNode();
	}
}
