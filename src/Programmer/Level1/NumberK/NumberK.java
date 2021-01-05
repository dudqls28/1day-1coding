package Programmer.Level1.NumberK;

import java.util.ArrayList;
import java.util.HashSet;

class Solution {

	public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];
        int i,j,k;
        HashSet<Integer> set=new HashSet<Integer>();

        for(int x=0;x<commands.length;x++){
        i=commands[x][0];
        j=commands[x][1];
        k=commands[x][2];
        for(int q=i-1;q<j;){
          set.add(array[q]);
            q++;
        }
        System.out.println("");
        ArrayList<Integer> list=new ArrayList<Integer>(set);
        answer[x]=list.get(k-1);
    }
        return answer;
}
}

public class NumberK{
	
	public static void main(String[] args) {
		int[] array= {1, 5, 2, 6, 3, 7, 4};
		int[][] commands= {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		Solution s = new Solution();
		
		int[] answer= s.solution(array, commands);
		for(int i=0;i<answer.length;i++) {
		System.out.println(answer[i]);
		}
	
}
}