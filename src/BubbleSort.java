import java.util.Arrays;


public interface BubbleSort {
//complexity: O(n^2)

    static void sort(double[] tab) {
        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = 0; j < tab.length - 1 - i; j++) {
                if (tab[j] > tab[j+1]) {
                    swap(tab, j, j + 1);
                }
            }
        }
    }

    static void swap(double[] tab, int a, int b) {
        double tmp = tab[a];
        tab[a] = tab[b];
        tab[b] = tmp;
    }
}
