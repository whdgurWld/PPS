import java.util.Scanner;

class Main {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        in.close();

        N = 1000 - N;

        int[] cash = {500, 100, 50, 10, 5, 1};

        int count = 0;
        int i = 0;
        while(N > 0){
            if(N >= cash[i]){
                N-= cash[i];
                count++;
            }
            else{
                i++;
            }
        }
        
        System.out.println(count);

    }

}
