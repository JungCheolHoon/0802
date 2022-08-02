import java.util.Scanner;		
public class Edge {			//마름모 그리기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇줄짜리 마름모를 그리시겠습니까? : ");
		int line = sc.nextInt();
		
		// 3 > 1 .. 5 > 2 .. 7 > 3 .. 9 > 4
		int cnt = 1;
		
		
		for(int i = 0; i <line ; i++) {
			for(int j = 0 ; j <line ; j++) {
				if(i<=line/2) {
					if((line/2+i>=j)&&(line/2-i<=j))
						System.out.print(" O ");
					else
						System.out.print(" X ");
				}
				else {
					if((line - cnt>j) && (cnt<=j))		//4>j && 1<=j
						System.out.print(" O ");
					else
						System.out.print(" X ");
					
				}
			}
			if(i>line/2) {
				cnt++;
			}
			System.out.println();
		}
		
		
		
	}
}
