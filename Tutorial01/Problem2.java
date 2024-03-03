package Tutorial01;
import java.util.Scanner;
public class Problem2 {
    public static int maxArray(int[] a){
        int max = a[0];
        for(int i = 1; i < a.length - 1; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = input.nextInt();
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            b[i] = input.nextInt();
        }
        System.out.println("max of array is: " + maxArray(b));
        input.close();
    }
}
