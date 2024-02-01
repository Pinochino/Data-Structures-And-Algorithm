package Tutorial2;
import java.util.Scanner;
public class SimplePow {
    // public static int findPow(int x, int n){
    //     int S = 1;
    //     if (n == 0) {
    //         return S;
    //     }
    //     for (int i = 1; i <= n; i++) {
    //         S = x * S;
    //     }
    //     return S;
    // }
    public static int findPow(int x, int n){
        if (n == 0) {
            return 1;
        }
        int temp = findPow(x, n/2);
        if (n % 2 == 0) {
            return temp * temp;
        } else {
            return x * temp * temp;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = input.nextInt();
        System.out.println("Enter the second number: ");
        int b = input.nextInt();
        System.out.println("The result: ");
        int result = findPow(a, b);
        System.out.println(result);
        input.close();
    }
}
