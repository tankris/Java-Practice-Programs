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

		//Checks if the Linked List is empty
		if(empty() == true) {
			System.out.println("Linked List is empty");
			return Integer.MIN_VALUE;
		}

		//As long as the node isn't null nor is the
		//counter index equal zero, we progress to the next node
		while(current != null && index > 0) {
			current = current.next;
			index--;
		}

		//If the loop had stopped earlier due to the node 
		//being null before reaching index or index is
		//less than 0, we know that the index isn't within 
		//the range of the Linked List
		if(current == null || index < 0) {
			System.out.println("Index is out of bounds");
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

	//Remove front item and return its value
	public int pop_front() {
		int data = head.data;

		//Checks if the Linked List is empty
		if(head == null) {
			System.out.println("The Linked List is empty");
			return Integer.MIN_VALUE;
		}
		
		//Making head to point to the next node and so effectively
		//removing the first element
		head = head.next;

		return data;
	}

	//Adds an item at the end
	public void push_back(int data) {
		node current = head;
		node n = new node(data);

		//If the Linked List is empty, then create the 1st node
		if(head == null) {
			head = n;
			return;
		}

		//Find the last node
		while(current.next != null) {
			current = current.next;
		}

		//Make last node point to the new node
		current.next = n;
	}

	//Removes end item and returns its value
	public int pop_back() {
		int data;
		node current = head;

		//Checks if the Linked List is empty
		if(head == null) {
			System.out.println("Linked List is empty");
			return Integer.MIN_VALUE;
		}

		//If there is only 1 element in the Linked List,
		//then remove it
		if(head.next == null) {
			head = null;
		}

		//Checks if the current node is pointing to the 
		//last node
		while(current.next.next != null) {
			current = current.next;
		}

		data = current.next.data;
		current.next = null;

		return data;
	}

	//Returns the value of the 1st node in the Linked List
	public int front() {
		return head.data;
	}

	//Returns the value of the end node
	public int back() {
		node current = head;

		//Checks if the Linked List is empty
		if(current == null) {
			System.out.println("Linked List is empty");
			return Integer.MIN_VALUE;
		}

		//Finds the last node
		while(current.next != null) {
			current = current.next;
		}

		return current.data;
	}

	//Insert value at index, so current item at that 
	//index is pointed to by new item at index
	public void insert(int index, int value) {
		
		node current = head;
		int size = size();

		//Checks if index is out of bounds
		if(index < 0 || index > size) {
			System.out.println("Index is out of bounds");
		}
		
		//Checks if value needs to be pushed in the front
		//If so, we use the push_front function
		if(index == 0) {
			push_front(value);
			return;
		}

		//Checks if value needs to be pushed at the back
		//If so, we use the push_back function
		if(index == size) {
			push_back(value);
		}

		//Finds the node right before the index position
		if(index > 1 && current.next != null) {
			current = current.next;
			index--;
		}
		
		//Creates a new node, has it point to node at index,
		//then has node at index-1 point to new node
		//Hence node is not at intended index
		node n = new node(value);
		n.next = current.next;
		current.next = n;
	}

	//Removes node at a given index
	public void erase(int index) {

		//Checks if the Linked List is empty
		if(empty() == true) {
			System.out.println("Linked List is empty");
			return;
		}

		//Confirms if the index is out of bounds or not
		if(index < 0 || index > (size() - 1)) {
			System.out.println("Index is out of bounds");
		}
		
		//Calls pop_front() if the 1st node needs to be
		//removed
		if(index == 0) {
			pop_front();
		}

		//Prev holds the 1st node initially 
		//Forwards holds the 2nd node initially
		node prev = head;
		node forward = head.next;

		//Checks if forward has reached the index position
		while(index > 1) {
			prev = prev.next;
			forward = forward.next;
			index--;
		}

		//Now node at prev point to the node ahead of it
		//thereby effectively deleting the node at index
		//i.e at forward
		prev.next = forward.next;
	}

	public static void main(String[] args) {
		singlyLinkedList sll = new singlyLinkedList();
	}
}
