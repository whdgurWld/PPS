import java.util.Scanner;

class Main {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        String[] tmp = in.nextLine().split(" ");
        in.close();
        int start = Integer.parseInt(tmp[0]);
        int end = Integer.parseInt(tmp[1]);

        int[] nums = new int[end];

        int count = 0;
        int num = 1;
        for(int i = 0; i < end; i++){
            if(count < num){
                nums[i] = num;
                count++;
            }
            if(count == num){
                count = 0;
                num++;
            }
        }
        
        int sum = 0;
        for(int i = start-1; i < end; i++){
            sum+= nums[i];
        }

        System.out.println(sum);

    }

    

}
