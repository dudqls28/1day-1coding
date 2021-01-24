package Programmer.Level1.Phone_number;

import java.util.*;


class Solution {
	  public String solution(String phone_number) {
	      String answer = "";
	        int size = phone_number.length();
	        for(int i=0;i<size-4;i++){
	            answer += "*";
	        }

	        for(int i=size-4;i<size;i++) {          
	            answer+= (phone_number.charAt(i)+"");
	        }

	        return answer;
	  }
	}
public class PhoneNumber{

public static void main(String[] args) {
	String phone_number="01011223344";
	Solution s = new Solution();
	
	String answer= s.solution(phone_number);
	System.out.println(answer);

}
}