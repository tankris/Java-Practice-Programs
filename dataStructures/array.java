import java.util.Arrays;

class array {
	//Default value of each element in an array is equal to the
	//default value of its type
	//In this case, its 0
	int[] arr = new int[5];
	
	//Contructor that fills the array with a value
	public array() {
		Arrays.fill(arr, Integer.MIN_VALUE);
	}
	
	//Finds the size of the array
	public void size() {
		//In java, there is no way to distinguish capacity from the size
		//of the array
		//Hence we display just the length
		System.out.println("Size of the array: " + arr.length);
	}

	//Prints the element of the Array at a given index
	public void at(int index) {
		try {
			//Tries printing the element at a given index
			System.out.println("Element at position " + index + " is " + arr[index]);
		}

		catch(IndexOutOfBoundsException ex) {
			//Catches an exception if the index is outside the range
			//of the Array List
			System.out.println("Index not within the Array's range");
		}
	}

	//Pushes passed item to the end of the array
	public void push(int item) {
		//Inserting into the array
		try {
			int i = arr.length - 1;

			//Check if the index is empty
			while(arr[i] == Integer.MIN_VALUE && i >= 0) {
				i--;
			}

			arr[i + 1] = item;
			
			//Display contents of the new array
			display();
		}

		catch(IndexOutOfBoundsException ex) {
			System.out.println("Array is full. Cannot push new value.");
		}
	}

	//Inserts item at index, shifts that index's value and trailing elements
	//to the right
	public void insert(int index, int item) {
		try {
			if(arr[arr.length - 1] != Integer.MIN_VALUE) {
				throw new IndexOutOfBoundsException();
			}

			//Moving all values within array 1 place to the right
			for(int i = arr.length - 1; i > index; i--) {
				arr[i] = arr[i-1];
			}
			
			//Inserting the item at index
			arr[index] = item;
		}

		catch(IndexOutOfBoundsException ex) {
			System.out.println("The index is outside the range of the array");
		}

		//Display contents of the new Array
		display();
	}
	
	//Prepend array with item
	public void prepend(int item) {
		//Calling insert at index 0
		insert(0, item);
	}

	//Remove the last element and display it
	public void pop(int[] arr) {
		try {
			int i = 0;
		
			//Finding the last element
			while(arr[i] != Integer.MIN_VALUE && i < arr.length) {
				i++;
			}

			System.out.println("Popped value from the Array: " + arr[i]);
			arr[i - 1] = Integer.MIN_VALUE;
		}

		catch(IndexOutOfBoundsException ex) {
			System.out.println("Array is empty");	
		}
	}

	//Delete item at index, shifting all trailing elements left
	public void delete(int index) {
		try {
			int i = index;

			if(i < 0 || i >= arr.length)
				throws new IndexOutOfBoundsException();

			//Removing element at index by shifting all
			//elements from index's right to the left
			//only if its non-empty
			while(i < arr.length - 1 && arr[i + 1] != Integer.MIN_VALUE) {
				arr[i] = arr[i + 1];
				i++;
			}

			arr[i] = Integer.MIN_VALUE;
		}

		catch(IndexOutOfBoundsException ex) {
			System.out.println("The index given is outside the range of the array");
		}

		display();
	}

	public void remove(int item) {
		//Finds the 1st occurance in the Array and prints the index
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == item) {
				delete(i);
			}
		}
	}

	//Looks for a value and returns first index at that value
	public void find(int item){
		boolean flag = false;

		//Finds the 1st occurance in the Array and prints the index
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == item) {
				flag = true;
				System.out.println(item + " is at " + i);
				break;
			}
		}

		if(flag == false) {
			System.out.println(item + " wasn't found");
		}

	}

	//Displays the elements of the Array
	public void display() {
		System.out.println("Contents of the Array: ");

		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		
		
		//Example of polymorphism as there are two functions with the
		//same name but with different input parameters
		//size(arrayList);

		//is_empty(arrayList);
		
		//at(10, arrayList);

		//push(2, arr, arrayList);	

		//insert(0, 3, arr, arrayList);
		
		array a = new array();

		a.display();
	}
}
