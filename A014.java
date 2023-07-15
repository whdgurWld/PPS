import java.util.List;
import java.util.ArrayList;

class A014 {
    // public static void main(String args[]){
    //     int[] nums = {0};
    //     Solution s = new Solution();

    //     List<String> result = s.summaryRanges(nums);
    //     System.out.println("Result: " + result);
    // }

    public List<String> summaryRanges(int[] nums) {
        
        List<String> ret = new ArrayList<String>();

        if(nums.length == 0){
            return ret;
        }
        
        int start = nums[0];
        int end;
        String tmp;
        
        if(nums.length == 1){
            tmp = start+"";
            ret.add(tmp);
        }
        
        
        for(int i = 1; i < nums.length; i++){
            
            if(i == nums.length - 1 && nums[i-1] != nums[i] - 1){
                end = nums[i-1];
                if(start == end){
                    tmp = start+"";
                }
                else{
                    tmp = start+"->"+end;
                }
                ret.add(tmp);

                tmp = nums[i]+"";
                ret.add(tmp);
            }
            else if(i == nums.length - 1){
                end = nums[i];
                tmp = start+"->"+end;
                ret.add(tmp);
            }

            else if(nums[i-1] != nums[i] - 1){
                


                end = nums[i-1];
                if(start == end){
                    tmp = start+"";
                }
                else{
                    tmp = start+"->"+end;
                }
                ret.add(tmp);

                start = nums[i];
            }


        }

        return ret;

    }
}
