package project05;

import java.util.Scanner;

public class capter112 {
	//3��+4��
	public static void main(String[] args) {
		int x=0; int y=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		x = sc.nextInt();		
		y = sc.nextInt();
		gugudan(x,y);
	}
	
	
	public static void gugudan(int x) {
		System.out.println(x+"��"); 
		for(int a=1; a<=9; a++) {
			System.out.println(x + "*" + a + "=" + x *a);
			
		}
	}
		public static void gugudan(int x, int y) {
			
			
			for(int b=x; b<=y; b++) {
			System.out.println(b+"��"); 
			for(int a=1; a<=9; a++) {
				System.out.println(b + "*" + a + "=" + a*b);
				
			}
		
	}
}
}

