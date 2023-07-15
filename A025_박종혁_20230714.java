class Solution {

    public boolean isPowerOfFour(int n) {
        int i = 0;
        
        boolean result = false;
        while(Math.pow(4,i) <= n){
            if(Math.pow(4,i) == n){
                result = true;
                break;
            }
            i++;
        }
        return result;
    }

}
