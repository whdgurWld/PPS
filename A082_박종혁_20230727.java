import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(in.readLine());

        String[][] h = new String[N][2];
        for(int i = 0; i < N; i++){
            String[] tmp = in.readLine().split(" ");
            h[i] = tmp;
        }

        Arrays.sort(h, new Comparator<String[]>(){
            public int compare(String str1[], String str2[]) {
                return Integer.parseInt(str1[0]) - Integer.parseInt(str2[0]);
            }
        });

        for(int i = 0; i < N; i++){
            System.out.println(h[i][0] + " " + h[i][1]);
        }

        

    }

}
