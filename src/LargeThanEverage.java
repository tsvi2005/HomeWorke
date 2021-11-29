import java.util.Scanner;
//Ex2

public class LargeThanEverage {
    public static final int ARRAY_SIZE=10;
    public static void main(String[] args) {
        largeThanEverage();
    }

    public static void largeThanEverage() {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int[] tenNumbers = new int[ARRAY_SIZE];
        System.out.println("Enter ten numbers");
        for (int i = 0; i < ARRAY_SIZE; i++) {
            System.out.println("enter the number " + (i+1));
            tenNumbers[i] = scanner.nextInt();
            sum = sum + (tenNumbers[i]);
        }
        double everage = (sum / ARRAY_SIZE);
        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (tenNumbers[i] > everage) {
                System.out.print(tenNumbers[i] +",");
            }
        }
    }
}
