import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(in.readLine());

        String[] num = new String[N];
        for(int i = 0; i < N; i++){
            num[i] = in.readLine();
        }
        
        Arrays.sort(num, new Comparator<String>(){
            public int compare(String str1, String str2) {
                if(str1.length() < str2.length()){
                    return -1;
                }
                else if(str1.length() == str2.length()){
                    if(getSum(str1) == getSum(str2)) return str1.compareTo(str2);
                    return getSum(str1) - getSum(str2);
                }
                else{
                    return 1;
                }
            }
        });

        for(int i = 0; i < N; i++){
            System.out.println(num[i]);
        }
    }

    public static int getSum(String str){
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9') sum+= str.charAt(i) - '0';
        }

        return sum;
    }

}
