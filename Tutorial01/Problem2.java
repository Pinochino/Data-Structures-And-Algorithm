package DSA.Tutorial01;
import java.util.Scanner;
public class Problem2 {
    public static int maxArray(int[] a){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int b = input.nextInt();
        int[] arr = new int[b];
        int max = arr[0];
        for(int i = 0; i < b; i++){
            arr[i] = input.nextInt();
        }
        for(int i = 0; i < b; i++){
            if(i > arr[max]){
                max = i;
            }
        }
        input.close();
        return max;
    }
    public static void main(String[] args) {

    }
}
