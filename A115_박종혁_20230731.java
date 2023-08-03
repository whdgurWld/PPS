class Solution {

    public int maxNumberOfBalloons(String text) {
        int count = 0;

        int[] letter_count = new int[5];
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == 'b') letter_count[0]++;
            else if(text.charAt(i) == 'a') letter_count[1]++;
            else if(text.charAt(i) == 'l') letter_count[2]++;
            else if(text.charAt(i) == 'o') letter_count[3]++;
            else if(text.charAt(i) == 'n') letter_count[4]++;
        }

        while(true){
            if(letter_count[0] > 0 && letter_count[1] > 0 && letter_count[2] > 1 && letter_count[3] > 1 && letter_count[4] > 0){
                count++;
                letter_count[0]--;
                letter_count[1]--;
                letter_count[2]-=2;
                letter_count[3]-=2;
                letter_count[4]--;
            }
            else{
                break;
            }
        }


        return count;
    }
}