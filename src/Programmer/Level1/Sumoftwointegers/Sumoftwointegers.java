package Programmer.Level1.Sumoftwointegers;

import java.util.*;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a>b){
            for(;b<=a;b++){
                answer+=b;
            }
        }else{
            for(;a<=b;a++){
                answer+=a;
            }
        }
        return answer;
    }
}

public class Sumoftwointegers{

public static void main(String[] args) {
	int a = 3;
	int b = 5;
	//answer=12;
	
	Solution s = new Solution();
	
	long answer= s.solution(a,b);
	System.out.println(answer);

}
}