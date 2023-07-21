import java.util.Scanner;


class Main {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();
        String answer = "";
        for(int i = 0; i < s.length(); i++){
            int c_num = s.charAt(i);

            if(c_num - 65 - 3 >= 0){
                answer+= (char) (c_num - 3);
            }
            else{
                answer+= (char) (c_num + 26 - 3);
            }
        }

        System.out.println(answer);
    }

}
