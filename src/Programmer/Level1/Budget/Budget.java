package Programmer.Level1.Budget;

import java.util.*;

//String binaryString = Integer.toBinaryString(i); //2進数
//String octalString = Integer.toOctalString(i);   //8進数
//String hexString = Integer.toHexString(i);      //16進数

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        
        for(int i=0;i<d.length;i++){
            budget-=d[i];
        if(budget<0){
            break;
        }    
            answer++;
        }
        
        return answer;
    }
}
public class Budget{

public static void main(String[] args) {
	int[] d= {1,3,2,5,4};
	int budget= 9;
	//answer=3;
	
	Solution s = new Solution();
	
	int answer= s.solution(d,budget);
	System.out.println(answer);

}
}