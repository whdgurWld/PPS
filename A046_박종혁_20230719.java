import java.util.Scanner;

class Main {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        int[] arr = new int[26];
        for(int i = 0; i < n ; i++){
            String name = in.nextLine();
            int no = name.charAt(0);
            arr[no - 97]++;
        }
        
        in.close();

        String answer = "";
        for(int i = 0; i < 26; i++){
            if(arr[i] >= 5){
                answer+= (char)(i+97);
            }
        }

        if(answer.length() == 0){
            System.out.println("PREDAJA");
        }
        else{
            System.out.println(answer);
        }
        

    }

}
