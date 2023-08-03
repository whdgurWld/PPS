import java.util.Scanner;

class Main {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());

        for(int i = 0; i < N; i++){
            String num = in.nextLine();
            StringBuilder sb = new StringBuilder(num);
            sb.reverse();

            int sum = 0;
            for(int j = 0; j < num.length(); j++){
                sum+= Math.pow(10, j)*((num.charAt(j) - '0') + (sb.charAt(j) - '0'));
            }

            String sumStr = String.valueOf(sum);
            if(isSym(sumStr)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }



        in.close();


    }
    public static boolean isSym(String sum){
        boolean cond = true;

        for(int i = 0; i < sum.length(); i++){
            if(sum.charAt(i) != sum.charAt(sum.length()-1-i)){
                cond = false;
                break;
            }
        }

        return cond;
    }

    

}
