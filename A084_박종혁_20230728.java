import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;


class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        String str = in.readLine();

        LinkedList<String> h = new LinkedList<String>();

        for(int i = 0; i < str.length(); i++){
            String tmp = str.substring(i, str.length());
            h.add(tmp);
        }

        Collections.sort(h);

        for(int i = 0; i < h.size(); i++){
            System.out.println(h.toArray()[i]);
        }

        

    }

}
