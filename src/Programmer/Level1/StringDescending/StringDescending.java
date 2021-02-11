package Programmer.Level1.StringDescending;

import java.util.*;

	class Solution {
	    public String solution(String s) {
	        String answer = "";
	        int[] temp = new int[s.length()];
	        for(int i=0;i<s.length();i++){
	            temp[i]=(int)s.charAt(i);
	            
	        }
	        Arrays.sort(temp);
	        
	        for(int i=temp.length-1;i>=0;i--){
	            
	            answer+=(char)temp[i];
	        }
	        return answer;
	    }
	}

public class StringDescending{

public static void main(String[] args) {
	String str = "Zbcdefg";
	
	// answer=gfedcbZ;
	
	Solution s = new Solution();
	String answer = s.solution(str);
	System.out.println(answer);
	
}
}