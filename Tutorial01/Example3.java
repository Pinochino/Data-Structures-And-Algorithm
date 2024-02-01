package Tutorial01;

public class Example3 {
    public static int FindMaxSubSeqSum1(int[] a){
        int maxSum=a[0];
        for (int i=0; i<a.length; i++)
            for (int j=i; j<a.length; j++)
            {
                int thisSum=0;
                for (int k=i; k<=j; k++)
                    thisSum+=a[k];
                if (thisSum>maxSum)
                    maxSum=thisSum;
            }       
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 2};
        System.out.println(FindMaxSubSeqSum1(arr));
        System.out.println(System.currentTimeMillis());
    }
}
