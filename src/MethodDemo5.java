
public class MethodDemo5 {
	public static void main(String[] args) {
		int a=5, b=9;
		int [] array = new int[] {5,9};
		System.out.println("Before swap : a = " + array[0] + ", b= " + array[1]);
		swap(array);
		System.out.println("After swap : a = " + array[0] + ", b= " + array[1]);
		
	}
	static void swap(int[] array) {
		System.out.println("Before swap : a = " + array[0] + ", b= " + array[1]);
		int temp;
		temp = array[0];
		array[0] = array[1];
		array[1] = temp;
		System.out.println("After swap : a = " + array[0] + ", b= " + array[1]);
	}
}
