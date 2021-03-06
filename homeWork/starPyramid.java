import java.util.Scanner;

class starPyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) {
				System.out.print(" ");
			}

			for(int k = 0; k < (i * 2 + 1); k++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
