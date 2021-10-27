package project05;

import java.util.Scanner;

public class capter112 {
	//3번+4번
	public static void main(String[] args) {
		int x=0; int y=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		x = sc.nextInt();		
		y = sc.nextInt();
		gugudan(x,y);
	}
	
	
	public static void gugudan(int x) {
		System.out.println(x+"단"); 
		for(int a=1; a<=9; a++) {
			System.out.println(x + "*" + a + "=" + x *a);
			
		}
	}
		public static void gugudan(int x, int y) {
			
			
			for(int b=x; b<=y; b++) {
			System.out.println(b+"단"); 
			for(int a=1; a<=9; a++) {
				System.out.println(b + "*" + a + "=" + a*b);
				
			}
		
	}
}
}

