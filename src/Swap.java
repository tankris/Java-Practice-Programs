import java.util.Scanner;

public class Swap {

    private int num1;
    private int num2;

    public Swap(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void number_swap(Swap swp) {
        if(swp.getNum1() == swp.getNum2())
            return;

        int temp;
        temp = swp.getNum1();
        swp.setNum1(swp.getNum2());
        swp.setNum2(temp);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Creating scanner to read input

        //Accepting 1st element
        System.out.print("Enter the first element: ");
        int a = scanner.nextInt();

        //Accepting 2nd element
        System.out.print("Enter the second element: ");
        int b = scanner.nextInt();

        Swap swp = new Swap(a,b); //Creating object of class Swap

        swp.number_swap(swp);

        //Print swapped numbers
        System.out.println("Element 1 is now: " + swp.getNum1());
        System.out.println("Element 2 is now: " + swp.getNum2());
    }
}
