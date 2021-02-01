package Programmer.Level1.FindDecimal;

import java.util.*;

//나의코드
/*class Solution {
    public int solution(int n) {
        int answer = 1;
        int count=3;
        for(int i=1;i<=count;i++){
            int temp=0;
            for(int j=2;j<=count-1;j++){
                
                if(count%j!=0&&count/count==1){
                    temp++;
                }
                if(temp==count-2){
                    answer++;
                }
            }
            
            if(count==n){
                break;
            }
            count++;
        }
        return answer;
    }
}*/
//정답
class Solution {
    public int solution(int n) {
        int answer = 0;

        // 에라토스테네스의 체
        int[] filter = new int[n + 1];
        Arrays.fill(filter, 1);
        // 0, 1은 소수가 아님
        filter[0] = 0;
        filter[1] = 0;

        for (int i = 2; i < Math.sqrt(n) + 1; i++){

            if (filter[i] == 1){
                for (int j = i * 2; j <= n; j+=i){
                    filter[j] = 0;
                }
            }
        }

        for (int check: filter){
            if (check == 1){
                answer++;
            }
        }

        return answer;
    }
}
public class FindDecimal{

public static void main(String[] args) {
	int n= 10;
	Solution s = new Solution();
	
	int answer= s.solution(n);
	System.out.println(answer);

}
}