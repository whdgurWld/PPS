class A039 {

    
    public boolean isPerfectSquare(int num) {
        boolean cond = false;

        long start = 0;
        long end = num;

        while(start <= end){
            long mid = start + (end - start)/2;
            if(mid*mid == num){
                cond = true;
                break;
            }
            
            if( mid*mid < num) start = mid + 1;
            else end = mid - 1;

            
        }


        return cond;
    }

    
}