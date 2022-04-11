import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Test {
    private static final Random rng = new Random();

    public static void main(String[] args) {
        double[] arr = createRandomArr(10, 100);
        MergeSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static double[] createRandomArr(int len, int bound) {
        double[] tab = new double[len];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = rng.nextInt(bound) + 1;
        }

        return tab;
    }

}
