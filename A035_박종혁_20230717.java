import java.util.Scanner;

class Main {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        for(int i = 0; i < n ; i++){
            String str = in.nextLine();
            String tmp[] = str.split(" ");

            double result = Double.parseDouble(tmp[0]);
            for(int j = 1; j < tmp.length; j++){

                if(tmp[j].equals("@")){
                    result = result*3;
                }
                else if(tmp[j].equals("%")){
                    result = result + 5;
                }
                else if(tmp[j].equals("#")){
                    result = result - 7;
                }
            }
            System.out.println(String.format("%.2f", result));
        }
        
        in.close();
    }

}
