import java.util.ArrayList;
import java.util.List;

class A002 {
    // public static void main(String args[]){

    //     int num = 5;
    //     Solution s = new Solution();

    //     List<List<Integer>> result = s.generate(num);
        
    //     System.out.println(result.get(4).get(2));
        
    // }

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