package Programmer.Level1.StrangeCharacter;

import java.util.*;


class Solution {
    public String solution(String s) {
        String answer = "";
        String[] list = s.split(" ");
        for(int i=0;i<list.length;i++){
            for(int j=0;j<list[i].length();j++){
                if(j%2==0){
                  answer+= Character.toUpperCase(list[i].charAt(j));
                }else{
                  answer+= Character.toLowerCase(list[i].charAt(j));
                }
            }
            if(i<list.length-1){
            answer+=" ";
            }
        }
        return answer;
    }
}

public class StrangeCharacter{

public static void main(String[] args) {
	String m ="try hello world";
	//answer=4;
	Solution s = new Solution();
	String answer = s.solution(m);
	System.out.println(answer);
	
}
}