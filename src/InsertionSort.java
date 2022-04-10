public interface InsertionSort {
    //Complexity: O(n^2)

    static void insert(double[] tab, int rightIndex, double value) {
        int key;
        for (key = rightIndex; key >= 0 && tab[key] > value; key--) {
            tab[key + 1] = tab[key];
        }
        tab[key + 1] = value;
    }

    static void sort(double[] tab) {
        for (int i = 0; i  < tab.length - 1; i++) {
            insert(tab, i, tab[i+1]);
        }
    }
}
