public interface SelectionSort {
    //Complexity: O(n^2)

     static void sort(double[] tab) {
         for (int i = 0; i < tab.length; i++) {
             int index = indexOfMinimum(tab, i);
             Swap.swap(tab, index, i);
         }
     }

     static int indexOfMinimum(double[] tab,int startIndex) {
         double minValue = tab[startIndex];
         int minIndex = startIndex;

         for (int i = startIndex + 1; i < tab.length; i++) {
             if (tab[i] < minValue) {
                 minIndex = i;
                 minValue = tab[i];
             }
         }
         return minIndex;

     }
}
