public class Hello {
    public static void main(String[] args) {
        int[] varible = { 1, 2, 3, 4, 5 };

        double avg = averageTestFor(varible);

        System.out.println(avg);
    }

    public static double averageTestFor(int[] numbers) {
        double average = 0;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        average = sum / numbers.length;
        return average;
    }

    public static double averageTestForeach(int[] numbers) {
        double average = 0;
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        average = sum / numbers.length;
        return average;
    }
}
