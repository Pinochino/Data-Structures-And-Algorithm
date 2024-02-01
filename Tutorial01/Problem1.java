package Tutorial01;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String myName = input.nextLine().toUpperCase();
		myName.replaceAll("\\s+$", "");
		for(int i = 0; i < myName.length(); i++){
		}
		System.out.print(myName.length());
		input.close();
	}
}

