import java.util.Set;
import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

class remDuplicateSum {
	
	public static void sum(Set<Integer> list) {
		Set<Integer> newArr = new TreeSet<>(list);

		int sum = 0;

		Iterator iterator = newArr.iterator();
		
		for(Integer i:newArr) {
			sum += i;
		}

		System.out.println("Sum: " + sum);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the numbers in the array: (Enter a non-integer value to stop input)");
		
		Set<Integer> arr = new TreeSet<>();

		while(scanner.hasNextInt()) {
			int input = scanner.nextInt();

			arr.add(input);
		}

		sum(arr);
	}
}
