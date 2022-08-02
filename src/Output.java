
public class Output {
	static void output(Student student) {
		System.out.println("<<<<<<<<<<부산정보산업고등학교 성적관리프로그램>>>>>>>>>>>>>>>>");
		System.out.println("이름 : " + student.name );
		System.out.println("학번 : " + student.hakbun );
		System.out.printf("국어 : " + student.kor +"   수학 : " + student.mat +"   영어 : " + student.eng +"   평균 : %.2f\n" ,student.avg );
		System.out.println("성적 : " + student.grade );
	}
}
