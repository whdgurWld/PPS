import java.util.Scanner;


class Main {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());

        int count = 0;
        for(int i = 0; i < N ; i++){
            int[] arr = new int[26];
            String s = in.nextLine();
            boolean cond = true;


            int no = s.charAt(0);
            arr[no - 97]++;
            for(int j = 1; j < s.length(); j++){
                no = s.charAt(j);
                if((int)s.charAt(j-1) == no){

                }
                else if(arr[no - 97] > 0){
                    cond = false;
                    break;
                }
                arr[no - 97]++;

            }

            if(cond == true){
                count++;
            }
        }
        in.close();

        System.out.println(count);

    }

}
