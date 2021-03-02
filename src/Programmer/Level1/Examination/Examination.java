package Programmer.Level1.Examination;

import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] Num1 = new int[answers.length];
        int[] Num2 = new int[answers.length];
        int[] Num3 = new int[answers.length];
        int j =1;
        int k =1;
        int s =3;
        for(int i=0;i<answers.length;i++){
            Num1[i]=j;
            if(i%2==0){
                Num2[i]=2;
            }else{
                Num2[i]=k;
                if(k==1){
                    k+=2;
                }else{
                    k++;
                }
            }
            j++;
            if(i%2==0){
                Num3[i]=s;
            }else{
                
                Num3[i]=s;
                if(s==2){
                    s+=2;
                }else if(s==3){
                    s-=2;
                }else{
                    s+=1;   
                }
            }
            if(j==6){
                j=1;
            }
            if(k==6){
                k=1;
            }
            
        }
        int[] Num_count={0,0,0};
        for(int i=0;i<answers.length;i++){
            if(Num1[i]==answers[i]){
                Num_count[0]+=1;   
            }else if(Num2[i]==answers[i]){
                Num_count[1]+=1;   
            }else if(Num3[i]==answers[i]){
                Num_count[2]+=1;   
            }
        }
        System.out.println(Num_count[0]);
        System.out.println(Num_count[1]);
        System.out.println(Num_count[2]);
        int temp=0;
        for(int i=0; i<Num_count.length;i++){
            for(int q=i+1;q<Num_count.length;q++){
                if(Num_count[i]>Num_count[q]){
                   temp=i+1; 
                }else{
                    temp=q+1;
                }
            }
        }
        
        
            if(Num_count[0]==Num_count[1]&&Num_count[1]==Num_count[2]){
                temp=6;
            }else if(Num_count[0]==Num_count[1]&&Num_count[1]>Num_count[2]){
                temp=4;
            }else if(Num_count[2]==Num_count[1]&&Num_count[1]>Num_count[0]){
                temp=5;
            }
        
        System.out.println(temp);
        int[] answer={1};
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