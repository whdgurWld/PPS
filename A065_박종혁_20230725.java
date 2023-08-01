import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());

        int[][] answer = new int[N][2];
        for(int i = 0; i < N; i++){
            String line = in.nextLine();
            String[] tmp = line.split(" ");

            int[] int_temp = new int[2];
            int_temp[0] = Integer.parseInt(tmp[0]);
            int_temp[1] = Integer.parseInt(tmp[1]);

            answer[i] = int_temp;
        }

        in.close();

        //Comparator 개념: 양수냐 음수냐에 따라서 정렬을 할지 안할지 정함.
        Arrays.sort(answer, new Comparator<int[]>(){
            public int compare(int int1[], int int2[]){
                if(int1[0] == int2[0])
                    return int1[1]-int2[1]; //오름차순. 내림차순: n2[1] - n1[1]; (같을때는 1번째 index 사용해서 비교.)
                else
                    return int1[0]-int2[0]; //(다를때는 0번째 index 사용해서 비교.)
            }
        });

        for(int i = 0; i < N; i++){
            System.out.println(answer[i][0] + " " + answer[i][1]);
        }

    }

    

}
