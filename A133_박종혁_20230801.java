class Solution {

    public String capitalizeTitle(String title) {

        String answer = "";

        String[] tmp = title.split(" ");

        for(int i = 0; i < tmp.length; i++){
            if(tmp[i].length() <= 2) answer+= tmp[i].toLowerCase();
            else{
                String t = "";
                tmp[i] = tmp[i].toLowerCase();
                t+= (char) (tmp[i].charAt(0) - 'a' + 'A');
                t+= tmp[i].substring(1, tmp[i].length());
                answer+= t;
            }

            if(i != tmp.length - 1){
                answer+= " ";
            }

        }

        return answer;
    }
}