package project05;

import java.util.Scanner;

public class capter11 {
	//2��
	public static void main(String[] args) {
		int x=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		x = sc.nextInt();		
		gugudan(x);
	}
		public static void gugudan(int x) {
			System.out.println(x+"��"); 
			for(int a=1; a<=9; a++) {
				System.out.println(x + "*" + a + "=" + x *a);
			}
		}
	}

		
