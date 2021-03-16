package Programmer.Level1.Pokemon;

import java.util.*;

class Solution {
    public int solution(int[] nums) {
            int answer = 0;
            int choice = nums.length/2;
	        HashSet<Integer> set=new HashSet<Integer>();
	        for(int i = 0 ;i<nums.length;i++){
	            set.add(nums[i]);
	        }
	        ArrayList<Integer> list= new ArrayList<Integer>(set);
	        answer=list.size();
            System.out.println(answer);
            if(answer>choice){
                answer=choice;
            }
        return answer;
    }

}

public class Pokemon{

public static void main(String[] args) {
	int[] nums = {3,1,2,3};
	//answer= 2;
	
	Solution s = new Solution();
	
	int answer= s.solution(nums);
	System.out.println(answer);

}
}
