public class WhileAverage {
    public static void main(String[] args) {
        String[] intro = { "hello", "world", "java", "hero" };
        int leng = intro.length;

        int i = 0;
        String final_print = "";
        while (i < leng) {
            final_print += intro[i];
            i++;
        }

        System.out.print(final_print);

    }
}
