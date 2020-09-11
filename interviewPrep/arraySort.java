import java.util.Arrays;

//Question: Sort the elements of an integer array in Ascending and Descending
//order

class arraySort {
	public static void ascSort(int[] arr) {
		Arrays.sort(arr);
	}

	public static void descSort(int[] arr) {
		ascSort(arr);

		int r = arr.length - 1;

		for(int i = 0; i <= arr.length/2; i++, r--) {
			int temp = arr[i];
			arr[i] = arr[r];
			arr[r] = temp;
		}
	}

	public static void display(int[] arr) {
		System.out.println("Elements of the Array: ");

		for(int i : arr) {
			System.out.println("> " + i);
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[]{4,5,1,8,3,2,1};
		
		ascSort(arr);
		display(arr);

		descSort(arr);
		display(arr);
	}
}
