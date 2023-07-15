#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> arr, int divisor) {
    vector<int> answer;


    for(int i = 0; i < arr.size(); i++){
        if(arr[i] % divisor == 0){
            answer.push_back(arr[i]);
        }
    }


    if(answer.empty()) answer.push_back(-1);

    for (int j = 1; j < answer.size(); j++) {
        int temp = answer[j];
        int k = j-1;
        while ((k >= 0)&&(answer[k] > temp)) {
            answer[k + 1] = answer[k];
            k--;
        }
        answer[k + 1] = temp;
    }

    return answer;
}

