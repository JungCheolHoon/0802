import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		int [] array = {4,7,3,2,1,7,5,9,8,134,23,432,54,78};
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(array));
		
		Arrays.sort(array);
		System.out.println("After Ascending Sorting");
		System.out.println(Arrays.toString(array));
		
		System.out.println("After Descending Sorting");
		System.out.print("[");
		for(int i = array.length-1 ; i>=0;i--) {
			if(i==0) {
				System.out.print(array[i]);
			}
			else
				System.out.print(array[i]+", ");
		}
		System.out.print("]");
	}
}
