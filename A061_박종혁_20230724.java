
class Solution {

    public String convertToTitle(int columnNumber) {
        String answer = "";

        String tmp = "";
        if(columnNumber >= 27){
            while(columnNumber >= 27){
                int remainder = (columnNumber - 1) % 26;
                System.out.println(remainder);
                tmp+= (char) (remainder + 65);
                columnNumber = (columnNumber - 1) / 26;
            }
            System.out.println(columnNumber);
            tmp+= (char) (columnNumber + 64);
        }

        else{
            System.out.println(columnNumber);
            tmp+= (char) (columnNumber + 64);
        }

        for(int i = 0; i < tmp.length(); i++){
            answer+= tmp.charAt(tmp.length() - 1 - i);
        }
        return answer;
    }
}