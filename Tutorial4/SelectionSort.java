package Tutorial4;

import java.util.Scanner;

public class SelectionSort {
    public static int[] sortArray(int[] arr) {
        for (int i = arr.length - 1; i >= 1; i--) {
            int max = arr[i];
            int pos = i;
            for (int j = i - 1; j >= 0; j--) {
                if (max < arr[j]) {
                    max = arr[j];
                    pos = j;
                    arr[pos] = arr[i];
                    arr[i] = max;
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