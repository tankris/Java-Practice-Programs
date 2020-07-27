import java.util.Scanner;

//Is this a triangle

public class cwprog6 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sides of the triangle:");
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();

        //Using Triangle Inequality theorem which says that sum of 2 sides is always greater than the other
        //we check if the sides given in the input is a triangle
        System.out.println("Does such a triangle exist? " + ((a+b)>c && (b+c)>a && (a+c)>b));
    }
}
