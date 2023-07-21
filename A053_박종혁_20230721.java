import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


class Main {
    public static void main(String args[]){

        Stack<Integer> stack = new Stack<Integer>();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = 0;
        try {
            N = Integer.parseInt(in.readLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(int i = 0; i < N; i++){
            String s = "";
            try {
                s = in.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            String[] tmp = s.split(" ");
            if(tmp[0].equals("push")){
                stack.push(Integer.parseInt(tmp[1]));
            }
            else if(s.equals("pop")){
                if(stack.empty()) System.out.println("-1");
                else System.out.println(stack.pop());
            }
            else if(s.equals("size")){
                System.out.println(stack.size());
            }
            else if(s.equals("empty")){
                if(stack.empty()) System.out.println("1");
                else System.out.println("0");
            }
            else if(s.equals("top")){
                if(stack.empty()) System.out.println("-1");
                else System.out.println(stack.lastElement());
            }

        }
        
        
    }

    

}
