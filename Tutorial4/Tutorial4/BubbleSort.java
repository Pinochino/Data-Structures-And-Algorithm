package Tutorial4.Tutorial4;

import java.util.Scanner;

public class BubbleSort {
    public static int[] sortArray(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = 0; j <= arr.length - i - 2; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] result = sortArray(a);
        for (int i : result) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
