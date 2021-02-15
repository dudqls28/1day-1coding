package Programmer.Level1.PandY;

import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] ch =s.toCharArray();
        int tempY=0;
        int tempP=0;
        for(int i=0;i<s.length();i++){
            if(ch[i]==('y')||ch[i]==('Y')){
                tempY++;
            }else if(ch[i]==('p')||ch[i]==('P')){
                tempP++;
            }
        }
        if(tempY!=tempP){
            answer=false;
        }
        return answer;
    }
}

public class PandY{

public static void main(String[] args) {
	String str="Pyy";
	//answer=false;
	
	Solution s = new Solution();
	
	boolean answer= s.solution(str);
	System.out.println(answer);

}
}