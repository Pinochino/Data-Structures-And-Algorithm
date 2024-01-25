package DSA.Tutorial2;

import java.util.Scanner;

public class SimpleSearch {
  public static int calculateBinary(int[] e, int n, int m) {
    // Arrays.sort(a, Collections reverseOrder())
    int temp = 0;
    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        if (e[i] > e[j]) {
          temp = e[i];
          e[i] = e[j];
          e[j] = temp;
        }
      }
    }
    for (int i = 0; i < n; i++) {
      if (e[i] == m) {
        return i;
      }
    }
    return -1;
  }

  public static int calculateBinary(int[] arr, int left, int right, int target) {
    // while (low <= high) {
    // int mid = (low + high) / 2;
    // if(arr[mid] == target){
    // return mid;
    // } else if (arr[mid] < target){
    // low = mid + 1;
    // } else {
    // high = mid - 1;
    // }
    // }
    // return -1;
    if (left > right) {
      return -1;
    } else {
      int mid = (int) (left + right) / 2;
      if (arr[mid] == target) {
        return (calculateBinary(arr, left, mid + 1, target));
      } else {
        return (calculateBinary(arr, mid + 1, right, target));
      }
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the length of array ");
    int n = input.nextInt();
    int[] b = new int[n];
    System.out.println("Enter the low of array: ");
    int e = input.nextInt();
    System.out.println("Enter the high of array: ");
    int f = input.nextInt();
    for (int i = 0; i < n; i++) {
      b[i] = input.nextInt();
    }
    for (int i = 0; i < n; i++) {
      System.out.print(b[i] + " ");
    }
    System.out.println("Enter your number: ");
    int g = input.nextInt();
    System.out.println("The position of your number is ");
    int result = calculateBinary(b, e, f, g);
    System.out.println(result);
    input.close();
  }
}
