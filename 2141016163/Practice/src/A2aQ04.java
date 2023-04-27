import java.util.Stack;

public class A2aQ04 {
	public static int evaluate(String s) {
		Stack<Integer> stack = new Stack<>();
		for(int i =0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c<='9' && c>='0') {
				stack.push(c-'0');
			}
			else {
				int val1 = stack.pop();
                int val2 = stack.pop();
 
                switch (c) {
                case '+':
                    stack.push(val2 + val1);
                    break;
                case '-':
                    stack.push(val2 - val1);
                    break;
                case '/':
                    stack.push(val2 / val1);
                    break;
                case '*':
                    stack.push(val2 * val1);
                    break;
                }	
			}
		}
		return stack.pop();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(evaluate("54+"));
	}

}
