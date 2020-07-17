import java.util.Scanner;

public class prog2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Creating scanner to read input

        int[] arr = new int[10]; //Declare and initialize array
        //new int default initializes to 0

        //Accepting 10 array element
        System.out.println("Enter 10 elements into the array:");

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = scanner.nextInt();
        }

        int arr_sum = 0; //Variable to store result

        //Calculate the result of the array
        for (int i = 0; i < arr.length; i++)
        {
            arr_sum += arr[i];
        }

        //Print sum of elements
        System.out.println("Sum of the elements of the array: " + arr_sum);

    }
}
