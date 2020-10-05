import java.util.ArrayList;
import java.util.Collections;

class arrayList {
	ArrayList<Integer> arrList = new ArrayList<>();
	int new_capacity;

	public arrayList(int new_capacity) {
		//Ensures that arrList will hold 5 elements
		this.new_capacity = new_capacity;
		arrList.ensureCapacity(this.new_capacity);
	}

	//Returns the number of items in the Array List
	public int size() {
		return arrList.size();
	}

	//Returns the current capacity of the Array List
	public int capacity() {
		return new_capacity;	
	}

	//Returns boolean result upon checking if arrList is empty
	public boolean is_empty() {
		return arrList.isEmpty();
	}

	//Returns item at given index unless index ot of bounds
	public void at(int index) {
		try {
			System.out.println("Element at " + index + " is " + arrList.get(index));
		}

		catch(IndexOutOfBoundsException ex) {
			//Return Integer's min value in case the index is out of
			//bounds
			System.out.println(index + " is outside the Array List's range");
		}
	}

	//Inserts an element at the end of the array
	public void push(int item) {
		arrList.add(item);

		//Double the size of the Array List if the size equals capacity
		if(size() == new_capacity) {
			resize(new_capacity * 2);
		}
	}

	//Inserts item at index, shifts that index's value and trailing elements
	//to the right
	public void insert(int index, int item) {
		try {
			arrList.add(index, item);

			//Double the size of the Array List if the size equals capacity
			if(size() == new_capacity) {
				resize(new_capacity * 2);
			}
		}
		
		//Catches the exception if the index isn't within Array Lists's
		//range
		catch(IndexOutOfBoundsException ex) {
			System.out.println(index + " is out of bound of the ArrayList range");
		}
	}

	//Prepend item to the Array List
	public void prepend(int item) {
		insert(0, item);
	}

	//Remove element from the end and display the value
	public void pop() {
		delete(size() - 1);
	}

	//Delete item at index, shifting all trailing elements left
	public void delete(int index) {
		try {
			arrList.remove(index);

			//Halve the size of the Array List if the size equals capacity/4
			if(size() == new_capacity / 4) {
				resize(new_capacity / 2);
			}
		}

		//Catch in case the Array List is empty
		catch(IndexOutOfBoundsException ex) {
			System.out.println("Cannot pop since Array List is empty");
		}
	}

	//Looks for an item and removes index holding it (even if in multiple
	//places)
	public void remove(int item) {
		//Remove only if Array List has content
		if(size() == 0) {
			System.out.println("Array List is empty");
			return;
		}

		arrList.removeAll(Collections.singleton(item));

		//Halve the size of the Array List if the size equals capacity/4
		if(size() == new_capacity / 4) {
			resize(new_capacity / 2);
		}
	}

	//Looks for value and returns first index with that value, -1 if not
	//found
	public int find(int item) {
		return arrList.indexOf(item);
	}

	//Used to change the ensured capacity of the Array List
	private void resize(int new_capacity) {
		this.new_capacity = new_capacity;
		arrList.ensureCapacity(this.new_capacity);
	}

	//Display the contents of the Array List
	public void display() {
		arrList.forEach((n) -> System.out.println(n));
	}

	public static void main(String[] args) {
		int capacity = 10;

		arrayList al = new arrayList(capacity);
	}
}
