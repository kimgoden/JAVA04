package project05;

public class capter04 {
	public static void main(String[] args) {
		int [] values = {1,2,3};
		int sum=sum1(values); // �޼��忡�� ������ ���� ����´�
		System.out.println("���� ��: " + sum);
	}
	public static int sum1(int[] values ) {
		int sum = 0; //���� �޼��尡 ������ ������ ���� �̸��� ������ ��� ����
		for(int i=0; i<values.length; i++) {
			sum += values[i]; //�޼��忡�� values�� ���� ������ �����ְ� �����Ѵ�
			
		}
		System.out.println("�޼��� ��: " +sum);
		return sum;
	}
	
}
