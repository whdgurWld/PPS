import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());

        int answer[] = new int[N*2];
        int count = 0;
        int c_count = 0;
        int i;
        for(i = 1; i <= N; i++){
            answer[i-1] = i;
        }
        while(c_count < N - 2){
            
            if(count % 2 == 0){
                count++;
            }
            else{
                answer[N+c_count] = answer[count];
                count++;
                c_count++;
            }
        }

        System.out.println(answer[N+c_count-1]);

    }

}
