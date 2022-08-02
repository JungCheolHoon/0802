
public class Test {
	public static void main(String[] args) {
		int [][] report = {
						{1,2,2,4,2,2,3,4,1,2},
						{1,2,3,4,1,1,1,4,1,1},
						{1,2,3,4,1,2,3,4,1,2},
						{1,3,3,3,3,3,3,3,1,2},
						{1,2,3,4,1,2,3,1,1,2}
		};
		int [] soltion = {1,2,3,4,1,2,3,4,1,2};
		int [] score = {0,0,0,0,0};
		char [][] result = new char[5][10] ;
		String [] name = {"한지민","박지민","홍지민","신지민","김지민"};
		
		for(int i = 0 ; i <report.length;i++) {
			System.out.print(name[i] + " : ");
			for(int j =0; j<report[i].length;j++) {
				if(report[i][j] == soltion[j]) {
					result[i][j] = 'O';
					score[i] += 10;
					System.out.print(result[i][j] + " ");
				}
				else{
					result[i][j] = 'X';
					System.out.print(result[i][j] + " ");
				}
			}
			System.out.println("(" + score[i] + "점)");
		}
//		for(int i = 0 ; i <report.length;i++) {
//			System.out.print(name[i] + " : ");
//			for(int j =0; j<report[i].length;j++) {
//				System.out.print(result[i][j] + " ");
//			}
//			System.out.println("(" + score[i] + "점)");
//		}
		
		
	}
}
