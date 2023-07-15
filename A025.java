class A025 {
    // public static void main(String args[]){
    //     int num = 3;
    //     Solution s = new Solution();

    //     boolean result = s.isPowerOfFour(num);
    //     System.out.println("Result: " + result);
    // }

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
