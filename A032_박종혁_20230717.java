import java.util.Scanner;

class Main {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        
        int T = in.nextInt();

        for(int i = 0; i < T ; i++){
            int k = in.nextInt();
            int n = in.nextInt();
            int[] floor = new int[n];
            int[] new_floor = new int[n];

            int level = 0;
            while(level <= k){
                new_floor = new int[n];
                for(int j = 1; j <= n; j++){
                    if(level == 0) new_floor[j-1] = j;
                    else{
                        for(int a = 0; a < j; a++){
                            new_floor[j-1]+= floor[a];
                        }
                    }
                }

                level++;
                floor = new_floor;
            }
            System.out.println(floor[n-1]);
        }

        in.close();

        
    }

}
