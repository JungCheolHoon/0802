
public class SungjukMgmt1 {			// Method를 이용한 성적관리프로그램
	public static void main(String[] args) {
		System.out.println("성적관리프로그램 시작");
		Student some = new Student();
		Input.input(some);
		Calc.calc(some);
		Output.output(some);
		System.out.println("성적관리프로그램 끝");
	}
}
