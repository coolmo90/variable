package condition;

public class ConditionExample4 {
	public static void main(String[] args) {
		int num1 = 15;

		if (num1 % 3 == 0 && num1 % 5 == 0) {
// && 앞 뒤 다 만족하는
// &&가 없을시 if 에 num1%15 넣어서 우선순위로
// if 뒤 괄호 기억
			System.out.println("3과5의 배수입니다");

		} else if (num1 % 5 == 0) {
			System.out.println("5의 배수입니다");
		} else if (num1 % 3 == 0) {
			System.out.println("3의 배수입니다");
		} else {
			System.out.println("기타입니다");
		//else는 조건x 위조건이 아닐경우 다 else 
		}
	}
}
