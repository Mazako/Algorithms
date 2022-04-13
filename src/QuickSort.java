public interface QuickSort {

    static void sort(double[] array) {
        sort(array,0,array.length - 1);
    }
    static void sort(double[] array, int low, int high) {
        if (low < high) {
            int p = partition(array,low,high);
            sort(array, low, p-1);
            sort(array, p + 1, high);
        }
    }

    static int partition(double[] array, int low, int high) {
        double pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                Swap.swap(array,i,j);
            }
        }
        Swap.swap(array,i+1,high);
        return i+1;
    }
}
