package LinkedList;

/**
 * the MyLinkedListTest class implements 
 * a main function which will call
 * Create() method to create a linked list 
 * 
 */

public class MyMain {
	
	
	public static void Create() {
		Node<Integer> myFirstNode = new Node<>(56);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(70);
		
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		
	}
	
	public static void main(String [] args) {
		Create();
		
	}
}
