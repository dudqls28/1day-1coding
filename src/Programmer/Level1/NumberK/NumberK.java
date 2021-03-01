package Programmer.Level1.NumberK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

class Solution {

	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int arr_count = 0;
        int count = 0;
        for(int i=0; i<commands.length; i++) {
            int[] arr = new int[(commands[i][1]-commands[i][0])+1];
            for(int j=commands[i][0]-1; j<commands[i][1]; j++) {
                arr[arr_count] = array[j];
                arr_count++;
            }
            
            Arrays.sort(arr);
            answer[count] = arr[commands[i][2]-1];
            count++;
            arr_count = 0;
        }
        return answer;
}
}

public class NumberK{
	
	public static void main(String[] args) {
		int[] array= {1, 5, 2, 6, 3, 7, 4};
		int[][] commands= {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		//answer = 5,6,3
		Solution s = new Solution();
		
		int[] answer= s.solution(array, commands);
		for(int i=0;i<answer.length;i++) {
		System.out.println(answer[i]);
		}
	
}
}