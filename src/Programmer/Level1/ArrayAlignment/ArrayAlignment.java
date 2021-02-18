package Programmer.Level1.ArrayAlignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;
class Solution {

	public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
       for(int i=0; i<strings.length; i++) {
           String temp1 = strings[i].substring(0, n);
           String temp2 = strings[i].substring(n);

           strings[i] = temp2 + temp1;
           
       }

       Arrays.sort(strings);

       for(int i=0; i<strings.length; i++) {
           String temp1 = strings[i].substring(0, strings[i].length()-n);
           String temp2 = strings[i].substring(strings[i].length()-n);
   
           answer[i] = temp2 + temp1;
          
       }

       return answer;
}
}

public class ArrayAlignment{
	
	public static void main(String[] args) {
		String[] str= {"sun","bed","car"};
		int n=1;
		//answer=car bed sun
		
		Solution s = new Solution();
		
		String[] answer= s.solution(str,n);
		for(int i=0;i<answer.length;i++) {
		System.out.println(answer[i]);
		}
	
}
}