package project05;

public class capter12 {
	//5��
	public static void main(String[] args) {
		int[] values = {78,54,89,57,84,93,74,91,84,67,52,94,82};
		int max = max1(values);
		System.out.println("���� ū ��: " + max);
	}
	
	
	public static int max1(int ...values) {
		int y=0;
		
		for(int z=0; z<values.length; z++) {
			if(y<values[z]) {
				y = values[z];

			}
		}
		return y;
	}
}
	


	



