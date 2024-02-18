import java.util.Scanner;

public class Excercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] names = new String[n];
        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            names[i] = sc.nextLine();
            System.out.print("Enter the mark of student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            sc.nextLine(); 
        }

        System.out.print("Enter the number of students with highest marks to display: ");
        int m = sc.nextInt();

        // Sort the marks array using selection sort
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (marks[j] > marks[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Swap marks
            int tempMark = marks[maxIndex];
            marks[maxIndex] = marks[i];
            marks[i] = tempMark;

            // Swap names
            String tempName = names[maxIndex];
            names[maxIndex] = names[i];
            names[i] = tempName;
        }

        // Display the names of m students with highest marks
        System.out.println("Students with highest marks:");
        for (int i = 0; i < m && i < n; i++) {
            System.out.println(names[i]);
        }
        sc.close();
    }
}
