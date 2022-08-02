
public class ArrayDemo4 {
	public static void main(String[] array) {
		//java ArrayDemo4 mango banana apple 
//		for(int i = 0 ; i<array.length;i++) {
//			System.out.println(array[i]);
//		}
		if(array.length != 3) {
			System.err.println("Usage Error");
			System.exit(-1); 
		}
		
		int first = Integer.parseInt(array[0]);
		int second = Integer.parseInt(array[2]);
		int sum = 0;
		switch(array[1]) {
		case "+" : { 
			sum = first + second;
			System.out.println(first +array[1] + second + "=" + sum);
			break;
			}
		case "-" : {	
			sum = first - second;
			System.out.println(first +array[1] + second + "=" + sum);
			break;
			}
		case "*" :{	
			sum = first * second;
			System.out.println(first +array[1] + second + "=" + sum);
			break;
			}
		case "/" :{	
			sum = first / second;
			System.out.println(first +array[1] + second + "=" + sum);
			break;
			}
		case "%" :{	
			sum = first % second;
			System.out.println(first +array[1] + second + "=" + sum);
			break;
			}
		default :
			System.out.println("그런 연산자는 없습니다.");
		}
		
	}
}
