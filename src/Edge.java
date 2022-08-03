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
				if(i<=line/2) {								//라인 중간까지 하나씩 많게 출력
					if((line/2+i>=j)&&(line/2-i<=j))	//범위
						System.out.print(" O ");
					else
						System.out.print(" X ");
				}
				else {											//라인중간아래부터 하나씩 적게 출력
					if((line - cnt>j) && (cnt<=j))		//범위
						System.out.print(" O ");
					else
						System.out.print(" X ");
					
				}
			}
			if(i>line/2) {
				cnt++;				//열(i)이 바뀔때만 검사하여야 됌, 사각형을 만들기 위해 라인이 중간이상 넘어가면 그때부터 감소하는 카운트
			}
			System.out.println();	// 정사각배열 만드는 프린트
		}
		
		
		
	}
}
