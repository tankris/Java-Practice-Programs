//Question: Rever a string using a single loop statement

class singleLoopReverse {
	public static String reverse(String str) {
		String[] arr = new String[str.length()];
		arr = str.split("");

		for(int i = 0;i < arr.length/2; i++) {
			String temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		
		str = String.join("", arr);
		return str;
	}

	public static void main(String[] args) {
		String s= "Hello World"; 

		System.out.println(reverse(str));
	}
}
