import java.util.*;

public class cwprog1 {

    public static int findSmallestInt(int[] arr) {

        int min=Integer.MAX_VALUE;

        for(int i:arr){
            min = Math.min(i,min);
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<arr.length;i++) {
            scanner.nextInt();
        }

        System.out.println(cwprog1.findSmallestInt(arr));
    }
}
