//https://www.codewars.com/kata/55e7280b40e1c4a06d0000aa
//

import java.util.Arrays;
import java.util.List;

public class cwprog13 {
    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
        if(ls.size() < 3)
            return null;

        else if(ls.size() == 3) {
            int sum = ls.stream().mapToInt(Integer::intValue).sum();
            return (sum <= t) ? null : sum;
        }

        else {
            String[] n1 = new String[k];
            Arrays.fill(n1, "1");
            String s1 = String.join("", n1);
            long i1 = Long.parseLong(s1,2);

            long N = (long) Math.pow(2, ls.size());
            int fsum = 0, sum = 0;

            for (long i = i1; i < N; i++) {
                String code = Long.toBinaryString(N | i).substring(1);
                int min = code.replace("0", "").length();

                if (min > k || min < k)
                    continue;

                for (int j = 0; j < ls.size(); j++) {
                    if (code.charAt(j) == '1') {
                        sum += ls.get(j);
                    }
                }

                if (sum > fsum && sum <= t)
                    fsum = sum;

                sum = 0;
            }
            return (fsum != 0) ? fsum : null;
        }
    }

    public static void main(String[] args) {
        System.out.println(chooseBestSum(230, 3, Arrays.asList(91, 74, 73, 85, 73, 81, 87)));
    }
}
