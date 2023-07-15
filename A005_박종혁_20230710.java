class Solution {

    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        
        for(int i = 0; i < skill_trees.length; i++){
            boolean flag = true;
            int skill_num = 0;

            for(int j = 0; j < skill_trees[i].length() ; j++){
                
                if(skill_num == skill.length()){
                    break;
                }
                if(skill.charAt(skill_num) == skill_trees[i].charAt(j)){ 
                    skill_num++;
                }

                else{
                    for(int k = 0; k < skill.length(); k++){
                        if(skill.charAt(k) == skill_trees[i].charAt(j)){
                            flag = false;
                        }
                    }
                }
            }

            if(flag == true){ 
                answer++;
            }
        }
        
        
        
        return answer;
    }
}