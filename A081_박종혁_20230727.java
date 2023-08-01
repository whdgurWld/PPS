import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(in.readLine());

        for(int i = 0; i < N; i++){
            int arr[] = new int[10];
            String str = in.readLine();
            String[] tmp = str.split(" ");

            for(int j = 0 ; j < 10; j++){
                arr[j] = Integer.parseInt(tmp[j]);
            }
            
            Arrays.sort(arr);

            System.out.println(arr[7]);
        }

        

    }

}
