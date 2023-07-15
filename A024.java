class A024 {
    // public static void main(String args[]){
    //     int nums[] = {5,5,10,10,20};
    //     Solution s = new Solution();

    //     boolean result = s.lemonadeChange(nums);
    //     System.out.println("Result: " + result);
    // }

    public boolean lemonadeChange(int[] bills) {
        boolean result = true;
        int bill_count[] = {0,0,0};

        for(int i = 0; i < bills.length; i++){
            if(bills[i] == 5) bill_count[0]++;
            else if(bills[i] == 10){
                bill_count[1]++;
                if(bill_count[0] == 0){
                    result = false;
                    break;
                }
                bill_count[0]--;
            }
            else if(bills[i] == 20){
                bill_count[2]++;

                if(bill_count[0] >= 1 && bill_count[1] >= 1){
                    bill_count[0]--;
                    bill_count[1]--;
                }

                else if(bill_count[0] >= 3 && bill_count[1] < 1){
                    bill_count[0]-=3;
                }
                
                else{
                    result = false;
                    break;
                }
            }

        }


        return result;
    }
}
