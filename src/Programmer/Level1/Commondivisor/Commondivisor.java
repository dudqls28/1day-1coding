package Programmer.Level1.Commondivisor;

import java.util.*;


class Solution {
	public int[] solution(int n, int m) {
        int[] answer = new int [2];

       if(m%n==0){
           answer[0] = n;
           answer[1] = m;
       }else if(n%m==0){
           answer[0] = m;
           answer[1] = n;
       }else{
           for(int i = 1; i < m; i++){
               if(n%i==0 && m%i==0){
                   answer[0] = i;
               }
           }
           answer[1] = n*m/answer[0];
       }

       return answer;
   }
}

public class Commondivisor{

public static void main(String[] args) {
	int n= 2;
	int m= 5;
	//answer={1,10};
	
	Solution s = new Solution();
	
	int[] answer= s.solution(n,m);
	System.out.println(answer[0] + " " + answer[1]);

}
}