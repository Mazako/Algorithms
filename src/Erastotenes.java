public interface Erastotenes {

    static int[] sito(int n) {
        int[] tab = new int[n + 1];
        for (int i = 2; i * i <= n; i++) {
            if (tab[i] == 0) {
                for (int j = i * i; j <= n; j += i) {
                    tab[j] = 1;
                }
            }
        }
        return tab;
    }
}
