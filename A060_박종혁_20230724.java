import java.util.Stack;

class Solution {

    public int calPoints(String[] operations) {
        Stack<Integer> h = new Stack<Integer>();

        for(int i = 0; i < operations.length; i++){
            
            if(operations[i].equals("+")){
                h.push(h.get(h.size() -1) + h.get(h.size() - 2));
            }
            else if(operations[i].equals("D")){
                h.push(h.get(h.size() -1) * 2);
            }
            else if(operations[i].equals("C")){
                h.pop();
            }
            else{
                h.push(Integer.parseInt(operations[i]));
            }

        }

        int count = 0;
        for(int i = 0; i < h.size(); i++){
            count+= h.get(i);
        }

        return count;
    }
}