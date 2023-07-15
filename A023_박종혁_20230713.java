class Solution {

    public int addDigits(int num) {
        String tmp = String.valueOf(num);

        int temp = Character.getNumericValue(tmp.charAt(0));
        while(tmp.length() != 1){
            temp = 0;
            for(int i = 0; i < tmp.length(); i++){
                System.out.println(tmp.charAt(i));
                temp+= Character.getNumericValue(tmp.charAt(i));
            }
            tmp = String.valueOf(temp);
           
        }

        return temp;
    }
}