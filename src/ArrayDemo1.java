
public class ArrayDemo1 {
	public static void main(String[] args) {
		
		int [][] array1 = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int [][] array2 = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i = 0 ; i < array1.length ; i++) {
			for(int j = 0 ; j < array1[i].length ; j++) {
				System.out.print(array1[i][j]);
			}
			
			System.out.println();
		}
		
		System.out.println();
		for(int i = 0 ; i < array2.length ; i++) {
			for(int j = 0 ; j < array2[i].length ; j++) {
				System.out.print(array2[i][j]);
			}
			
			System.out.println();
		}
		
//		<<Rectangular Array>>
//		int [][] array = null;		//Declaration
//		array = new int[2][3];	//Creation
//		array[0][0] = (int)(Math.random()*10+1);	//Assignment
//		array[0][1] = (int)(Math.random()*10+1);
//		array[0][2] = (int)(Math.random()*10+1);
//		array[1][0] = (int)(Math.random()*10+1);
//		array[1][1] = (int)(Math.random()*10+1);
//		array[1][2] = (int)(Math.random()*10+1);
//		array[2][0] = (int)(Math.random()*10+1);
//		array[2][1] = (int)(Math.random()*10+1);
//		array[2][2] = (int)(Math.random()*10+1);
		
		//2nd way
//		int [][]array;
//		array = new int [][] {{3,4,5,6},{7,8,9,10}};
		
		//3rd way
//		int [][]array = {
//				{1,2,3,4},
//				{5,6,7,8},
//				{9,10,11,12}
//		};
		
//		<<Ragged(Jagged) Array>>
//		1st way
//		int [][] array;	//Declaration
//		array = new int[3][];	//Creation
//		array[0] = new int[3];
//		array[1] = new int[2];
//		array[2] = new int[1];
//		array[0][0] = (int)(Math.random()*10+1);	//Assignment
//		array[0][1] = (int)(Math.random()*10+1);
//		array[0][2] = (int)(Math.random()*10+1);
//		array[1][0] = (int)(Math.random()*10+1);
//		array[1][1] = (int)(Math.random()*10+1);
//		array[2][0] = (int)(Math.random()*10+1);
			
//		2st way
//		int[][] array;		//Declaration
//		array = new int[3][];
//		array[0] = new int[] {3,4,5,6,7,8};
//		array[1] = new int[] {9,10};
//		array[2] = new int[] {11,12,13,14};
			
//		3st way
//		int[][] array = {
//				{3,4,5,6},
//				{7,8},
//				{9,10,11,12,13,14}
//		};
//		
//		for(int i = 0 ; i<array.length; i++) {
//			for(int j = 0 ; j <array[i].length ; j ++) {
//				System.out.print(array[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
	}
}
