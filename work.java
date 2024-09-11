
import java.util.ArrayList;
// import java.lang.Math;

public class work {
  public static void main(String[] args) {

    ArrayList<Integer> nums = initArrayList(20, 20, 100);
    System.out.println(nums);
    int min = smallest(nums);
    System.out.println("Smallest: " + min);

    String[] text = { "Splendid", "Quirky", "Serene", "Cascade",
        "Jovial", "Enigma", "Tranquil", "Luminous", "Mellifluous", "Jubilant", "Ethereal", "Vibrant", "Whimsical",
        "Resplendent", "Mystical", "Effervescent", "Radiant", "Euphoric", "Serendipitous", "Enchanting" };

    ArrayList<String> nameList = initArrayListFromStrings(text);
    String max = longest(nameList);
    System.out.println("longest: " + max);

    ArrayList<Integer> numbers = i;
    System.out.println(numbers);

    int removeRandom = (int) (Math.random() * 10 + 1);
    numbers.remove(removeRandom);
    System.out.println("Remove:" + removeRandom);
    System.out.print(numbers);
  }

  public static ArrayList<Integer> initArrayList(int count, int start, int end) {
    ArrayList<Integer> nums = new ArrayList<Integer>();
    // add random numbers
    for (int i = 0; i < count; i++) {
      int random = (int) (Math.random() * (end - start) + start);
      nums.add(random);
    }
    return nums;
  }

  public static ArrayList<String> initArrayListFromStrings(String[] strs) {
    ArrayList<String> nameList = new ArrayList<String>();
    for (String value : strs) {
      nameList.add(value);
    }
    return nameList;
  }

  public static int smallest(ArrayList<Integer> nums) {
    int min = (int) nums.get(0);
    for (Object value : nums) {
      if ((int) value < min) {
        min = (int) value;
      }
    }
    return min;
  }

  public static String longest(ArrayList<String> nameList) {
    String max = "";
    for (int i = 0; i < nameList.size(); i++) {
      if (nameList.get(i).length() > max.length()) {
        max = nameList.get(i);
      }
    }
    return max;
  }

}