package DSA.Tutorial01;

public class Problem3 {
    public static int[] findArray(int[] a){
        int[] b = new int[a.length];
        for(int i = 0; i < a.length; i++){
            b[i] = a[i];
        }
        for(int i = 0; i < a.length - 1; i++){
            int p = i;
            for(int j = i + 1; j < a.length; j++){
                if(b[i] > b[p] ){
                    p = j;
                }
                int temp = b[i];
                b[i] = b[p];
                b[p] = temp;
            }
        }
        return b;
    }
    public static void main(String[] args) {
        int[] arr = {1, 8, 9, 4, 5};
        int[] result = findArray(arr);
        for(int i : result){
            System.out.print(i + " ");
        }
    }
}
