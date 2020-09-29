import java.util.Arrays;
import java.util.ArrayList;

class array {
	//Default value of each element in an array is equal to the
	//default value of its type
	static int[] arr = new int[5];
	
	public static array() {
		Arrays.fill(arr, Integer.MIN_VALUE);
	}
	
	//Finds the size of the Static Array
	public static void size() {
		//In java, there is no way to distinguish capacity from the size
		//of the array
		System.out.println("Size of the array: " + arr.length);
	}


	//Prints the element of the Array List at a given index
	public static void at(int index) {
		try {
			//Tries printing the element at a given index
			System.out.println("Element at position " + index + " is " + arrayList.get(index));
		}

		catch(IndexOutOfBoundsException ex) {
			//Catches an exception if the index is outside the range
			//of the Array List
			System.out.println("Index not within the Array List's range");
		}
	}

	//Pushes passed item to the end of the array
	public static void push(int item, int[] arr, ArrayList<Integer> arrayList) {
		//Insert into the array
		int i = 0;

		while(arr[i] != Integer.MIN_VALUE) {
			i++;
		}

		arr[i] = item;

		//Don't need to know the index of the last element when inerting
		//into a Dynamic array
		arrayList.add(item);

		displayArray(arr, arrayList);
	}

	//Inserts item at index, shifts that index's value and trailing elements
	//to the right
	public static void insert(int index, int item, int[] arr, ArrayList<Integer> arrayList) {
		try {
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

		//Moves all the elements from index to the last element to the
		//right and inserts item at index
		arrayList.add(index, item);

		//Display contents of the Array and Array List
		displayArray(arr, arrayList);
	}
	
	//Prepend array with item
	public static void prepend(int item, int[] arr, ArrayList<Integer> arrayList) {
		//Calling insert at index 0
		insert(0, item, arr, arrayList);
	}

	//Remove the last element and display it
	public static void pop(int[] arr, ArrayList<Integer> arrayList) {
		//Removing the last element from the Array
		int i = 0;

		while(arr[i] != Integer.MIN_VALUE && i < (arr.length - 1)) {
			i++;
		}

		System.out.println("Popped value from the Array: " + arr[i]);
		arr[i] = Integer.MIN_VALUE;

		//Removing the last element from the Array List
		System.out.println("Popped value from Array List: " + arrayList.get(arrayList.size()-1));

		arrayList.remove(arrayList.size() - 1);
	}

	//Delete item at index, shifting all trailing elements left
	public static void delete(int index, int[] arr, ArrayList<Integer> arrayList) {
		try {

			//Removing element at index by instead shifting all
			//elements from index's right to the left
			for(int i = index; i < arr.length-1; i++) {
				arr[i] = arr[i + 1];
			}
		}

		catch(IndexOutOfBoundsException ex) {
			System.out.println("The index given is outside the range of the array");
		}

		display();
	}

	public static void remove(int item, int[] arr, ArrayList<Integer> arrayList) {
		//Finds the 1st occurance in the Array and prints the index
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == item) {
				delete(i, arr, arrayList);
			}
		}
	}

	//Looks for a value and returns first index at that value
	public static void find(int item, int[] arr, ArrayList<Integer> arrayList){
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

	//Displays the elements of the Array and Array List
	public static void display(int[] arr, ArrayList<Integer> arrayList) {
		//Displaying the contents of the Static array
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

		find(0, arr, arrayList);
	}
}
