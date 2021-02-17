package Programmer.Level1.Sum_commondivisor;

import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList list = new ArrayList();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                answer+=i;
            }
        }
        
        return answer;
    }
}

public class Sum_commondivisor{

public static void main(String[] args) {
	int n=12;
	//answer=28;
	
	Solution s = new Solution();
	
	int answer= s.solution(n);
	System.out.println(answer);

}
}