class arrayList{
	static ArrayList<Integer> arrayList = new ArrayList<>();
	
	public static arrayList() {
		for(int i = 1; i < 5; i++) {
			arrayList.add(i);
		}
	}
		
	//Finds the size of the Dynamic Array
	public static void size() {
		//Much like an array, there isn't an easy solution to find the
		//capacity of the Array List
		System.out.println("Current size of the array: " + arrayList.size());
	}

	//Find if the Array List is empty or not
	public static void is_empty() {
		if(arrayList.isEmpty() == true) {
			System.out.println("The Array List is empty");
		}

		else {
			System.out.println("The Array List isn't empty");
		}
	}
	
	public static void deleteArrayList() {
		//Removing element at index from the Array List
		//It automatically shifts elements to the left
		arrayList.remove(index);

		displayArray(arr, arrayList);
	}

	public static find() {
		//Finds the 1st occurace in the Array List and prints the index
		System.out.println(item + " is at " + arrayList.indexOf(item));
	}

	public static void display() {
		//Displaying the contents of the Dynamic array
		System.out.println("Contents of the Array List: ");
		arrayList.forEach((n) -> System.out.println(n));
	}
}
