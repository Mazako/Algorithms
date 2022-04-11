import java.util.HashMap;

public class Memoization {
    public static HashMap<Long,Long> factorialMemory = new HashMap<>();
    public static HashMap<Integer,Integer> fibbMemory = new HashMap<>();

    public static long factorial(long n) {
        if (n == 0) {
            return 1;
        }
        if (!factorialMemory.containsKey(n)) {
            long value = n * factorial(n - 1);
            factorialMemory.put(n,value);
            return value;
        }
        else {
            return factorialMemory.get(n);
        }
    }

    public static int fibonacci(int n) {
        System.out.println(n);
        if (n == 0 || n == 1)
            return n;
        if(fibbMemory.containsKey(n))
            return fibbMemory.get(n);
        else {
            int value = fibonacci(n - 1) + fibonacci(n - 2);
            fibbMemory.put(n,value);
            return value;
        }

    }
}
