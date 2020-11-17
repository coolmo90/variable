package iteration;

public class ForMyExample {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
			// sum값 i값동시에 변함
			System.out.println(sum);
			if (sum % 2 == 0) {
				System.out.println("짝수입니다");
			} else {
				System.out.println("홀수입니다");
			}
		}
			System.out.println("sum:" + sum);
	}
}
