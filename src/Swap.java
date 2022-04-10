public interface Swap {
    //complexity: O(1)
    static void swap(double[] tab, int a, int b) {
        double tmp = tab[a];
        tab[a] = tab[b];
        tab[b] = tmp;
    }


}
