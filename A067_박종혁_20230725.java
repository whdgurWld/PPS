class Solution {
    public String removeDuplicates(String s) {

        StringBuilder sb = new StringBuilder(s);
        
        int i = 1;
        while(sb.length() > i){
            if(sb.charAt(i-1) == sb.charAt(i) && sb.charAt(i) != ' '){
                sb.replace(i-1, i+1, "");

                if(i - 1 > 0) i--;
                else if(i < sb.length());
                else break; 
            }
            else{
                i++;
            }
        }


        return sb.toString();
    }
}