class A043 {

    public String longestCommonPrefix(String[] strs) {
        String answer = "";

        if(strs.length == 0);
        else{
            int min = strs[0].length();
            if(strs.length >= 1){
                for(int i = 1; i < strs.length; i++){
                    if(strs[i].length() < min) min = strs[i].length();
                }
            }
        
            if(min == 0){
            }
            else{
                char tmp= strs[0].charAt(0);
                boolean cond = true;
                int count = 0;
                while(count < min){
                    tmp = strs[0].charAt(count); 
                    for(int i = 0; i < strs.length; i++){
                        if(strs[i].charAt(count) == tmp);
                        else{
                            cond = false;
                            break;
                        }
                    }
                    if(cond == false){
                        break;
                    }
                    count++;
                    answer+= tmp;
                }
            }
        }



        return answer;
    }
}