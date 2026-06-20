import java.util.Stack;

public class nonpattern {
    public int evalRPN (String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int num2 = stack.pop();
                int num1 = stack.pop(); 
                if (token.equals("+")) {
                    stack.push(num1 + num2);
                } else if (token.equals("-")) {
                    stack.push(num1 - num2);
                } else if (token.equals("*")) {
                    stack.push(num1 * num2);
                } else if (token.equals("/")) {
                    stack.push(num1 / num2);
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }


    public static void main(String[] args) {
        nonpattern ans = new nonpattern();
        System.out.println(ans.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
    }
}