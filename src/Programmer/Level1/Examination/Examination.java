package Programmer.Level1.Examination;

import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] Num1 = {1,2,3,4,5};
        int[] Num2 = {2,1,2,3,2,4,2,5};
        int[] Num3 = {3,3,1,1,2,2,4,4,5,5};
        
        
        int[] Num_count=new int[3];
        for(int i=0;i<answers.length;i++){
            
            if(Num1[i%5]==answers[i]){
                Num_count[0]++;   
            }
            if(Num2[i%8]==answers[i]){
                Num_count[1]++;   
            }
            if(Num3[i%10]==answers[i]){
                Num_count[2]++;   
            }
        }
        System.out.println(Num_count[0]);
        System.out.println(Num_count[1]);
        System.out.println(Num_count[2]);
        ArrayList<Integer> list = new ArrayList();
        int max = Num_count[0];
        for(int i=0; i<Num_count.length;i++){
            if(Num_count[i]>max){
                max=Num_count[i];
            }
        }
        for(int i=0; i<Num_count.length;i++){
            if(max==Num_count[i]){
                list.add(i+1);
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}

public class Examination{

public static void main(String[] args) {
	int[] answers = {1,2,3,4,5};
	//answer=1;
	
	Solution s = new Solution();
	
	int[] answer= s.solution(answers);
	System.out.println(answer);

}
}
