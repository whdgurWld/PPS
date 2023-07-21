import java.util.ArrayList;
import java.util.List;

class A037 {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<Integer>();

        for(int i = left; i <= right; i++){
            boolean cond = true;
            for(int j = 0; j < String.valueOf(i).length(); j++){
                if(String.valueOf(i).charAt(j) == '0'){
                    cond = false;
                }
                
                else if(i % (String.valueOf(i).charAt(j) - '0') != 0){
                    cond = false;
                }
            }

            if(cond == true){
                list.add(i);
            }
        }


        return list;
    }
}