package iteration;

public class MorningCode {
	public static void main(String[] args) {
// 1~50정수중 
// 7의 배수는 sum7에 8의배수는 sum8에 합하는 코드 (for)
// 7의 배수는 sum7에 8의배수는 sum8에 합하는 코드 (while)
		// 종료조건은 7과 8의 공통배수가 나오면 종료
	
		int num7 = 7;
		if (num7 % 7 == 0) {
		System.out.println(0);
		}
		else {
		System.out.println(1);
		}
		
		
		int i = 1, sum7 = 7;
			while (true) {
				sum7 += i;

			if (i == 10) {
				break;
			}
			i++;
		}
		System.out.println("7의배수의 합은 :" + sum7);

	}

}


