package DSA.Tutorial2;
public class SimplePow {
    public static int findPow(int x, int n){
        int S = 1;
        if (n == 0) {
            return S;
        }
        for (int i = 1; i <= n; i++) {
            S = x * S;
        }
        return S;
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int result = findPow(a, b);
        System.out.println(result);
    }
}
