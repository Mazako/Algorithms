import java.util.Optional;

public interface BinarySearch {
    //complexity: O(log n)

    static Optional<Integer> binarySearch(double[] tab, double value) {
        int a = 0;
        int b = tab.length - 1;
        while (a <= b) {
            int mid = (a + b) / 2;
            if (tab[mid] == value)
                return Optional.of(mid);
            if (tab[mid] > value)
                b = mid - 1;
            else
                a = mid + 1;
        }

        return Optional.empty();
    }
}
