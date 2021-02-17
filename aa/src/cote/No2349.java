package cote;

import java.util.Scanner;

public class No2349 {

	public static void main(String[] args) {
//		문제
//		    *
//		   **
//		  ***
//		 ****
		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 수 : ");
		int su=sc.nextInt();
		for(int i=0;i<su;i++){//0123
			for(int j=su-1;j>=0;j--){//3210
				System.out.print(i<j?" ":"*");
			}
			System.out.println();
		}
	}

}
