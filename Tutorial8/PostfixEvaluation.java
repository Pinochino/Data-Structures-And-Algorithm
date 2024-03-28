package Tutorial8;

public class PostfixEvaluation {

    public static class ArrayStack {

        private int top;
        private int[] stack;
        private int maxSize;
    
        public ArrayStack() {
            maxSize = 100;
            stack = new int[maxSize];
            top = -1;
        }
    
        public boolean isEmpty() {
            return top == -1;
        }
    
        public boolean isFull() {
            return top == maxSize - 1;
        }
    
        public void push(int item) {
            if (!isFull()) {
                top++;
                stack[top] = item;
            }
        }
    
        public Integer pop() {
            if (!isEmpty()) {
                int tmp = stack[top];
                top--;
                return tmp;
            } else {
                return null;
            }
        }
    
        public Integer peek() {
            if (!isEmpty()) {
                return stack[top];
            } else {
                return null;
            }
        }
    }

    public static ArrayStack stack = new ArrayStack();

    static int postfixEvaluation(String a) {
        
        for (int j = 0; j < a.length(); j++) {
            char c = a.charAt(j);
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int val1 = stack.pop();
                int val2 = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(val2 + val1);
                        break;
                    case '-':
                        stack.push(val2 - val1);
                        break;
                    case '*':
                        stack.push(val2 * val1);
                        break;
                    case '/':
                        stack.push(val2 / val1);
                        break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String exp = "231*+9-";
        System.out.println("postfix evaluation: " + postfixEvaluation(exp));
    }
}
