import java.util.ArrayList;

public class arrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        nums.set(1,8);
        nums.remove(1);
        System.out.println(nums.get(1));
        System.out.print(nums.size());



    }
}
