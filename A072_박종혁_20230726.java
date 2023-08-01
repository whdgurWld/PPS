class Solution {

    public int dayOfYear(String date) {
        String[] tmp = date.split("-");

        int year = Integer.parseInt(tmp[0]);
        int month = Integer.parseInt(tmp[1]);
        int day = Integer.parseInt(tmp[2]);

        int answer = day;
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for(int i = 0; i < month - 1; i++){
            if(i == 1){
                if(isLeap(year)){
                    answer+= 1;
                }
            }
            answer+=days[i];
        }

        return answer;
    }
    public static boolean isLeap(int year){
        if (year % 400 == 0)
            return true;
        if (year % 100 == 0)
            return false;
        if (year % 4 == 0)
            return true;
        return false;
    }
}