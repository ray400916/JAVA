import java.lang.reflect.Array;
import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] numAns = { 69, 81, 30, 38, 9, 2, 47, 61, 32, 79 };
        int[] nums = { 69, 81, 30, 38, 9, 2, 47, 61, 32, 79 };
        Arrays.sort(numAns);

        System.out.println("numAns: " + Arrays.toString(numAns));

        for (int y = 0; y < nums.length - 1; y++) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] <= nums[i + 1]) {

                } else {
                    int tmp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = tmp;
                }
            }
        }

        System.out.print(Arrays.toString(nums));
    }
}
