class A040 {

    public boolean halvesAreAlike(String s) {
        String str = s.toLowerCase();

        int n1 = 0, n2 = 0;
        for(int i = 0; i < str.length(); i++){
            
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'i' || str.charAt(i) == 'u'){
                if(i < str.length()/2){
                    n1++;
                }
                else{
                    n2++;
                }
            }
            
        }


        return n1 == n2;
    }
}