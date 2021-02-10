package Programmer.Level1.MiddleStr;

import java.util.*;


class Solution {
	public String solution(String s) {
        String answer = "";
        int leng=s.length();
        if(leng%2==1){
            answer+=s.charAt(leng/2);
        }else{
            answer+=s.charAt(leng/2-1);
            answer+=s.charAt((leng/2));
        }
        return answer;
    }
}

public class MiddleStr{

public static void main(String[] args) {
	String str ="abcde";
	// answer="c";
	
	Solution s = new Solution();
	String answer = s.solution(str);
	System.out.println(answer);
	
}
}