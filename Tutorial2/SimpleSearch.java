package DSA.Tutorial2;

public class SimpleSearch {
    public static int calculateBinary(int[] e , int n , int m){
      int temp = 0;
      for(int i = 0; i < n - 1; i++){
        for(int j = i + 1; j < n; j++){
            if(e[i] > e[j]){
                temp = e[i];
                e[i] = e[j];
                e[j] = temp;
            }
        }
      }
      for(int i = 0; i < n; i++){
        if(e[i] == m){
            return i;
        }
      }
      return -1;
    }

    public static void main(String[] args) {
        int[] e = { 1, 5, 7, 2};
        int result = calculateBinary(e, 4, 5);
        System.out.println(result);
    
    }
}
