import java.util.ArrayList;

class Solution {

    public int[] plusOne(int[] digits) {
        

        ArrayList<Integer> h = new ArrayList<Integer>();

        

        for(int i = 0 ; i < digits.length; i++){
            h.add(digits[i]);
        }

        int count = 0;
        while(true){
            if(h.size() - 1 - count < 0){
                h.add(0, 1);
                break;
            }
            int num = h.get(h.size() - 1 - count) + 1;
            if(num <= 9){
                h.set(digits.length - 1 - count, num);
                break;
            }
            h.set(digits.length - 1 - count, 0);
            count++;
        }

        int[] answer = new int[h.size()];
        for(int i = 0; i < h.size(); i++){
            answer[i] = h.get(i);
        }

        return answer;

    }
}