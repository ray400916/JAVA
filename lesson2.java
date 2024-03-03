import java.util.Scanner;

public class lesson2 {
    public static void main(String[] args) {
        System.out.print("Enter three number: ");
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String[] xArray = x.split(",");

        int a = Integer.parseInt(xArray[0]);
        int b = Integer.parseInt(xArray[1]);
        int c = Integer.parseInt(xArray[2]);

        int max = 0, med = 0, min = 0;

        if (a > b && a > c) {
            max = a;
            med = b;

            if (c > b) {
                med = c;
                min = b;
            } else {
                med = b;
                min = c;
            }
        } else if (b > a && b > c) {
            max = b;
            med = a;

            if (a > c) {
                med = a;
                min = c; // min=b;
            } else {
                med = c;
                min = a;
            }
        } else if (c > a && c > b) {
            max = c;
            med = a;

            if (a > b) {
                med = a;
                min = b;
            } else {
                med = b;
                min = a;
            }
        }

        for (String v : xArray) {
            System.out.println(v);

        }

        System.out.print(max + " " + med + " " + min);

    }
}
