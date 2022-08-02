
public class MethodDemo2 {
	public static void main(String[] args) {
		System.out.println("Program is Starting");
		MethodDemo2 md = new MethodDemo2();
		int start = 1 , last = 100;
		int result = md.makesum(start,last);
		System.out.println(start+"부터 " + last + "까지의 합은 " +result);
		start = 30; last = 50;
		result = md.makesum(30,50);
		System.out.println(start+"부터 " + last + "까지의 합은 " +result);
		System.out.println("Program is Over...");
	}

	int makesum (int start, int last) {		//Call by Value
		System.out.println("Program is Starting");
		int sum = 0;
		for (int i = start; i <= last; i++) {
			sum += i;
		}
		System.out.println("Program is Over...");
		return sum;
	}
}
