package DSA.Tutorial2;

public class SimpleGCD {
    public static int findGCD(int m, int n){
        // int i = n;
        // while ( i > 1) {
        //     if(m % i == 0 && n % i == 0){
        //         return i;
        //     }
        //     i--;
        // }
        // return 1;
        while (n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
        }
        return m;
    }
    public static void main(String[] args) {
        int a = 50;
        int b = 15;
        int result = findGCD(a, b);
        System.out.println(result);
    }
}
