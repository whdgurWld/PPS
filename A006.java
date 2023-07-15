class A006 {
    
    boolean solution(String s) {
        boolean answer = true;

        int p, y;
        p = y = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P') p++;
            if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') y++;
        }

        if(y != p) answer = false;

        return answer;
    }
}