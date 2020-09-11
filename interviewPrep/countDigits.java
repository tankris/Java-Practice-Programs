import java.util.Scanner;

//Question: Given a number n, count the total number of digits required to write
//all numbers from 1 to n

//Example:
//Numbers from 1 to 13 are 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13
//So 1 - 9 require 9 digits and 10 - 13 require 8 digits (10 has 1&0, 11 has
//1&1, 12 has 1&2, 13 has 1&3)
//Hence 9 + 8 = 17 digits are required. 

class countDigits {

	public static int count(int n) {
		int numOfDigits = 0;

		for(int i = 1; i < n; i*=10) {
			numOfDigits += n - (i - 1);
		}
		
		return numOfDigits;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n;

		System.out.print("Enter a number: ");
		n = scanner.nextInt();

		System.out.println("The number of digits used are " + count(n));
	}

}
