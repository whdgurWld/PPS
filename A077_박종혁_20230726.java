import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int arr[] = new int[8];
        for(int i = 0 ; i < 8; i++){
            arr[i] = Integer.parseInt(in.readLine());
        }

        int nums[] = new int[5];
        int answer = 0;
        for(int i = 0; i < 5 ; i++){
            int max = 0;
            for(int j = 1; j < 8; j++){
                if(arr[max] < arr[j]) max = j;
            }
            answer+= arr[max];
            nums[i] = max;
            arr[max] = 0;
        }
        Arrays.sort(nums);

        System.out.println(answer);

        for(int i = 0; i < 5; i++){
            System.out.print((nums[i]+1) + " ");
        }

        

    }

}
