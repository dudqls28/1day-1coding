package Programmer.Level1;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		long k = 12345;
		String q =Long.toString(k);
		System.out.println(q);
		char[] temp=q.toCharArray();
		int[] answer=new int[temp.length];
		for(int i =0;i<temp.length;i++) {
			answer[i]=temp[i];
			System.out.println(temp[i]);
			System.out.println(answer[i]-48);
			
		}
	
	}

}
