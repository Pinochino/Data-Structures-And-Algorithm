package Tutorial4;

import java.util.Scanner;

public class InsertionSort {

    public static int[] sortArray(int[] arr) {
        for (int j = 1; j <= arr.length - 1; j++) {
            int key = arr[j];
            int i = j - 1;
            while ((i >= 0) && (arr[i] > key)) {
                arr[i + 1] = arr[i];
                i = i - 1;
                arr[i + 1] = key;
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
