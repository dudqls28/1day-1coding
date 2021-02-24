package Programmer.Level1.DartGame;

import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        char[] ch = dartResult.toCharArray();
        String[] arr = new String[3];
        int num=0;
        for(int i = 0 ;i<dartResult.length();i++){
            for(int j=i+1;j<dartResult.length();j++){
                
                if(ch[j]=='S'||ch[j]=='D'||ch[j]=='T'){
                	if(num==2) {
                		arr[num]=dartResult.substring(i,dartResult.length());
                        num++;
                		break;
                	}
                    if(j+1<dartResult.length()){
                    if(ch[j+1]=='*'||ch[j+1]=='#'){
                        arr[num]=dartResult.substring(i,j+2);
                    i=j+1;
                    num++;
                    break;
                    }else{
                        arr[num]=dartResult.substring(i,j+1);
                    i=j;
                    num++;
                    break;
                    }
                    
                }  
            }
            }
        }
        
        int[] temp=new int[3];
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[i].length();j++){
                if(arr[i].charAt(j)=='S'){
                    if(arr[i].charAt(j-1)=='0'&&j-1!=0){
                        temp[i]+=10; 
                    }else{
                        temp[i]+=arr[i].charAt(j-1)-48; 
                    }
                   
                    
                }else if(arr[i].charAt(j)=='D'){
                    if(arr[i].charAt(j-1)=='0'&&j-1!=0){
                        temp[i]+=Math.pow(10,2); 
                    }else{
                        temp[i]+=Math.pow((arr[i].charAt(j-1)-48),2); 
                    }  
                }else if(arr[i].charAt(j)=='T'){
                    if(arr[i].charAt(j-1)=='0'&&j-1!=0){
                        temp[i]+=Math.pow(10,3); 
                    }else{
                        temp[i]+=Math.pow((arr[i].charAt(j-1)-48),3); 
                    }
                    
                }
                if(arr[i].charAt(j)=='*'){
                    temp[i]=temp[i]*2;
                    if(i!=0){
                        temp[i-1]=temp[i-1]*2;
                    }
                }else if(arr[i].charAt(j)=='#'){
                    temp[i]+=temp[i]*-2;
                }
            }
        }
        for(int i = 0 ; i<temp.length;i++){
            answer+=temp[i];
        } 
        return answer;
    }
}

public class DartGame{
	
	public static void main(String[] args) {
		String dart= "3T*10S10S";
		//answer = 74;
		
		Solution s = new Solution();
		
		int answer= s.solution(dart);
		System.out.println(answer);
	
}
}