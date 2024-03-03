package Tutorial4;

import java.util.Scanner;

public class MergeSort {
   public static int[] sortArray(int[] arr, int left, int mid, int right) {
    int i = left;
    int j = mid + 1;
    int k = 0;
    int[] c = new int[right - left + 1]; // Kích thước cần được điều chỉnh dựa trên phạm vi đang được sắp xếp

    while (i <= mid && j <= right) {
        if (arr[i] < arr[j]) {
            c[k++] = arr[i++];
        } else {
            c[k++] = arr[j++];
        }
    }
    
    // Sao chép các phần tử còn lại từ nửa trái, nếu có
    while (i <= mid) {
        c[k++] = arr[i++];
    }
    
    // Sao chép các phần tử còn lại từ nửa phải, nếu có
    while (j <= right) {
        c[k++] = arr[j++];
    }

    // Sao chép các phần tử đã được sắp xếp từ mảng phụ trợ c trở lại arr
    for (int t = 0; t < k; t++) {
        arr[left + t] = c[t];
    }

    return arr;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the left of array: ");
        int b = sc.nextInt();
        System.out.println("Enter the mid of array: ");
        int c = sc.nextInt();
        System.out.println("Enter the right of array: ");
        int d = sc.nextInt();

        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] result = sortArray(a, b, c, d);
        for (int i : result) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
