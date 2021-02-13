package Programmer.Level1.Keypad;

import java.util.ArrayList;
import java.util.HashSet;


class Solution {
	 public String solution(int[] numbers, String hand) {
	        String answer = "";
	        int[] L_position = {4,1};
	        int[] R_position = {4,3};
	        int[] temp = {0,0};
	        for(int i=0 ; i<numbers.length;i++){
	            int L_stack=0;
	            int R_stack=0;
	            switch(numbers[i]){
	                case 1 : answer+="L";
	                         L_position[0]=1;L_position[1]=1;
	                    break;
	                case 2 : temp[0]=1; temp[1]=2;
	                    break;
	                case 3 : answer+="R";
	                         R_position[0]=1;R_position[1]=3;
	                    break;
	                case 4 : answer+="L";
	                         L_position[0]=2;L_position[1]=1;
	                    break;
	                case 5 : temp[0]=2; temp[1]=2;
	                    break;
	                case 6 : answer+="R";
	                         R_position[0]=2;R_position[1]=3;
	                    break;
	                case 7 : answer+="L";
	                         L_position[0]=3;L_position[1]=1;
	                    break;
	                case 8 : temp[0]=3; temp[1]=2;
	                    break;
	                case 9 : answer+="R";
	                         R_position[0]=3;R_position[1]=3;
	                    break;
	                case 0 : temp[0]=4; temp[1]=2;
	                    break;
	            }
	            System.out.println("왼손위치 : " + L_position[0]+","+L_position[1]);
	                System.out.println("오른손위치 : " + R_position[0]+","+R_position[1]);
	            if(numbers[i]==2 ||numbers[i]==5 ||numbers[i]==8 ||numbers[i]==0){
	            for(int j=0;j<2;j++){
	                if(L_position[j]>temp[j]){
	                    L_stack+=L_position[j]-temp[j];
	                }else{
	                    L_stack+=temp[j]-L_position[j];
	                }
	               if(R_position[j]>temp[j]){
	                    R_stack+=R_position[j]-temp[j];
	                }else{
	                    R_stack+=temp[j]-R_position[j];
	                }
	            }
	                System.out.println("왼손스택 : " + L_stack);
	                System.out.println("오른손스택 : " + R_stack);
	                
	            if(L_stack>R_stack){
	                    answer+="R";
	                    R_position[0]=temp[0];
	                    R_position[1]=temp[1];
	                }else if(R_stack>L_stack){
	                    answer+="L";
	                    L_position[0]=temp[0];
	                    L_position[1]=temp[1];
	                }else if(R_stack==L_stack && hand.equals("right")){
	                    answer+="R";
	                    System.out.println("라이트");
	                    R_position[0]=temp[0];
	                    R_position[1]=temp[1];
	                }else if(R_stack==L_stack && hand.equals("left")){
	                    answer+="L";
	                System.out.println("레프트");
	                    L_position[0]=temp[0];
	                    L_position[1]=temp[1];
	                }
	        }
	        }
	        return answer;
	    }
}
public class KeyPad{

public static void main(String[] args) {
	int[] numbers= {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
	String hand ="right";
	//answer = "LRLLLRLLRRL"
	
	Solution s = new Solution();
	
	String answer= s.solution(numbers,hand);
	System.out.println(answer);

}
}