import java.util.Arrays;
import java.util.Scanner;

public class cwprog1
{
    public static int findSmallestInt(int[] arr)
    {
        //Sort the array in ascending order
        Arrays.sort(arr);
        //First sorted element will be minimum value
        return arr[0];
    }

    public static void main(String[] args)
    {
        int[] arr = new int[3];

        Scanner scanner = new Scanner(System.in);

        //Accept the array
        for (int i=0; i<3;i++) {
            arr[i] = scanner.nextInt();
        }

        //Since findSmallestInt is static, we access using classname
        System.out.println(findSmallestInt(arr));
    }
}
