package Programmer.Level1.MinNum;

import java.util.*;


class Solution {
    public int[] solution(int[] arr) {
        
        if(arr.length==1){
            int[] answer = {-1};
            return answer;
        }
            int min = arr[0];
        for(int i=1;i<arr.length;i++){
            min = Math.min(min,arr[i]);
        }
            int[] answer = new int[arr.length-1];
            int index=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=min){
                    answer[index++]=arr[i];
                }
            }
        
        
        return answer;
    }
}

public class MinNum{

public static void main(String[] args) {
	int[] arr = {4,3,2,1};
	// answer={4,3,2};
	
	Solution s = new Solution();
	int[] answer = s.solution(arr);
	for(int i=0;i<answer.length;i++) {
		System.out.println(answer[i]);
	}
	
}
}