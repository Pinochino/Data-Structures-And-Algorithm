package DSA.Tutorial01;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem4 {
    public static int findPosition(ArrayList<String> arr, String name){
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).equals(name)) {
                return i;
            }
        }
        return -1; 
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = input.nextInt();
        ArrayList<String> nameList = new ArrayList<>(n);
        for(int i = 0; i < n; i++){
            nameList.add(input.nextLine());
        }
        int result = findPosition(nameList, "Hung");
        System.out.println(result);
        input.close();
    }
}
