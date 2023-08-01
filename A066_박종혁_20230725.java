import java.util.Scanner;

class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String N = in.nextLine();
        in.close();

        

        char[] array = N.toCharArray();

        char temp;
        for(int i = array.length - 1; i >= 1; i--){
            for(int j = 0; j < i; j++){
                if(array[j] < array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.println(new String(array));
    }

    

}
