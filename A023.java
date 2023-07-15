class A023 {
    // public static void main(String args[]){
    //     int nums = 38;
    //     Solution s = new Solution();

    //     int result = s.addDigits(nums);
    //     System.out.println("Result: " + result);
    // }

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