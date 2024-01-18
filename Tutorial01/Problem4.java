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
        return -1; // Return -1 if the name is not found
    }
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        int result = findPosition(nameList, "Linh");
        System.out.println(result);
    }
}
