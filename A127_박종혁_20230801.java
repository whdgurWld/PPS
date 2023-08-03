import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(in.readLine());

        for(int i = 0; i < N; i++){
            String[] tmp = in.readLine().split(" ");
            System.out.println(getLCM(tmp));
        }

    }
    public static int getLCM(String nums[]){
        int num1 = Integer.parseInt(nums[0]);
        int num2 = Integer.parseInt(nums[1]);

        int min = num1 < num2 ? num1 : num2;

        int GCD = 1;
        for(int i = 1; i <= min; i++){
            if(num1 % i == 0 && num2 % i == 0){
                GCD = i;
            }
        }

        return num1*num2 / GCD;  

    }


}
