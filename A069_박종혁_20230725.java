import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;


class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String tmp = in.readLine();
        String[] t = tmp.split(" ");
        int N = Integer.parseInt(t[0]);
        int k = Integer.parseInt(t[1]);
        
        LinkedList<Integer> Q = new LinkedList<Integer>();

        for(int i = 1; i <= N; i++){
            Q.add(i);
        }

        int latest = 0;
        System.out.print("<");
        for(int i = 0; i < N; i++){
            latest+= (k-1);

            latest = latest % Q.size();

            if(i != N - 1) System.out.print(Q.get(latest) + ", ");
            else System.out.print(Q.get(latest));
            Q.remove(latest);


        }
        System.out.print(">");

    }

    

}
