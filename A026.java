class A026 {
    // public static void main(String args[]){
    //     int num = 12;
    //     Solution s = new Solution();

    //     boolean result = s.solution(num);
    //     System.out.println("Result: " + result);
    // }

    public boolean solution(int x) {
        boolean answer = false;
  

        String tmp = String.valueOf(x);

        int sum = Character.getNumericValue(tmp.charAt(0));

        for(int i = 1; i < tmp.length(); i++){
            sum+=Character.getNumericValue(tmp.charAt(i));
        }

        if(x % sum == 0){
            answer = true;
        }

        return answer;
    }
}