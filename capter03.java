package project05;

import java.util.Scanner;

public class capter03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �ΰ� �Է����ּ���.");
		System.out.print(">");
		int ai = sc.nextInt();
		
		System.out.print(">");
		int bi = sc.nextInt();
		
		maxnumber(ai,bi);
		
	}
	
	public static void maxnumber(int x, int y) {
		if (x == y) {
			
		}
		if (x > y) {
			 System.out.print(x + "��" + y + "�߿� ū ���� ==>");
			 System.out.print(x);
		}
		if (x < y) {
			 System.out.print(x + "��" + y + "�߿� ū ���� ==>");
		System.out.print(y);
		
	}
}
}

