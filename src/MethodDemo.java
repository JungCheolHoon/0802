
public class MethodDemo {
	public static void main(String[] args) {
		System.out.println("Program is Starting");
		MethodDemo md = new MethodDemo();
		md.makesum();
		md.makesum();
		System.out.println("Program is Over...");
	}

	void makesum() {		//Call by Name
		System.out.println("Program is Starting");
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println("Program is Over...");
	}
}
