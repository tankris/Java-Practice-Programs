import java.util.Arrays;

class array {
	//Default value of each element in an array is equal to the
	//default value of its type
	//In this case, its 0
	int[] arr = new int[5];
	
	//Constructor that fills the array with Integer.MIN_VALUE to make
	//finding the size easier
	public array() {
		Arrays.fill(arr, Integer.MIN_VALUE);
	}
	
	//Returns the capacity of the array
	public int capacity() {
		return arr.length;
	}

	//Returns the size of the array
	public int size() {
		int i;

		for(i = 0; i < arr.length;) {
			//Integer.MIN_VALUE is equivalent to empty in our array
			if(arr[i] == Integer.MIN_VALUE) {
				break;
			}

			else {
				i++;
			}
		}

		return i;
	}

	//Checks if the array is empty
	public void is_empty() {
		if(size() == 0) {
			System.out.println("Array is empty");
		}

		else {
			System.out.println("Array isn't empty");
		}
	}

	//Prints the element of the Array at a given index
	public void at(int index) {
		try {
			if(arr[index] != Integer.MIN_VALUE) {
			System.out.println("Element at position " + index + " is " + arr[index]);
			}

			else {
				System.out.println("Element at position " + index + " is empty");
			}
		}

		catch(IndexOutOfBoundsException ex) {
			//Catches an exception if the index is outside the range
			//of the Array List
			System.out.println("Index not within the Array's range");
		}
	}

	//Pushes passed item to the end of the array
	public void push(int item) {
		int i = arr.length - 1;

		//Check if the index is empty
		while(i >= 0 && arr[i] == Integer.MIN_VALUE) {
			i--;
		}

		arr[i + 1] = item;
		
		//Doubles the capacity if the size = capacity
		if(arr[arr.length - 1] != Integer.MIN_VALUE) {
			resize(arr.length * 2);
		}
	}

	//Inserts item at index, shifts that index's value and trailing elements
	//to the right
	public void insert(int index, int item) {
		try {
			if(index > arr.length || index < 0) {
				throw new IndexOutOfBoundsException();
			}

			//Moving all values within array 1 place to the right
			for(int i = arr.length - 1; i > index; i--) {
				arr[i] = arr[i-1];
			}
			
			//Inserting the item at index
			arr[index] = item;
			
			//Doubles the capacity if the size = capacity
			if(arr[arr.length - 1] != Integer.MIN_VALUE) {
				resize(arr.length * 2);
			}
		}

		catch(IndexOutOfBoundsException ex) {
			System.out.println("The index is outside the range of the array");
		}
	}
	
	//Prepend array with item
	public void prepend(int item) {
		//Calling insert at index 0
		insert(0, item);
	}

	//Remove the last element and display it
	public void pop() {
		try {
			int i = 0;
		
			//Finding the last element
			while(arr[i] != Integer.MIN_VALUE && i < arr.length) {
				i++;
			}

			System.out.println("Popped value from the Array: " + arr[i - 1]);
			
			//Deletes the popped value
			arr[i - 1] = Integer.MIN_VALUE;

			//Reduces capacity if size is 1/4th the capacity
			if(size() == (arr.length / 4)) {
				resize(arr.length / 2);
			}
		}

		catch(IndexOutOfBoundsException ex) {
			System.out.println("Array is empty");	
		}
	}

	//Delete item at index, shifting all trailing elements left
	public void delete(int index) {
		try {
			int i = index;

			int sizeOfArray = size();

			//Checks if the array is empty
			if(sizeOfArray == 0) {
				System.out.println("Array is empty");
				return;
			}

			//Checks if element at index is empty or not
			if(arr[i] == Integer.MIN_VALUE) {
				System.out.println("Element at " + index + " is empty");
				return;
			}

			//Removing element at index by shifting all
			//elements from index's right to the left
			//only if its non-empty
			while(i < (sizeOfArray - 1)) {
				arr[i] = arr[i + 1];
				i++;
			}

			arr[i] = Integer.MIN_VALUE;
			
			//Reduces the capacity if the size if 1/4th the capacity
			if(size() == (arr.length / 4)) {
				resize(arr.length / 2);
			}
		}

		catch(IndexOutOfBoundsException ex) {
			System.out.println("The index given is outside the range of the array");
		}

	}

	//Looks for value and removes index holding it (even if in multiple places)
	public void remove(int item) {
		boolean flag = false;

		for(int i = 0; i < size();) {
			if(arr[i] == item) {
				flag = true;
				
				System.out.println(item + " was found at " + i);

				//Pass the index to delete function
				delete(i);
			}
			
			else {
				//Since delete function removes the item and
				//shifts the following digits to its left, 
				//so by updating only when the value hasn't 
				//been found prevents skipping our check for
				//item against the newly shifted value
				i++;
			}
		}

		if(flag == false) {
			System.out.println(item + " wasn't found");
		}
	}

	//Looks for a value and returns first index at that value
	public void find(int item){
		//Finds the 1st occurance in the Array and prints the index
		for(int i = 0; i < size(); i++) {
			if(arr[i] == item) {
				System.out.println(item + " is at " + i);
				return;
			}
		}

		System.out.println(item + " wasn't found");
	}

	private void resize(int new_capacity) {
		//Made a array with new_capacity size
		int[] copy = new int[new_capacity];

		//Fill the array with Integer.MIN_VALUE 
		Arrays.fill(copy, Integer.MIN_VALUE);

		//Copies the elements from arr to the new array
		System.arraycopy(arr, 0, copy, 0, size());

		//Now make arr point to the new array
		arr = copy;
	}

	//Displays the elements of the Array
	public void display() {
		System.out.println("Contents of the Array: ");

		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
			
		array a = new array();

		int size = a.capacity();

		for(int i = 0; i < 9; i++) {
			a.push(i);
		}

		a.display();
	}
}
