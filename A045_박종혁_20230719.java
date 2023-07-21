import java.util.Scanner;


class Main {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        String n = in.nextLine();

        n = n.toUpperCase();
        in.close();

        int[] arr = new int[26];

        for(int i = 0; i < n.length(); i++){
            arr[(int)(n.charAt(i)) - 65] = arr[(int)(n.charAt(i)) - 65]  + 1;
        }

        int max = arr[0];
        int max_index = 0;

        for(int i = 1; i < 26; i++){
            if(max < arr[i]){
                max = arr[i];
                max_index = i;
            }
        }

        for(int i = 0; i < 26; i++){
            if(max == arr[i] && max_index != i){
                max = -1;
            }
        }

        if(max == -1){
            System.out.println("?");
        }
        else{
            System.out.println((char) (max_index+65));
        }

    }

}
