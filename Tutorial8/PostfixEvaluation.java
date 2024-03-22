package Tutorial8;

public class PostfixEvaluation {

    private final int maxSize = 100;
    private final String[] arr;
    private int top;

    public PostfixEvaluation() {
        arr = new String[maxSize];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(String newItem) {
        if (!isFull()) {
            top++;
            arr[top] = newItem;
        } else {
            System.out.println("Stack is full");
        }
    }

    public String pop() {
        if (!isEmpty()) {
            String item = arr[top];
            top--;
            return item;
        }
        System.out.println("The stack is empty");
        return null;
    }

    public int postfixEvaluation(String a) {
        for (int i = 0; i < a.length(); i++) {
            char symbol = a.charAt(i);
            if (symbol == ' ') {
                continue;
            } else if (Character.isDigit(symbol)) {
                int n = 0;

                while (Character.isDigit(symbol)) {
                    n = n * 10 + (symbol - '0');
                    i++;
                    symbol = a.charAt(i);
                }
                i--;
                push(Integer.toString(n));
            } else {
                int val1 = Integer.parseInt(pop());
                int val2 = Integer.parseInt(pop());
                switch (symbol) {
                    case '+':
                        push(Integer.toString(val1 + val2));
                        break;
                    case '-':
                        push(Integer.toString(val2 - val1));
                        break;
                    case '/':
                        if (val1 != 0) {
                            push(Integer.toString(val2 / val1));
                        } else {
                            System.out.println("Cannot divide by zero");
                            return 0;
                        }
                        break;
                    case '*':
                        push(Integer.toString(val1 * val2));
                        break;
                }
            }
        }
        return Integer.parseInt(pop());
    }

    public static void main(String[] args) {
        PostfixEvaluation evaluator = new PostfixEvaluation();
        String expression = "100 200 + 2 / 5 * 7 +";
        int result = evaluator.postfixEvaluation(expression);
        System.out.println("Result of postfix expression: " + result);
    }
}
