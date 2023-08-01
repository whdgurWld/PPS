import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;


class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        
        LinkedList<Integer> Q = new LinkedList<Integer>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++){
            StringTokenizer tmp = new StringTokenizer(in.readLine(), " ");

            String a= tmp.nextToken();

            if(a.equals("push")) Q.add(Integer.parseInt(tmp.nextToken()));

            else if(a.equals("pop")){
                if(Q.isEmpty()) sb.append(-1).append('\n');
                else sb.append(Q.poll()).append('\n');
            }
            
            else if(a.equals("size")){
                sb.append(Q.size()).append('\n');
            }

            else if(a.equals("empty")){
                if(Q.isEmpty()) sb.append("1").append('\n');
                else sb.append("0").append('\n');
            }

            else if(a.equals("front")){
                if(Q.isEmpty()) sb.append("-1").append('\n');
                else sb.append(Q.peek()).append('\n');
            }
            else if(a.equals("back")){
                if(Q.isEmpty()) sb.append("-1").append('\n');
                else sb.append(Q.peekLast()).append('\n');
            }

        }

        System.out.println(sb);

    }

    

}
