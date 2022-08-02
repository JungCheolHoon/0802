import java.util.Scanner;

public class Input {
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
}
