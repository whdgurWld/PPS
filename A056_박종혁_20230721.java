class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] answer = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++){
            int j, current_num = 0;
            for(j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    current_num = nums1[i];
                    break;
                }
            }

            if(j == nums2.length - 1){
                answer[i] = -1;
            }
            else{
                boolean cond = false;
                while(j < nums2.length){
                    if(current_num < nums2[j]){
                        answer[i] = nums2[j];
                        cond = true;
                        break;
                    }

                    j++;
                }

                if(cond == false){
                    answer[i] = -1;
                }
            }
            
        }


        return answer;
    }
}