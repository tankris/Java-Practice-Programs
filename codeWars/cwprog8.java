import java.util.Arrays;

class str{
    String[] strarr = {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"};
}

public class cwprog8{
    public static void main(String[] args)
    {

        int k=1;

//        for (int i=1; i<str.length; i++)
//        {
//            String c=str[i];
//            int j=i-1;
//
//            while(j!=-1 && c.length() < str[j].length())
//            {
//                str[j+1]=str[j];
//                j--;
//            }
//
//            str[j+1] = c;
//        }

//        Set<String> stringSet = new TreeSet<String>(Arrays.asList(str));
//
//        Object[] st = stringSet.toArray();

//        if(k<=0 || k > strarr.length || strarr.length == 0)
//            System.out.println("");
//
//        strarr = new TreeSet<String>(Arrays.asList(strarr)).toArray(new String[0]);
//
//        Arrays.sort(strarr, new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return s2.length() - s1.length();
//            }
//        });
//
//        String str = new String("");
//
//        for(int i=0; i<k; i++)
//        {
//            str = String.join("", str, strarr[i]);
//        }

        String s = new String("");
        int sum = 0;

//        for(int i=k-1, j=i-k+1; i < strarr.length; i++,j++)
//        {
////            String stemp = new String("");
////            int temp=0;
////            for(int j=i-k+1; j<=i; j++)
////            {
////                temp += strarr[j].length();
////                stemp = String.join("", stemp, strarr[j]);
////            }
//
//            int temp = String.join(", ",
//
//            if(sum < temp)
//            {
//                sum=temp;
//                s = new String(String.join(", ", Arrays.copyOfRange(strarr, j, i)));
//                System.out.println(s);
//            }
//        }
        str st = new str();
        s = Arrays.copyOfRange(st.strarr, 0, 5, Object[].class).toString();
        System.out.println(s);
    }
}
