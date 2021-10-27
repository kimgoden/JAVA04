package project05;

import java.util.Scanner;

public class capter11 {
	//2번
	public static void main(String[] args) {
		int x=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		x = sc.nextInt();		
		gugudan(x);
	}
		public static void gugudan(int x) {
			System.out.println(x+"단"); 
			for(int a=1; a<=9; a++) {
				System.out.println(x + "*" + a + "=" + x *a);
			}
		}
	}

		
