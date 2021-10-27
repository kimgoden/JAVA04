package project05;

public class capter071 {
 
	public static void main(String[] args) {
		capter07 x = new capter07();
		
		//조건 1
		x.setgas(6);//남은 가스 양의 변수
		
		
		//조건2
		boolean y = x.isleftgas();
		if(y) {
			System.out.println("출발합니다.");
			x.run();//남은 가스량이 0보다 크다면 출발합니다를 출력한다.
			
		}
		//조건3
		if(x.isleftgas()) { //남은 가스량이 true라면 주입할 필요x ,false라면 주입 해야한다.
		    System.out.println("gas를 주입할 필요가 없습니다.");
		}else {
			
			System.out.println("gas를 주입해 주세요");
		}
		
	}
}
