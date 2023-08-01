class Solution {
    
    public String solution(int a, int b) {

        int day = dayCal(a, b);

        day = day % 7;

        if(day == 0) return "THU";
        else if(day == 1) return "FRI";
        else if(day == 2) return "SAT";
        else if(day == 3) return "SUN";
        else if(day == 4) return "MON";
        else if(day == 5) return "TUE";
        else return "WED";
    }
    public static int dayCal(int a, int b){
        int day = b;
        if(a >= 2) day+= 31;
        if(a >= 3) day+= 29;
        if(a >= 4) day+= 31;
        if(a >= 5) day+= 30;
        if(a >= 6) day+= 31;
        if(a >= 7) day+= 30;
        if(a >= 8) day+= 31;
        if(a >= 9) day+= 31;
        if(a >= 10) day+= 30;
        if(a >= 11) day+= 31;
        if(a >= 12) day+= 30;

        return day;
    }
}

