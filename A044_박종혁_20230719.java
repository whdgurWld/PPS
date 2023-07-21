class A044 {

    public boolean checkRecord(String s) {
        boolean pass = true;

        int A_count = 0;
        int L_count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'A'){
                A_count++;
                L_count = 0;
                if(A_count == 2){
                    pass = false;
                    break;
                }
            }

            else if(s.charAt(i) == 'L'){
                L_count++;
                if(L_count == 3){
                    pass = false;
                    break;
                }
            }
            else{
                L_count = 0;
            }
        }


        return pass;
    }
}