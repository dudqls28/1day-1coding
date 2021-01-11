package Programmer.Level1.IntervalX;

import java.util.*;

class Solution {
	public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long cnt=x;
        for(int i=0;i<n;i++){
            answer[i]=cnt;
            cnt+=x;
        }
        return answer;
    }
}
public class IntervalX{

public static void main(String[] args) {
	int x= 2;
	int n= 5;
	//answer={2,4,6,8,10};
	
	Solution s = new Solution();
	
	long[] answer= s.solution(x,n);
	for(int i=0;i<n;i++) {
		System.out.print(answer[i]+" ");
	}
		
}
}