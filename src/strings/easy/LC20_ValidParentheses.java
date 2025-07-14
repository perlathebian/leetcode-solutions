package strings.easy;

import java.util.Map;
import java.util.Stack;

public class LC20_ValidParentheses {
    //STACK-BASED SOLUTION
//    public boolean isValid(String s) {
//        Stack<Character> stack = new Stack<>();
//        Map<Character, Character> pair = Map.of(
//                ')', '(',
//                '}', '{',
//                ']', '['
//        );
//
//        for(char ch : s.toCharArray()){
//            if(pair.containsValue(ch)){
//                stack.push(ch);
//            } else if(pair.containsKey(ch)){
//                if(stack.isEmpty() || stack.pop() != pair.get(ch)){
//                    return false;
//                }
//            } else {
//                return false; //character not valid
//            }
//        }
//        return stack.isEmpty();
//    }
    //PUSH EXPECTED CLOSERS SOLUTION
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(') stack.push(')');
            else if (ch == '[') stack.push(']');
            else if (ch == '{') stack.push('}');
            else if (stack.isEmpty() || stack.pop() != ch) return false;
        }

        return stack.isEmpty();
    }
}
