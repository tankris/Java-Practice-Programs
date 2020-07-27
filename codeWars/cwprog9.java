public class cwprog9
{
    public static String seriesSum(int n)
    {
        Exception e = new Exception();
        e.fillInStackTrace();
        return (e.getStackTrace().length == 2)? String.format("%.2f", Float.parseFloat(seriesSum(n))) :
                ((n!=0) ? Float.toString((float) 1/(1 + (3 * (n - 1))) + Float.parseFloat(seriesSum(n - 1))): "0.00");
    }

    public static void main(String[] args)
    {
        System.out.println(seriesSum(15));
    }
}
