package DSA.Tutorial01;
// import java.text.DecimalFormat;
import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        System.out.println((double)Math.round(a * 1000) / 1000);
        double b = input.nextDouble();
        System.out.println((double) Math.round(b * 1000) / 1000);
        // DecimalFormat df = new DecimalFormat("#.###");
        // String roundA = df.format(a);
        // String roundB = df.format(b);
        // if(roundA.equals(roundB)){}
        
        if(a < b){
            System.out.println("The high number is: " + b);
        } else if (a == b){
            System.out.println("They are the same");
        } else {
            System.out.println("The high number is: " + a);
        }
        input.close();
    }
}
