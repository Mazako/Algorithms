import java.util.Arrays;

public interface MergeSort {


    static void sort(double[] array) {
        sort(array,0, array.length - 1);
    }
    static void sort(double[] array, int begin, int end) {
        if (end > begin) {
            int mid = (begin + end) / 2;
            sort(array, begin, mid);
            sort(array, mid + 1, end);
            merge(array, begin, mid, end);
        }
    }

    private static void merge(double[] array, int begin, int mid, int end) {
        double[] rightArray = new double[mid - begin + 1];
        double[] leftArray = new double[end - mid];
        int i;
        int j;
        int k = begin;
        for (i = 0; i < leftArray.length; i++, k++) {
            leftArray[i] = array[k];
        }

        for (j = 0; j < rightArray.length; j++, k++) {
            rightArray[j] = array[k];
        }

        j = 0;
        i = 0;
        k = begin;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] < rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            }
            else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < leftArray.length)
            array[k++] = leftArray[i++];

        while (j < rightArray.length)
            array[k++] = rightArray[j++];

    }
}
