public class cwprog10
{
        public static int calculateYears(double principal, double interest,  double tax, double desired)
        {
            int years = 0;

            for(double i = principal; i<desired; i=i*(1+(interest*(1-tax))))
            {
                years++;
            }

            return years;
        }

        public static void main(String[] args)
        {
            System.out.println(calculateYears(1000,0.05,0.18,1100));
        }
}
