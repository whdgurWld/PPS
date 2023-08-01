import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;


class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(in.readLine());

        LinkedList<Integer> h = new LinkedList<Integer>();

        String[] tmp = in.readLine().split(" ");
        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(tmp[i]);
            if(h.contains(num));
            else{
                h.add(num);
            }
        }

        Collections.sort(h);

        for(int i = 0; i < h.size(); i++){
            System.out.println(h.toArray()[i]);
        }

        

    }

}
