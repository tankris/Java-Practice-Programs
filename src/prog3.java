import java.util.Scanner;

public class prog3 {

    //Function to accept elements for the array
    public void acceptArr(int[][] arr){
        Scanner scanner = new Scanner(System.in);

        //Run through the row
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter the elements for row " + i);

            //Run through each element within the row
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j] = scanner.nextInt();
            }
        }
    }

    //Find the sum of all elements in the array
    public int sumArr(int[][] arr)
    {
        int sum=0;

        //For each with array i running through each row
        for(int[] i:arr)
        {
            //For each with j traversing through each element within i
            for(int j:i)
            {
                sum += j;
            }
        }

        return sum;
    }

    public static void main(String[] args){

        prog3 p3 = new prog3(); //Creating object to access the functions

        int[][] arr = new int[5][5];

        p3.acceptArr(arr); //Passing array to accept input
        int aSum = p3.sumArr(arr); //Passing array to find sum

        //Printing the result
        System.out.println("Sum of all the elements of the array are: " + aSum);
    }
}
