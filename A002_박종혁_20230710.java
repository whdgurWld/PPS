import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> h = new ArrayList<List<Integer>>();
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        tmp.add(1);
        h.add(tmp);

        for(int i = 1; i < numRows; i++){
            tmp = new ArrayList<Integer>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i ) tmp.add(1);
                else tmp.add(h.get(i-1).get(j-1)+ h.get(i-1).get(j));
            }
            h.add(tmp);
        }

        return h;
    }  
}