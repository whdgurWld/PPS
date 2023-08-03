
import java.util.Scanner;
import java.util.Stack;


class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        String str = in.nextLine();

        Stack<Character> stack = new Stack<Character>();
        
        while(!str.equals(".")){
            
            stack.clear();
            boolean cond = true;
            
            for(int i = 0; i < str.length(); i++){
                char tmp = str.charAt(i);
                if(tmp == '(' || tmp == '['){
                    stack.push(tmp);
                }

                else if(tmp== ')'){
                    if(stack.empty() || stack.peek() != '('){
                        cond = false;
                        break;
                    }
                    else{
                        stack.pop();
                    }
                } 

                else if(tmp == ']'){
                    if(stack.empty() || stack.peek() != '['){
                        cond = false;
                        break;
                    }
                    else{
                        stack.pop();
                    }
                }
            }

            if(stack.empty() && cond == true){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }

            str = in.nextLine();

        }

        in.close();


    }

}
