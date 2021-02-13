package Programmer.Level1.Keypad;

import java.util.ArrayList;
import java.util.HashSet;

//String binaryString = Integer.toBinaryString(i); //2進数
//String octalString = Integer.toOctalString(i);   //8進数
//String hexString = Integer.toHexString(i);      //16進数

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for( int i=0;i<n;i++){
        	// Integer.parseInt 使用したか範囲超過 Long.ParseLongに代替
        	// format 使用して0のせきお作った
            answer[i]=String.format("%0"+n+"d", Long.parseLong(Integer.toBinaryString(arr1[i]|arr2[i])));
            
            answer[i]=answer[i].replace("1","#");
            answer[i]=answer[i].replace("0"," ");
        }
        return answer;
}
}
public class KeyPad{

public static void main(String[] args) {
	int n= 5;
	int[] arr1= {9, 20, 28, 18, 11};
	int[] arr2= {30, 1, 21, 17, 28};
	
	Solution s = new Solution();
	
	String[] answer= s.solution(n,arr1,arr2);
	for(int i=0;i<answer.length;i++) {
	System.out.print(answer[i]+",");
	}

}
}