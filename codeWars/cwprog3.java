import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

//Descending Order

public class cwprog3 {

    public static void sortDesc(final int num) {

        //Converting the number to string and splitting into a String array
        String[] array = String.valueOf(num).split("");

        //Sort array in reverse
        Arrays.sort(array, Collections.reverseOrder());

        //String array is joined with "" delimiter between each string
        //parseInt is used to convert the joined string to primitive int
        System.out.println("Sorted number: " + parseInt(String.join("", array)));
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number to be sorted: ");
        int num = scanner.nextInt();

        //Can call the function since it is of static type
        sortDesc(num);
    }
}
