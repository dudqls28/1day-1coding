package Programmer.Level1.arr1_arr2;

import java.util.*;


class Solution {
	 public int[][] solution(int[][] arr1, int[][] arr2) {
	        int[][] answer = new int[arr1.length][arr1[0].length];
	        for(int i=0;i<arr1.length;i++){
	            for(int j=0;j<arr1[i].length;j++){
	                answer[i][j]+=arr1[i][j];
	            }
	        }
	        for(int i=0;i<arr2.length;i++){
	            for(int j=0;j<arr2[i].length;j++){
	                answer[i][j]+=arr2[i][j];
	            }
	            
	        }
	        return answer;
	    }
	}
	
public class arr1_arr2{

public static void main(String[] args) {
	int[][] arr1 = {{1,2},{2,3}};
	int[][] arr2 = {{3,4},{5,6}};
	Solution s = new Solution();
	
	int answer[][]= s.solution(arr1,arr2);
	for(int i=0;i<answer.length;i++) {
		for(int j=0;j<answer[i].length;j++) {
			System.out.print(answer[i][j]);
		}
		System.out.println();
	}
}
}