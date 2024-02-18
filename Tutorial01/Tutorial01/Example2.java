package Tutorial01;
import java.util.Random;
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            Random rand = new Random();
            int randNumber = rand.nextInt(100);
            arr[i] = randNumber;
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
        input.close();
    }
}
