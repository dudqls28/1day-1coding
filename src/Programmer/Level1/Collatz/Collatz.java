package Programmer.Level1.Collatz;

import java.util.*;


class Solution {
    public int solution(int num) {
        int answer = 0;
        while(num!=1){
        if(num%2==0){
            num=num/2;
        }else if(num%2==1){
            num=num*3+1;
        }
            answer++;
        if(answer==500){
            answer=-1;
            break;
        }
        }
        
        return answer;
    }
}

public class Collatz{

public static void main(String[] args) {
	int x=16;
	//answer=4;
	
	Solution s = new Solution();
	
	int answer= s.solution(x);
	System.out.println(answer);

}
}