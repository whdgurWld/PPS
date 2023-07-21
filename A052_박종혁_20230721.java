import java.util.Scanner;


class Main {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());

        for(int i = 0 ; i < N; i++){
            String s = in.nextLine();
            int answer = 0;
            int o_count = 0;
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) == 'O'){
                    o_count++;
                    answer+=o_count;
                }
                else{
                    o_count = 0;
                }

            }
            System.out.println(answer);
        }

        in.close();
        
    }

    

}
