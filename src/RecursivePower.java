public interface RecursivePower {

    static double power(double x, int n) {
        if (n == 0)
            return 1;
        if (n > 0 && n % 2 == 0) {
            double  y = power(x,n/2);
            return y * y;
        }
        if (n > 0 && n % 2 != 0) {
            return power(x,n-1) * x;
        }

        else {
            return 1/power(x,-n);
        }
    }
}
