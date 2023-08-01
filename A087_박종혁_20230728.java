import java.util.Arrays;
import java.util.Comparator;

class Solution {
    
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int count = 0;

        Arrays.sort(boxTypes, new Comparator<int[]>(){
            public int compare(int int1[], int int2[]){
                return int2[1] - int1[1];
            }
        });

        int place = 0;
        int answer = 0;
        while(truckSize > count){
            if(boxTypes[place][0] > 0){
                answer+= boxTypes[place][1];
                boxTypes[place][0]--;
                count++;
            }
            else{
                place++;
            }
        }


        return answer;
    }
}
