package Programmer.Level1.Harshad;

import java.util.*;


class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int a = x;
        while(a>=1){
            sum += a%10;
            a/=10;
        }
        if (x % sum == 0) {
			return true;
		} else
			return false;
  }
}

public class Harshad{

public static void main(String[] args) {
	int x=12;
	//answer=true;
	
	Solution s = new Solution();
	
	boolean answer= s.solution(x);
	System.out.println(answer);

}
}