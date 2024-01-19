package DSA.Tutorial2;

public class PolyEvaluate {
    public static int calculatePoly(int[] C, int n, int x) {
        int S = 0;
        for (int i = 0; i < n - 1; i++) {
            int P = 1;
            if (i != 0) {
                for (int k = 1; k < i; k++) {
                    P = P * x;
                }
            }
            S = S + C[i] + P;
        }
        return S;
    }

    public static void main(String[] args) {
        int[] a = { 1, 9, 5, 3, 6 };
        int result = calculatePoly(a, 5, 6);
        System.out.println(result);
    }
}
