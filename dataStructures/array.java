class array {
	public static void size(int[] arr) {
		//In java, there is no way to distinguish capacity from the size
		//of the array
		System.out.println("Size of the array" + arr.length);
	}

	public static void main(String[] args) {
		//Default value of each element in an array is equal to the
		//default value of its type
		int[] arr = {1,2,3,4,5};
		
		size(arr);
	}
}
