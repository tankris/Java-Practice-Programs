//Class to represent a node in the Linked List
class node {
	int data;
	node next;

	public node(int data) {
		this.data = data;
	}
}

class singlyLinkedList {
	//Holds the location of the first node
	node head;

	//Returns the number of data elements in the list
	public int size() {
		node current = head;

		//Counter to find the size
		int ctr = 0;

		//If current isn't null, increment counter and move to next node
		while(current != null) {
			ctr++;
			current = current.next;
		}

		return ctr;
	}
	
	//Checks if the Linked List is empty or not
	public boolean empty() {
		if (head == null) {
			return true;
		}

		else {
			return false;
		}
	}

	//Returns data value of a node at index
	public int value_at(int index) {
		node current = head;

		//As long as the node isn't null nor is the counter index equal
		//zero, we progress to the next node
		while(current != null && index > 0) {
			current = current.next;
			index--;
		}

		//If the loop had stopped earlier due to the node being null
		//before reaching index or index isn't above 0, we
		//know that the index isn't within the range of the Linked List
		if(current == null || index > 0) {
			System.out.println("Index is out of bounds of the Linked List");
			return Integer.MIN_VALUE;
		}

		return current.data;
	}

	//Push the node from the front of the Linked List
	public void push_front(int value) {
		//Create a new node
		node n = new node(value);
		
		//Point the node to head
		n.next = head;

		//Make head point to the new node. Thereby moving the head
		//towards the new 1st node
		head = n;
	}

	public static void main(String[] args) {
		singlyLinkedList sll = new singlyLinkedList();
	}
}
