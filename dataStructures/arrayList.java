import java.util.ArrayList;
import java.util.Collections;

class arrayList {
	ArrayList<Integer> arrList = new ArrayList<>();
	int new_capacity;

	public arrayList(int new_capacity) {
		//Ensures that arrList will hold 5 elements
		new_capacity = this.new_capacity;
		arrList.ensureCapacity(new_capacity);
	}

	//Returns the number of items in the Array List
	public int size() {
		return arrList.size();
	}

	//Returns boolean result upon checking if arrList is empty
	public boolean is_empty() {
		return arrList.isEmpty();
	}

	//Returns item at given index unless index ot of bounds
	public int at(int index) {
		try {
			return arrList.get(index);
		}

		catch(IndexOutOfBoundsException ex) {
			//Return Integer's min value in case the index is out of
			//bounds
			return Integer.MIN_VALUE;
		}
	}

	//Inserts an element at the end of the array
	public void push(int item) {
		arrList.add(item);

		resize();
	}

	//Inserts item at index, shifts that index's value and trailing elements
	//to the right
	public void insert(int index, int item) {
		try {
			arrList.add(index, item);

			resize();
		}
		
		//Catches the exception if the index isn't within Array Lists's
		//range
		catch(IndexOutOfBoundsException ex) {
			System.out.println(index + " is out of bound of the ArrayList range");
		}
	}

	//Prepend item to the Array List
	public void prepend(int item) {
		arrList.add(0, item);
	}

	//Remove element from the end and display the value
	public void pop() {
		arrList.remove(size() - 1);

		resize();
	}

	//Delete item at index, shifting all trailing elements left
	public void delete(int index) {
		arrList.remove(index);

		resize();
	}

	//Looks for an item and removes index holding it (even if in multiple
	//places)
	public void remove(int item) {
		arrList.removeAll(Collections.singleton(item));

		resize();
	}

	//Looks for value and returns first index with that value, -1 if not
	//found
	public int find(int item) {
		return arrList.indexOf(item);
	}

	//Increases the capacity of the Array List to double if the size of
	//the Array List is equal to its capacity
	//Or when popping, if size of the Array List is 1/4th of capacity,
	//resize to half
	private void resize() {
		int size = size();
		
		if(size == new_capacity) {
			new_capacity *= 2;
			arrList.ensureCapacity(new_capacity);
		}

		if(size == (new_capacity / 4)) {
			new_capacity /= 2;
			arrList.ensureCapacity(new_capacity);
		}
	}

	//Display the contents of the Array List
	public void display() {
		arrList.forEach((n) -> System.out.println(n));
	}

	public static void main(String[] args) {
		int capacity = 10;

		arrayList al = new arrayList(capacity);

		//Addings 10 values to the Array List
		for(int i = 0; i < 10; i++) {
			al.push(1);
		}

		al.remove(1);

		al.display();
	}
}
