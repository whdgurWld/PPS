import java.util.Stack;

class Solution {

    public String solution(String number, int k) {
        int size = number.length() - k;
        String answer = "";
        Stack<Character> stack = new Stack<>();


        for(int i = 0 ; i<number.length(); i++){
            while(!stack.isEmpty() && stack.peek()<number.charAt(i) && k-->0) 
                stack.pop();
            stack.push(number.charAt(i));
        }

        for(int i = 0; i < size; i++){
            answer += stack.get(i);
        }
        
        // StringBuilder newStr = new StringBuilder(number);

        // int j;
        // for(int i = 0; i < k; i++){
            
        //     for(j = 0; j < newStr.length() - 1; j++){
        //         if(newStr.charAt(j) - '0' < newStr.charAt(j+1) - '0') break;

        //     }
        //     newStr.deleteCharAt(j);
        // }
        // return newStr.toString();
        return answer;
    }
        
}



