import java.util.Scanner;

//Vowel Count

public class cwprog4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();

        //Replace all non vowels with empty string and find its length
        System.out.println("Number of vowels: " + str.replaceAll("(?i)[^aeiou]", "").length());
    }
}
