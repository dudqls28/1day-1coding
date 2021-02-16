package Programmer.Level1.StringHandling;

import java.util.*;

class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        int s_size = s.length();
        if(s_size==4||s_size==6){
            answer=true;
        }
            for(int i=0;i<s_size;i++){
                int temp=(int)s.charAt(i);
                if(temp<48||temp>57){
                answer=false;
                    break;
                }
            }
        
        return answer;
    }
}

public class StringHandling{

public static void main(String[] args) {
	String str="P1234";
	//answer=false;
	
	Solution s = new Solution();
	
	boolean answer= s.solution(str);
	System.out.println(answer);

}
}