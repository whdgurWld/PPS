class A009 {
    // public static void main(String args[]){
    //     String str = "1a23345";
    //     Solution s = new Solution();

    //     boolean result= s.solution(str);
    //     System.out.println(result);
    // }

    public boolean solution(String s) {
        int c, n;
        c = n = 0;

        if(s.length() == 4 || s.length() == 6);
        else return false;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') n++;
            else if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) c++;
        }
        
        return c == 0 && n > 0;
    }
}

