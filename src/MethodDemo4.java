
public class MethodDemo4 {
	public static void main(String[] args) {
		//mymethod(5,62.8,'A',"Hello, World");
		//mymethod(new int[] {3,4,5,6});
//		Student jimin = new Student();
//		jimin.name = "한지민";
//		jimin.age = 26;
//		mymethod(jimin);
		int original = 5;
		System.out.println("Before calling method, original = " + original);
		mymethod(original);
		System.out.println("Before calling method, original = " + original);
	}
	static void mymethod(int target) {		//int target = original
		System.out.println("In method, target = " + target);
		target = 100;
		System.out.println("In method, target = " + target);
	}
	
//	static void mymethod(Student mystudent) {	
//	}
//		static void mymethod(int su, double weight, char grade, String Str) {
//		Student jimin = new Student();	
//	}
}
