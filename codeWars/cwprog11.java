import java.util.ArrayList;

public class cwprog11
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});

        int sum = 0;

        for(int[] i : list)
        {
            sum += i[0]-i[1];
        }

        System.out.println(sum);
    }
}
