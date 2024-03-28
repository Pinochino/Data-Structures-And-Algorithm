package Tutorial4;
public class Excersice1 {
    public static int[] sortArray(int[] arr){
        boolean a = false;
        while (!a) {
            for (int i = 0; i < arr.length - 1; i++) {
                a = true;
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    a = false;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 2};
        int[] result = sortArray(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
