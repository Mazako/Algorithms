import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Test {
    private static final Random rng = new Random();

    public static void main(String[] args) {
        double[] arr = createRandomArr(5, 100);
        QuickSort.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static double[] createRandomArr(int len, int bound) {
        double[] tab = new double[len];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = rng.nextInt(bound) + 1;
        }

        return tab;
    }

    private static double recursiveArraySum(double[] tab, int l, int r) {
        if (l == r) {
            return tab[l];
        }
        return tab[l] + recursiveArraySum(tab,l + 1, r);
    }

    private static int recursiveStrlen(String str) {
        if (str.length() == 1)
            return 1;
        return 1 + recursiveStrlen(str.substring(1));
    }

}
