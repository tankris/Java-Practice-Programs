import java.util.ArrayList;

class array {
	//Finds the size of the Static Array
	public static void size(int[] arr) {
		//In java, there is no way to distinguish capacity from the size
		//of the array
		System.out.println("Size of the array: " + arr.length);
	}

	//Finds the size of the Dynamic Array
	public static void size(ArrayList<Integer> arrayList) {
		//Much like an array, there isn't an easy solution to find the
		//capacity of the Array List
		System.out.println("Current size of the array: " + arrayList.size());
	}

	//Find if the Array List is empty or not
	public static void is_empty(ArrayList<Integer> arrayList) {
		if(arrayList.size() == 0) {
			System.out.println("The Array List is empty");
		}

		else {
			System.out.println("The Array List isn't empty");
		}
	}

	//Prints the element of the Array List at a given index
	public static void at(int index, ArrayList<Integer> arrayList) {
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
		//1st insertion for array
		arr[0] = item;

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

	//Displays the elements of the Array and Array List
	public static void displayArray(int[] arr, ArrayList<Integer> arrayList) {
		//Displaying the contents of the Static array
		System.out.println("Contents of the Array: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		//Displaying the contents of the Dynamic array
		System.out.println("Contents of the Array List: ");
		arrayList.forEach((n) -> System.out.println(n));
	}

	public static void main(String[] args) {
		//Default value of each element in an array is equal to the
		//default value of its type
		int[] arr = new int[5];
		
		size(arr);

		ArrayList<Integer> arrayList = new ArrayList<>();

		for(int i = 0; i < 5; i++) {
			arrayList.add(i);
		}
		
		//Example of polymorphism as there are two functions with the
		//same name but with different input parameters
		size(arrayList);

		is_empty(arrayList);
		
		at(10, arrayList);

		push(2, arr, arrayList);	

		insert(0, 3, arr, arrayList);
	}
}
