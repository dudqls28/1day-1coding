package Programmer.Level1.CaesarPassword;

import java.util.*;

	class Solution {
		public String solution(String s, int n) {
	        String answer = "";
	        char[] ch= s.toCharArray();
	        for(int i =0 ; i<ch.length;i++){
	            int temp= (int)ch[i];
	           if(temp<=90){
	               if((temp+n)>90){
	                   ch[i]=(char)(temp+n-26);
	               }else if(temp==32){
	                   ch[i]=ch[i];
	               }else{
	                   ch[i]=(char)(temp+n);
	               }
	           }
	            if(temp>=97 && temp<=122){
	                if((temp+n)>122){
	                    ch[i]=(char)(temp+n-26);
	                }else{
	                    ch[i]=(char)(temp+n);
	                }
	            }
	            answer+=ch[i];
	        }
	        return answer;
	    }
	}

public class CaesarPassword{

public static void main(String[] args) {
	String str = "a B z";
	int n=4;
	// answer=e F d;
	
	Solution s = new Solution();
	String answer = s.solution(str,n);
	System.out.println(answer);
	
}
}