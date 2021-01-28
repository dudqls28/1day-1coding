package Programmer.Level1.WhereisKim;

import java.util.*;


class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int w=0;
        for(int i=0;i<seoul.length;i++){
            if(seoul[i].equals("Kim")){
                w=i;
                break;
            }
        }
        answer="김서방은 "+w+"에 있다";
        return answer;
    }
}
public class WhereisKim{

public static void main(String[] args) {
	String[] seoul= {"Jane", "Kim"	};
	Solution s = new Solution();
	
	String answer= s.solution(seoul);
	System.out.println(answer);

}
}