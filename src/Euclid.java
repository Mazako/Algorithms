public interface Euclid {

     static int NWD(int a, int b) {
        int tmp;
        while(b != 0) {
            tmp = b;
            b = a % b;
            a = tmp;
        }

        return a;
    }

     static int NWW(int a, int b) {
        return a * b / NWD(a,b);
    }

     static int getLowestSquare(int a, int b) {
        if (a % b == 0)
            return b;
        return getLowestSquare(b, a % b);
    }
}
