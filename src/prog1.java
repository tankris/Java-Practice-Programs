import java.util.Scanner;

public class prog1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Creating scanner to read input

        //Accepting 1st element
        System.out.print("Enter the first element: ");
        int num1 = scanner.nextInt();

        //Accepting 2nd element
        System.out.print("Enter the second element: ");
        int num2 = scanner.nextInt();

        if(num1 != num2){
            int temp = num2;
            num2 = num1;
            num1 = temp;
        }

        //Print swapped numbers
        System.out.println("Element 1 is now: " + num1);
        System.out.println("Element 2 is now: " + num2);
    }
}
