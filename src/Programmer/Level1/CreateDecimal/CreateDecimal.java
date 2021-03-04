package Programmer.Level1.CreateDecimal;

import java.util.*;


class Solution {
	public int solution(int[] nums) {
        int answer =0;
        int temp=0;
        for(int i = 0 ; i< nums.length;i++){
            for(int j = i+1; j< nums.length;j++){
                for(int k = j+1; k<nums.length;k++){
                    if(check(nums[i],nums[j],nums[k])==2){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
    public int check(int num1,int num2,int num3){
        int checkNum=num1+num2+num3;
        int count=0;
        for(int i = 1 ;i<=checkNum;i++){
            if(checkNum%i==0){
                count++;
            }
        }
        return count;
    }
}

public class CreateDecimal{

public static void main(String[] args) {
	int[] nums= {1,2,7,6,4};
	//answer=4;
	
	Solution s = new Solution();
	
	int answer= s.solution(nums);
	System.out.println(answer);

}
}