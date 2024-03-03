// 西元年份除以4不可整除，為平年。
// 西元年份除以4可整除，且除以100不可整除，為閏年。
// 西元年份除以100可整除，且除以400不可整除，為平年。
// 西元年份除以400可整除，為閏年。

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int x = scanner.nextInt();
        Leapyear(x);
    }

    public static void Leapyear(int n) {
        if (n % 400 == 0) {
            System.out.print("閏年");
        } else {
            if (n % 4 == 0) {
                if (n % 100 == 0) {
                    System.out.print("平年");
                } else {
                    System.out.print("閏年");
                }
            } else {
                System.out.print("平年");
            }
        }
    }
}
