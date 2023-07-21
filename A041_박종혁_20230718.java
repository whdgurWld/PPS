class A041 {

    public String solution(String s) {
        s = s.toLowerCase();
        char[] tmp = s.toCharArray();

        int cond = 1;
        for(int i = 0; i < tmp.length; i++){
            if(tmp[i] == ' '){
                cond = 1;
            }
            if(cond == 1 &&  tmp[i] >= 'a' && tmp[i] <= 'z'){
                tmp[i] = (char) (tmp[i] - 'a' + 'A');
                cond = 0;
            }
            if(cond == 1 && tmp[i] != ' '){
                cond = 0;
            }
        }
        return new String(tmp);
    }
}