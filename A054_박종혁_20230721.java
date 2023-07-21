class Solution {

    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        int array[] = new int[board.length*board[0].length];

        int N = board.length;
        int count = 0;
        for(int i = 0; i < moves.length; i++){
            int no = (moves[i] - 1);

            for(int j = 0; j < N; j++){
                if(board[j][no] > 0){
                    array[count] = board[j][no];
                    board[j][no] = 0;
                    count++;
                    break;
                }

            }

            if(count > 0){
                for(int j = count - 1 ; j > 0; j--){
                    if(array[j] == array[j - 1]){
                        array[j] = array[j - 1] = 0;
                        answer+= 2;
                        count -= 2;
                        j--;
                    }
                }
            }

        }

        return answer;
    }
}