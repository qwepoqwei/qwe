package qaz;

import java.util.Scanner;

public class qqq {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
	    int[] arr=new int[a];
	 shuChuArray(arr);
	  
	 
	}
	public static void shuChuArray(int[] arr){
	
		for(int i=0;i<arr.length;i++){
			arr[i]=i+1;
			System.out.println(arr[i]);
			
		}
		
	}
	
	
	

}
