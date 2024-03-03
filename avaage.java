public class avaage {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int sum = sumArray(nums);
        int leng = nums.length;
        double avg = averageArray(leng, sum);
        System.out.print(avg);

        // System.out.print(avg);
        // nums.length
    }

    public static int sumArray(int[] nums) {
        int sum = 0;
        // for (int num : nums) {
        // sum = sum + num;
        // }

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;

    }

    public static double averageArray(int leng, int sum) {

        double avg = (double) sum / leng;

        return avg;

    }

}
