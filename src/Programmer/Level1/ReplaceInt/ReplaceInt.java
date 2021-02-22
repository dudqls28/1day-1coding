package Programmer.Level1.ReplaceInt;

import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = Integer.parseInt(s);
        return answer;
    }
}

public class ReplaceInt{

public static void main(String[] args) {
	String str = "-1234";
	//answer=-1234;
	
	Solution s = new Solution();
	
	int answer= s.solution(str);
	System.out.println(answer);

}
}