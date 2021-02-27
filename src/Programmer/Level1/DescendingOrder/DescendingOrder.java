package Programmer.Level1.DescendingOrder;

import java.util.*;

class Solution {
	
	public long solution(long n) {      
        String str = String.valueOf(n);
        String tempStr="";
        char [] temp = str.toCharArray();
        Character[] ch = new Character[temp.length];
        for(int i=0;i<temp.length;i++){
            ch[i]=temp[i];
        }
        
        Arrays.sort(ch,Comparator.reverseOrder());
        for (int i=0;i<ch.length;i++){
            tempStr+=ch[i];
        }
        long answer = Long.parseLong(tempStr);
        return answer;
    }
	
}

public class DescendingOrder{

public static void main(String[] args) {
	int n = 118372;
	//answer=873211;
	
	Solution s = new Solution();
	
	long answer= s.solution(n);
	System.out.println(answer);

}
}