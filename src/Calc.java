
public class Calc {
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
}
