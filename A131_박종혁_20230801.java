import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(in.readLine());

        Stack<Integer> stack = new Stack<Integer>();        
        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(in.readLine());
            if(num == 0){
                stack.pop();
            }
            else{
                stack.push(num);
            }
        }

        int sum = 0;
        for(int i = 0; i < stack.size(); i++){
            sum+= stack.get(i);
        }

        System.out.println(sum);

    }


}
