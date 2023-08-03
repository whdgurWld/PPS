class Solution {

    public String reversePrefix(String word, char ch) {

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < word.length(); i++){
            if(word.charAt(i) == ch){
                sb = new StringBuilder(word.substring(0, i+1));
                sb.reverse().append(word.substring(i+1, word.length()));
                break;
            }
        }

        if(sb.isEmpty()){
            return word;
        }

        return sb.toString();
    }
}