package Programmer.Level1.Equalnumbers;

import java.util.*;


class Solution {
	 public int[] solution(int []arr) {
	        
	        ArrayList list=new ArrayList();
	        int count = 10;
	        for(int i=0; i < arr.length; i++){
	            if(arr[i]!=count){
	                list.add(arr[i]);
	                count=arr[i];
	                }
	        }
	       int[] answer = new int[list.size()];
	       
	       for(int i = 0; i<list.size();i++){
	            answer[i]=(int)list.get(i);
	        }
	        
	        return answer;
	    }
}
public class Equalnumbers{

public static void main(String[] args) {
	int[] arr1= {1,1,3,3,0,1,1};
	Solution s = new Solution();
	
	int[] answer= s.solution(arr1);
	for(int i=0;i<answer.length;i++) {
	System.out.println(answer[i]);
	}

}
}