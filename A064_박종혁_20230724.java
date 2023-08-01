import java.util.Arrays;

class Solution {

    public int heightChecker(int[] heights) {
        int answer = 0;

        int[] tmp = heights.clone();
        Arrays.sort(tmp);

        for(int i = 0; i < heights.length; i++){
            if(heights[i] != tmp[i]) answer++;
        }

        return answer;
    }
}