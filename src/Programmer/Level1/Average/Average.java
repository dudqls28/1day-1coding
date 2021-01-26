package Programmer.Level1.Average;

import java.util.*;



	class Solution {
	    public double solution(int[] arr) {
	        double answer = 0;
	        for(int i=0;i<arr.length;i++){
	            answer+=arr[i];
	        }
	        answer = answer/arr.length;
	        return answer;
	    }
	}
	
	
public class Average{

public static void main(String[] args) {
	int[] arr = {1,2,3,4};
	Solution s = new Solution();
	
	double answer= s.solution(arr);
	System.out.println(answer);
}
}