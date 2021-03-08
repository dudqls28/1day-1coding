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
        Iterator it =list.iterator();
        int[] poketmon = new int[list.size()];
        int count=0;
        while(it.hasNext()) {
        	poketmon[count]=(int)it.next();
        	System.out.println(poketmon[count]);
        	count++;
        }
        for(int i =0 ;i<poketmon.length;i++) {
        	for(int j = i+1 ;j<poketmon.length;j++) {
        		answer++;
        	}
        }
        if(answer<choice){
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