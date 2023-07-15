class A012 {

    // public static void main(String args[]){
    //     int n = 10;
    //     Solution s = new Solution();

    //     int result = s.countPrimes(n);
    //     System.out.println("Result: " + result);
    // }

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
