class A013 {
    // public static void main(String args[]){
    //     int[] nums = {2,2,1};
    //     Solution s = new Solution();

    //     int result = s.singleNumber(nums);
    //     System.out.println("Result: " + result);
    // }

    public int singleNumber(int[] nums) {
        int num = nums[0];

        for(int i = 1; i < nums.length; i++){
            num = num ^ nums[i];

        }

        return num;

    }
}
