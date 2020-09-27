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

	public static void main(String[] args) {
		//Default value of each element in an array is equal to the
		//default value of its type
		int[] arr = {1,2,3,4,5};
		
		size(arr);

		ArrayList<Integer> arrayList = new ArrayList<>();

		for(int i = 0; i < 10; i++) {
			arrayList.add(i);
		}
		
		//Example of polymorphism as there are two functions with the
		//same name but with different input parameters
		size(arrayList);

		is_empty(arrayList);
		at(10, arrayList);
		
	}
}
