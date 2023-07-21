import java.util.Scanner;

class Main {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        
        int N = in.nextInt();
        int M = in.nextInt();
        in.close();


        int count = (N-1) + N*(M-1);
        System.out.println(count);
    
    }
}
