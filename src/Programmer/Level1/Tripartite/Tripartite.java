package Programmer.Level1.Tripartite;

import java.util.*;

class Solution {
    public int solution(int n) {
        String s = "";
        while(n != 0){
            if( (n % 3) < 10 ) {
                s = (n % 3) + s;
                n /= 3;
            }
        }
        int result = 0;
        int r = 1;
        for(int i=0; i<s.length(); i++) {
            result += Integer.parseInt(s.charAt(i)+"")*r;
            r*=3;
        }
        return result;
    }
}

public class Tripartite{

public static void main(String[] args) {
	int n = 45;
	//answer=7;
	
	Solution s = new Solution();
	
	int answer= s.solution(n);
	System.out.println(answer);

}
}