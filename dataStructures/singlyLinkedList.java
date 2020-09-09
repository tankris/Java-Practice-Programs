class Node {
	int data;
	Node next;

	public Node(int data){
		this.data = data;
	}
}

class singlyLinkedList {
	Node head;

	public Node newNode(int data) {
		return new Node(data);
	}

	public void add(int data) {
		if(head == null) {
			head = newNode(data);
		}

		else {
			Node current = head;

			while(current.next != null) {
				current = current.next;
			}

			current.next = newNode(data);
		}
	}

	public void delete() {
		if(head == null) {
			System.out.println("The list is already empty");
		}

		else if(head.next == null) {
			head = null;
		}

		else {
			Node current = head;

			while(current.next.next != null) {
				current = current.next;
			}

			current.next = null;
		}
	}

	public void reverse() {
		if(head == null) {
			System.out.println("The Linked List is empty");
		}

		else {
			Node prev = null;
			Node forward = head.next;

			while(forward != null) {
				head.next = prev;
				prev = head;
				head = forward;
				forward = head.next;
			}

			head.next = prev;
		}
	}

	public void display() {
		if(head == null) {
			System.out.println("The Linked List is empty");
		}

		else {
			Node current = head;

			System.out.println("\nList of elements in LL as follows: ");

			while(current != null) {
				System.out.println(current.data);
				current = current.next;
			}
		}
	}

	public static void main(String[] args) {
		singlyLinkedList sll = new singlyLinkedList();

		sll.display();

		sll.add(3);
		sll.add(4);
		
		sll.display();
		
		sll.add(5);
		
		sll.display();

		sll.reverse();
		sll.display();
		
		sll.delete();
		
		sll.display();
		
		sll.delete();
		
		sll.reverse();
		sll.display();
		
		sll.delete();
		
		sll.display();

		sll.reverse();
		sll.reverse();
	}
}
