import java.util.Scanner;
import java.util.Arrays;

public class QuadrantTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a num for (x,y) : ");
        String input = sc.nextLine();
        String[] inputFormat = input.split(",");
        int x = Integer.parseInt(inputFormat[0].substring(1, inputFormat[0].length()));
        int y = Integer.parseInt(inputFormat[1].substring(0, inputFormat[1].length() - 1));
        if (x > 0 && y > 0) {
            System.out.print("First quardant");
        } else if (x > 0 && y < 0) {
            System.out.print("Third quadarant");
        } else if (x < 0 && y > 0) {
            System.out.print("Second quadarant");
        } else if (x < 0 && y < 0) {
            System.out.print("Fourth quadarant");
        }else if(x==0 && y==0){
            System.out.print("Original point");
        }else if(x==0 && y<0){
            System.out.print("On y" + y);
        }else if(x>0 && y==0){
            System.out.print("On x" + x);
        }

    }
}
