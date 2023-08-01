class Solution {
    
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s= s.replaceAll("[^A-Za-z0-9]+", "");

        boolean cond = true;
        if(s.length() == 0){
            return true;
        }
        else{
            for(int i = 0; i < s.length()/2; i++){
                if(s.charAt(i) != s.charAt(s.length()-i-1)){
                    cond = false;
                    break;
                }
            }
        }

        return cond ;
    }
}