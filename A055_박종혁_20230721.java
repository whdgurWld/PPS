import java.util.Stack;

class Solution {

    public String removeOuterParentheses(String s) {
        String answer = "";
        String tmp = "";

        Stack<Character> stack = new Stack<Character>();

        int start = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(s.charAt(i));
            }
            else{
                stack.pop();
                if(stack.empty()){
                    tmp = s.substring(start + 1, i);
                    answer+= tmp;
                    start = i + 1;
                }
            }
        }

        return answer;
    }
}