class Solution {
    
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int n1 = 0;
        int i;
        int count_1 = 0;
        for(i = start; i < distance.length; i++){
            if(i == destination) break;
            else{
                n1+= distance[i];
                count_1++;
            }
        }
        if(i != destination){
            for(i = 0; i < destination; i++){
                n1+= distance[i];
                count_1++;
            }
        }

        int n2 = 0;
        int j = start;
        int count = 0;
        while(count < distance.length - (count_1)){
            j--;
            if(j < 0){
                j = distance.length + j;
            }
            n2+= distance[j];
            count++;
        }


        return n1 < n2 ? n1 : n2;

    }

}