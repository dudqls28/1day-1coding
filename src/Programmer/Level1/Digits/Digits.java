package Programmer.Level1.Digits;

import java.util.*;

class Solution {
	
	public int solution(int n) {
        int answer=0;
        while(n > 0){
            answer += (n%10);
            n = n/10;
        }
        return answer;
    }
	
}

public class Digits{

public static void main(String[] args) {
	int n = 123;
	//answer=6;
	
	Solution s = new Solution();
	
	int answer= s.solution(n);
	System.out.println(answer);

}
}