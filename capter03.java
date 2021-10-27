package project05;

import java.util.Scanner;

public class capter03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 두개 입력해주세요.");
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
			 System.out.print(x + "와" + y + "중에 큰 수는 ==>");
			 System.out.print(x);
		}
		if (x < y) {
			 System.out.print(x + "와" + y + "중에 큰 수는 ==>");
		System.out.print(y);
		
	}
}
}

