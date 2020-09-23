/*
Question: For an input height, draw the boundry of a right angled triangle. Assume the base and height

Example input:
5

*
**
* *
*  *
*****  

*/

import java.util.Scanner;

class rightTriangle {
	public static void rightTri(int height) {
		for(int i = 1; i <= height; i++)
		{
			if(i != height) {
			for(int j = 0; j < i; j++) {
				if(j == 0 || j == (i-1))
					System.out.print("*");
				else
					System.out.print(" ");

			}
			}
			else {
				for(int j = 0; j < i; j++)
					System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the height of the triangle");
		int height = scanner.nextInt();

		rightTri(height);
	}
}
