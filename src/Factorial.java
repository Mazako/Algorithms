public interface Factorial {
    static int iterableFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static int recursiveFactorial(int n) {
        if (n == 0)
            return 1;
        return n * recursiveFactorial(n - 1);
    }
}
