package Programmer.Level1.Divisor;

import java.util.*;


class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        ArrayList list = new ArrayList();
        for(int i=0 ; i<arr.length;i++){
            if(arr[i]%divisor==0){
                list.add(arr[i]);
            }
        }
        if(list.size()==0){
            list.add(-1);
        }
        
        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i]=(int)list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}

public class Divisor{

public static void main(String[] args) {
	int[] arr = {2, 36, 1, 3};
	int divisor = 1;
	// answer={1,2,3,36};
	
	Solution s = new Solution();
	int[] answer = s.solution(arr,divisor);
	for(int i=0;i<answer.length;i++) {
		System.out.println(answer[i]);
	}
	
}
}