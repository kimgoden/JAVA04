package project05;

public class capter09 {
	public static void main(String[] args) {
		//메서드 오버로딩
		info("고길동");
		info("고길동",25);
		info("asdf",1234);
		info(123,"dasdasd");
	}
	public static void info(String name) {
		System.out.println("이름 : " +name);
		}
	public static void info(String name, int age) {
		System.out.println("이름 : " +name);
		System.out.println("나이 ㅣ" + age);
	}
	public static void info(String id, String pw) {
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + pw);
		}
	public static void info(int number, String title) {
		System.out.println("number : " + number);
		System.out.println("title : " + title);
		
	}
}
