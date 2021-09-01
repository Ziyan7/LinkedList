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
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
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
		
		//method to search element in the linked list
			public static void searchInsert() {
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
			
			//method to search for the key and add new node next to the searched key
			public static void SearchInsert() {
				Node<Integer> myFirstNode = new Node<>(56);
				Node<Integer> mySecondNode = new Node<>(30);
				Node<Integer> myThirdNode = new Node<>(70);
				Node<Integer> myFourthNode = new Node<>(40);
				
				LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
				myLinkedList.add(myFirstNode);
				myLinkedList.append(mySecondNode);
				myLinkedList.append(myThirdNode);
				INode<Integer> temp = myLinkedList.searchNode(30);
				if(temp != null) {
					INode<Integer> next = temp.getNext();
					temp.setNext(myFourthNode);
					myFourthNode.setNext(next);
				}
				else {
					System.out.println("Key not present");
				}
				myLinkedList.printNodes();
			}
			
			/*method which deletes elements at the specified location in the linked list
			 * count is used to get the number of nodes
			 */
			public static void deleteSpecifiedNode() {
				Node<Integer> myFirstNode = new Node<>(56);
				Node<Integer> mySecondNode = new Node<>(30);
				Node<Integer> myThirdNode = new Node<>(40);
				Node<Integer> myFourthNode = new Node<>(70);

				LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
				myLinkedList.add(myFirstNode);
				myLinkedList.append(mySecondNode);
				myLinkedList.append(myThirdNode);
				myLinkedList.append(myFourthNode);

				INode<Integer> head = myLinkedList.deleteNode(40);
				int count = myLinkedList.countNode(head);
				System.out.println(count + " nodes are present in the linked list");
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
		SearchInsert();
		deleteSpecifiedNode();
		//to check sorting
		addOnTop();
		
	}
}
