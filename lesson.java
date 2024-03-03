import java.util.Scanner;

public class lesson {
    public static void main(String[] args) {
        System.out.print("enter a number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x <= 100 && x >= 80) {
            System.out.print("A");
        } else if (x <= 79 && x >= 60) {
            System.out.print("B");
        } else if (x < 59 && x >= 0) {
            System.out.print("c");
        } else {
            System.out.print("Not inside the range");
        }
    }
}


