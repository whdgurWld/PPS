#include <iostream>
using namespace std;

int main() {
    int N, M1;

    cin >> N;
    cin >> M1;
    if(N > 5) cout << "Love is open door" << endl;
    
    else {
        for(int i=2 ; i <= N ; i++){
            if(M1 == 0) {
                cout << "1" << endl;
                M1 = 1;
            }
            else {
                cout << "0" << endl;
                M1 = 0;
            }
        } 
    }
    
    return 0;
    
}