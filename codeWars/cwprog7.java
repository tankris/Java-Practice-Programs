import java.util.Arrays;

public class cwprog7 {

    public static String findNeedle(Object[] haystack) {

        //Converts array to a List and uses indexOf method which has a time complexity of O(n)
        return String.format("Found needle at position: %d", Arrays.asList(haystack).indexOf("needle"));

    }

    public static void main(String[] args)
    {
        //Sample random Object array which is a super class of all other array class types
        Object[] hay = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};

        String str = findNeedle(hay);

        System.out.println(str);
    }
}

