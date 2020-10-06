//Class to represent a node in the Linked List
class node {
	int data;
	node next;

	public node(int data) {
		this.data = data;
	}
}

class singlyLinkedList {
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

	public static void main(String[] args) {
		
	}
}
