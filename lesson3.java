import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {
        System.out.print("Enter two number: ");
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        String input = sc.next();

        String[] xArray = input.split(" ");

        System.out.println(xArray[0]);
        System.out.println(xArray[1]);

        int a = Integer.parseInt(xArray[0]);
        int b = Integer.parseInt(xArray[1]);

        int sum = a + b;
        int dif = a - b;
        int product = a * b;
        double divide = (double) a / b;
        int remainder = a % b;

        System.out.println(sum);
        System.out.println(dif);
        System.out.println(product);
        System.out.println(divide);
        System.out.println(remainder);
    }
}