package Programmer.Level1.MakeArrange;

import java.util.ArrayList;
import java.util.HashSet;


class Solution {
    public int[] solution(long n) {
        
        String str = Long.toString(n);
        char[] temp=str.toCharArray();
        int[] answer=new int[temp.length];
        int j =answer.length-1;
        for(int i =0;i<answer.length;i++){
        answer[j]=temp[i]-48;    
            j--;
        }    
        return answer;
    }
}
public class MakeArrange{

public static void main(String[] args) {
	long n= 12345;
	
	//answer = 5,4,3,2,1;
	
	Solution s = new Solution();
	
	int[] answer= s.solution(n);
	for(int i=0;i<answer.length;i++) {
		System.out.println(answer[i]);
	}

}
}