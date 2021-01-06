package Programmer.Level1.FailureRate;

import java.util.ArrayList;
import java.util.HashSet;



class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] tempArr = new double[N];
        int arrLength = stages.length;
        int idx = arrLength;
        double tempD = 0;
        int tempI = 0;
        for (int i = 0; i < arrLength; i++) {
            int stage = stages[i];
            if (stage != N + 1)
                answer[stage - 1] += 1;
           
        }
        
        for (int i = 0; i < N; i++) {
            int personNum = answer[i];
            tempArr[i] = (double) personNum / idx;
            idx -= personNum;
            answer[i] = i + 1;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 1; j < N - i; j++) {
                if (tempArr[j - 1] < tempArr[j]) {
                    tempD = tempArr[j - 1];
                    tempArr[j - 1] = tempArr[j];
                    tempArr[j] = tempD;

                    tempI = answer[j - 1];
                    answer[j - 1] = answer[j];
                    answer[j] = tempI;
                }
            }
        }
        return answer;
    }
}

public class FailureRate{

public static void main(String[] args) {
	int n= 5;
	int[] stages= {2, 1, 2, 6, 2, 4, 3, 3};
	
	Solution s = new Solution();
	
	int[] answer= s.solution(n, stages);
	for(int i=0;i<answer.length;i++) {
	System.out.print(answer[i]+",");
	}

}
}