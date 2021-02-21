package Programmer.Level1.Squareroot;

import java.util.*;

class Solution {
	
	    public long solution(long n) {
	        long answer = 0;
	        answer = (long)Math.sqrt(n);
	        if(n == (long)Math.pow(answer,2)){
	            answer = (long)Math.pow(answer+1,2);
	        } else{
	            answer = -1;
	        }
	        return answer;
	    }
	
}

public class Squareroot{

public static void main(String[] args) {
	long n = 121;
	//answer=144;
	
	Solution s = new Solution();
	
	long answer= s.solution(n);
	System.out.println(answer);

}
}