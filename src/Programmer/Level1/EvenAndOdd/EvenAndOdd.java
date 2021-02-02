package Programmer.Level1.EvenAndOdd;

import java.util.*;


class Solution {
    public String solution(int num) {
        String answer = "";
        if(num%2==0){
            answer="Even";
        }
        if(num%2!=0){
            answer="Odd";
        }
        return answer;
    }
}

public class EvenAndOdd{

public static void main(String[] args) {
	int x=3;
	//answer=Odd;
	
	Solution s = new Solution();
	
	String answer= s.solution(x);
	System.out.println(answer);

}
}