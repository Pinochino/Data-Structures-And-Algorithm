package Tutorial8;
import java.util.Stack;

public class PostfixEvaluation {

    private int top;
    private String[] s;
    private int maxSize;

    public PostfixEvaluation(){
        maxSize = 100;
        s = new String[maxSize];
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == maxSize - 1;
    }

    public void push(String item){
        if (!isFull()) {
            top++;
            s[top] = item;
        }
    }

    public String pop(){
        if (!isEmpty()) {
            String tmp = s[top];
            top--;
            return tmp;
        } else {
            return  null;
        }
    }

    public String peak(){
        if (!isEmpty()) {
            return s[top];
        } else {
            return null;
        }
    }

    public int precedence(String operator) {
        switch (operator) {
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
            default:
                return 0;
        }
    }

    public void postfixEvaluation(String infix) {
        String[] tokens = infix.split("\\s+");
        Stack<String> stack = new Stack<>();

        for (String token : tokens) {
            if (token.isEmpty()) {
                continue;
            } else if (Character.isDigit(token.charAt(0))) {
                System.out.print(token + " ");
            } else if (token.equals("(")) {
                stack.push(token);
            } else if (token.equals(")")) {
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    System.out.print(stack.pop() + " ");
                }
                if (!stack.isEmpty()) {
                    stack.pop(); // Discard the left parenthesis
                }
            } else {
                while (!stack.isEmpty() && precedence(token) <= precedence(stack.peek())) {
                    System.out.print(stack.pop() + " ");
                }
                stack.push(token);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static void main(String[] args) {
        PostfixEvaluation evaluator = new PostfixEvaluation();
        String expression = "(1+3)*((2-4)+5*7)";
        System.out.print("Postfix expression: ");
        evaluator.postfixEvaluation(expression);
    }
}
