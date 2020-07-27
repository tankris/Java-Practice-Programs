import java.util.Scanner;

//Beginner Series #3 Sum of Numbers

public class cwprog2 {

    public int GetSum(int a, int b)
    {
        int sum = ((b+a)*(Math.abs(b-a)+1))/2; //Derived using Gauss formula
        return sum;
    }

    public static void main(String[] args)
    {
        cwprog2 pr2 = new cwprog2();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the 2 numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int fSum = pr2.GetSum(num1,num2);

        System.out.println("Sum of numbers between " + num1 + " and " + num2 +" is " + fSum);
    }
}
