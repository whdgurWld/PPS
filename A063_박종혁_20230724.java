import java.util.Arrays;

class Solution {

    public String addBinary(String n1, String n2) {

        int max_size;
        if(n1.length() > n2.length()) max_size = n1.length();
        else max_size = n2.length();

        int[] answer = new int[max_size+1];
        Arrays.fill(answer, 0);
        for(int i = 0; i < max_size; i++){
            int sum;
            if(n1.length() <= i){
                sum = (n2.charAt(n2.length() - 1 - i) - '0') + answer[max_size - i];
            }
            else if(n2.length() <= i){
                sum = (n1.charAt(n1.length() - 1 - i) - '0') + answer[max_size - i];
            }
            else{
                sum = (n1.charAt(n1.length() - 1 - i) - '0') + (n2.charAt(n2.length() - 1 - i) - '0') + answer[max_size - i];
            }
            if(sum > 1){
                answer[max_size-i] = sum - 2; 
                answer[max_size-i-1] = sum / 2;
            }
            else{
                answer[max_size-i] = (sum);
            }
        }


        String ret = "";
        for(int i = 0; i < max_size + 1; i++){
            if(i == 0 && answer[i] == 0); 
            else if(i == max_size) ret +=answer[i];
            else ret +=answer[i];
        }

        return ret;

    }
}
