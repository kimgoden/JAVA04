package project05;

public class capter09 {
	public static void main(String[] args) {
		//�޼��� �����ε�
		info("��浿");
		info("��浿",25);
		info("asdf",1234);
		info(123,"dasdasd");
	}
	public static void info(String name) {
		System.out.println("�̸� : " +name);
		}
	public static void info(String name, int age) {
		System.out.println("�̸� : " +name);
		System.out.println("���� ��" + age);
	}
	public static void info(String id, String pw) {
		System.out.println("���̵� : " + id);
		System.out.println("��й�ȣ : " + pw);
		}
	public static void info(int number, String title) {
		System.out.println("number : " + number);
		System.out.println("title : " + title);
		
	}
}
