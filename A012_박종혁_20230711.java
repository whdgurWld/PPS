class Solution {

    public int countPrimes(int n) {
        int count = 0;
        
        boolean[] prime = new boolean[n];

        for(int i = 2; i < n; i++){
            if(!prime[i]){
                count++;
                int j = 1;
                while(i*j < n){
                    prime[i*j] = true;
                    j++;
                }
            }
        }

        
        return count;
    }    
  
}
