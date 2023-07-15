import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        
        String n = in.nextLine();
        String[] str = n.split(" ");
        String n1 = str[0];
        String n2 = str[1];
        in.close();

        int max_size;
        if(n1.length() > n2.length()) max_size = n1.length();
        else max_size = n2.length();

        int[] answer = new int[max_size+1];
        Arrays.fill(answer, 0);
        for(int i = 0; i < max_size; i++){
            int sum;
            if(n1.length() <= i){
                sum = (n2.charAt(n2.length() - 1 - i) - '0') + answer[max_size - i];
            }
            else if(n2.length() <= i){
                sum = (n1.charAt(n1.length() - 1 - i) - '0') + answer[max_size - i];
            }
            else{
                sum = (n1.charAt(n1.length() - 1 - i) - '0') + (n2.charAt(n2.length() - 1 - i) - '0') + answer[max_size - i];
            }
            if(sum > 9){
                answer[max_size-i] = (sum % 10);
                answer[max_size-i-1] = (sum / 10);
            }
            else{
                answer[max_size-i] = (sum);
            }
        }

        for(int i = 0; i < max_size + 1; i++){
            if(i == 0 && answer[i] == 0); 
            else if(i == max_size) System.out.println(answer[i]);
            else System.out.print(answer[i]);
        }


    }
}
