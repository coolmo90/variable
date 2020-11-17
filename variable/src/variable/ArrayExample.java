package variable;

public class ArrayExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;

		int[] numbers = { 10, 20, 30, 40, 50 };
		// 원하는 타입의 변수를 선언하고 변수 또는 타입에 배열임을 의미하는 대괄호 []를 붙이면 된다

		// System.out.println(numbers[0]); numbers[0] 첫번재값 가져온다 첫번째값 0
		numbers[1] = 200; // 값을 넣을수도있다.
		System.out.println(numbers[1]);

		int sum = 0;

		for (int i = 0; i < 5; i++) { // 처음 i값이 0, 5는포함x
			System.out.println(numbers[i]);
			sum += numbers[i];
		}
		System.out.println("합: " + sum);

		String[] strings = {"Hellow","World","Nice","To","Meet","You"};
		for(int i=0; i<strings.length; i++) { //5개니깐 중간 i<5 써도댐
			strings[2] = "Good" ;
			strings[4] = "See" ;
		
			System.out.println(strings[i]);
		}
	}
}
