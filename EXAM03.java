package project05;

import java.util.Scanner;

public class ex03 {
	public static void main(String[] args) {
		int[] x= {0,0,0,0,0,0,0};
		Scanner scan = new Scanner(System.in);
		int y =0;
		boolean tf = true;
		while(tf) {
			System.out.println("1.�¼�����");
			System.out.println("2.����");
			int select = scan.nextInt();
			if(select==1) {
				System.out.println("(0~6) �¼��� �������ּ���.");
				int num=scan.nextInt();
				if(num<7) {
					if(x[num]==1) {
						System.out.println("�ش� �¼��� ������ �� �����ϴ�");
						}
					else if(x[num]==0) {
						x[num]=1;
						y++;
					}
				}
				if(num>=7) {
					System.out.println("�ش� �¼��� �����ϴ�");
					
				}
				
				System.out.print("�¼� ��Ȳ : ");
				for(int i =0; i<x.length; i++) { 
					System.out.print(x[i]);
					
				}
				System.out.println("");
				
			}
			if(select==2) {
				System.out.println("���α׷��� �����մϴ�.");
				tf = false;
			}
			
		}
		System.out.println("�� ����� : " + y*12000);
	}
}
