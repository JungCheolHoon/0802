import java.util.Scanner;

public class SungjukMgmt {			// Method를 이용한 성적관리프로그램
	public static void main(String[] args) {
		System.out.println("성적관리프로그램 시작");
		Student some = new Student();
		input(some);
		calc(some);
		output(some);
		System.out.println("성적관리프로그램 끝");
	}
	static void input(Student student){
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		student.name = sc.nextLine();
		System.out.print("학번을 입력하세요 : ");
		student.hakbun = sc.nextLine();
		System.out.print("국어점수를 입력하세요 : ");
		student.kor = sc.nextInt();
		sc.nextLine();
		System.out.print("영어점수 입력하세요 : ");
		student.eng = sc.nextInt();
		sc.nextLine();
		System.out.print("수학점수 입력하세요 : ");
		student.mat = sc.nextInt();
		sc.nextLine();
		
			
	}
	static void calc(Student student) {
		
		student.tot = student.kor + student.eng +student.mat ;
		student.avg = student.tot/3.;
		
		if(student.avg>=90) {
			student.grade = 'A';
		}
		else if (student.avg >=80) {
			student.grade = 'B';
		}
		else if (student.avg >=70) {
			student.grade = 'C';
		}
		else if (student.avg >=60) {
			student.grade = 'D';
		}
		else {
			student.grade = 'F';
		}
		
	}
	static void output(Student student) {
		System.out.println("<<<<<<<<<<부산정보산업고등학교 성적관리프로그램>>>>>>>>>>>>>>>>");
		System.out.println("이름 : " + student.name );
		System.out.println("학번 : " + student.hakbun );
		System.out.printf("국어 : " + student.kor +"   수학 : " + student.mat +"   영어 : " + student.eng +"   평균 : %.2f\n" ,student.avg );
		System.out.println("성적 : " + student.grade );
	}
}
