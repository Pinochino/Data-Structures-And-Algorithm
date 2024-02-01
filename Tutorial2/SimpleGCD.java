package Tutorial2;
import java.util.Scanner;
public class SimpleGCD {
    public static int findGCD(int m, int n){
        int i = n;
        while ( i > 1) {
             if(m % i == 0 && n % i == 0){
                 return i;
             }
             i--;
         }
        return 1;
        // while (n != 0) {
        //     int temp = n;
        //     n = m % n;
        //     m = temp;
        // }
        // return m;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = input.nextInt();
        System.out.println("Enter the second number: ");
        int b = input.nextInt();
        System.out.println("The result: ");
        int result = findGCD(a, b);
        System.out.println(result);
        input.close();
    }
}
