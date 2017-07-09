//来自网友 runtime:10ms
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}


//看了网友的自己写
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character> ();
        for(int i = 0; i < s.length(); i++){  //网友用的是s.toCharArray()
            if(s.charAt(i) == '(')
                stack.push(')');
            else if(s.charAt(i) == '[')
                stack.push(']');
            else if(s.charAt(i) =='{')
                stack.push('}');
            else if(stack.isEmpty() == true || stack.pop() != s.charAt(i))
                return false;
        }
        return stack.isEmpty();
    }
}
