import java.util.Scanner;

public class cwprog1 {

    public static int findSmallestInt(int[] arr) {

        int min=Integer.MAX_VALUE; //Storing max value of integer

        for(int i:arr){ //for each loop runs through all the elements
            min = Math.min(i,min); //Comparing to find minimum value
        }

        return min;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];

        Scanner scanner = new Scanner(System.in);

        //Accept the array
        for (int i=0; i<arr.length;i++) {
            scanner.nextInt();
        }

        //Since findSmallestInt is static, we access using classname
        System.out.println(cwprog1.findSmallestInt(arr));
    }
}
