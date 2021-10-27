package project05;

import java.util.Scanner;

public class ex03 {
	public static void main(String[] args) {
		int[] x= {0,0,0,0,0,0,0};
		Scanner scan = new Scanner(System.in);
		int y =0;
		boolean tf = true;
		while(tf) {
			System.out.println("1.좌석선택");
			System.out.println("2.종료");
			int select = scan.nextInt();
			if(select==1) {
				System.out.println("(0~6) 좌석을 선택해주세요.");
				int num=scan.nextInt();
				if(num<7) {
					if(x[num]==1) {
						System.out.println("해당 좌석은 구매할 수 없습니다");
						}
					else if(x[num]==0) {
						x[num]=1;
						y++;
					}
				}
				if(num>=7) {
					System.out.println("해당 좌석은 없습니다");
					
				}
				
				System.out.print("좌석 현황 : ");
				for(int i =0; i<x.length; i++) { 
					System.out.print(x[i]);
					
				}
				System.out.println("");
				
			}
			if(select==2) {
				System.out.println("프로그램을 종료합니다.");
				tf = false;
			}
			
		}
		System.out.println("총 매출액 : " + y*12000);
	}
}
