package project05;

public class capter071 {
 
	public static void main(String[] args) {
		capter07 x = new capter07();
		
		//���� 1
		x.setgas(6);//���� ���� ���� ����
		
		
		//����2
		boolean y = x.isleftgas();
		if(y) {
			System.out.println("����մϴ�.");
			x.run();//���� �������� 0���� ũ�ٸ� ����մϴٸ� ����Ѵ�.
			
		}
		//����3
		if(x.isleftgas()) { //���� �������� true��� ������ �ʿ�x ,false��� ���� �ؾ��Ѵ�.
		    System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		}else {
			
			System.out.println("gas�� ������ �ּ���");
		}
		
	}
}
