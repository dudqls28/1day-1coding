package Programmer.Level1.internal;

import java.util.*;

class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i =0 ; i<a.length; i++){
            answer+=(a[i]*b[i]);
        }
        return answer;
    }
}

public class internal{

public static void main(String[] args) {
	int[] a = {1,2,3,4};
	int[] b = {-3,-1,0,2};
	//answer=3;
	
	Solution s = new Solution();
	
	int answer= s.solution(a,b);
	System.out.println(answer);

}
}