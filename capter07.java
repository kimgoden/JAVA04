package project05;

public class capter07 {

	 int gas;
	 
	 void setgas(int gas) {
		 this.gas = gas;
 }
	 boolean isleftgas() {
		 if(gas==0) {
			 System.out.println("������ �����ϴ�.");
			 return false;
		 }
		 else {System.out.println("������ �ֽ��ϴ�.");
		 return true;
		 }
	 }
	 void run() {
		 while(true) {
			 if(gas>0) { //gas�� 0���� ũ�ٸ� ����-1�� �Ѵ�
				 System.out.println("���� ����: "+ gas);
				 gas-=1;
			 }else { System.out.println("����ϴ�. ���� ����: " +gas);
				 return;//gas�� 0���� �۴ٸ� ����ϴٸ� ����ϰ� ���������� �����ش�.
			 }
		 }
	 }
}
