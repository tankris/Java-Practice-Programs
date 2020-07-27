import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class cwprog12
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        Matcher matcher = Pattern.compile("(.{2})").matcher(str);

        List<String> list = new ArrayList<>();

        while (matcher.find())
        {
            list.add(matcher.group(0));
        }

        if(str.length()%2!=0)
            list.add(str.substring(str.length()-1).concat("_"));

        System.out.println(Arrays.toString(list.toArray(new String[0])));
    }
}
