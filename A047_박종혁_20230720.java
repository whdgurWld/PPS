import java.util.Scanner;


class Main {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();

        for(int i = 0; i < s.length(); i++){
            if( (i+1) % 10 == 0){
                System.out.println(s.charAt(i));    
            }
            else System.out.print(s.charAt(i));
        }

    }

}
