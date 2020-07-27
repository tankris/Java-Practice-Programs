import java.util.Scanner;

//Disemvoweled Trolls

public class cwprog5
{
    public static String disemvowel(String str)
    {
        //removes all the vowels where ?i signifies that is be case-insensitive
        str = str.replaceAll("(?i)[aieou]","");
        return str;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        s = disemvowel(s);

        System.out.println("Disemvoweled string: " + s);
    }
}
