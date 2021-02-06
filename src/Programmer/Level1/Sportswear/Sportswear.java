package Programmer.Level1.Sportswear;

import java.util.*;


class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int lost_num = 0;
        int count = 0;
        
        for(int i=0; i<lost.length; i++) {
            for(int j=0; j<reserve.length; j++) {
                if(lost[i]==reserve[j]) {
                    lost_num++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        for(int i=0; i<lost.length; i++) {
            for(int j=0; j<reserve.length; j++) {
                if(lost[i]==reserve[j]+1 || lost[i]==reserve[j]-1) {
                    count++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        answer = n - lost.length + lost_num + count;
        
        return answer;
    }
}

public class Sportswear{

public static void main(String[] args) {
	int n =5;
	int[] lost= {2,4};
	int[] reserve= {1,3,5};
	// answer=5;
	
	Solution s = new Solution();
	int answer = s.solution(n,lost,reserve);
	System.out.println(answer);
	
}
}