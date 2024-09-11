import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] nums = { 11, 34, 5, 17, 56 };
    boolean x = atLeastOneOdd(nums);
    System.out.println(x);
    shiftRight(nums);
    System.out.println(Arrays.toString(nums));
    shiftLeft(nums);
    System.out.print(Arrays.toString(nums));
  }

  public static boolean atLeastOneOdd(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 != 0) {
        return true;
      }
    }
    return false;
  }

  public static void shiftLeft(int[] arr) {
    int tmp = arr[0];
    for (int i = 0; i < arr.length - 1; i++) {
      arr[i] = arr[i + 1];
    }
    arr[arr.length - 1] = tmp;
  }

  public static void shiftRight(int[] arr) {
    int temp = arr[arr.length - 1];
    for (int i = 0; i < arr.length - 1; i++) {
      int z = arr[i + 1];
      arr[i + 1] = arr[i];
      arr[i + 1] = z;

    }
    arr[arr.length - 1] = temp;
  }
}
