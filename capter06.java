package project05;

import java.util.Scanner;

public class capter06 {
	public static int maxnumber(int x, int y) {
		int result;
		if (x > y) {
			result = x;
		}
			else { result = y;
			}
		 return result;
		
		
	}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자를 두개 입력해주세요.");
			System.out.print(">");
			int ai = sc.nextInt();
			
			System.out.print(">");
			int bi = sc.nextInt();
			
			int r =maxnumber(ai,bi);
			
			 System.out.print(r);
}
}