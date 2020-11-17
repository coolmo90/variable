package variable;

public class DataTypeExample {
	public static void main(String[] args) {
		byte num1 = 12;
		short num2 = 128;
		int num3 = 100000000;
		// 아무말없으면 인트형 정수
		long num4 = 10000000000000L;
		// 소문자 l인데 1이랑 비슷해서 대문자로

		byte val1 = 10;
		num3 = val1; // <- 에러안나는 이유 자동 형변환(promotion)
		// byte result = num1 + val1;
		// 사칙연산의 더하기는 num1 과 val1 을 인트형으로 변환해서 하므로
		// 보기에는 22지만 인트타입값을 담을수없어서 에러로뜸
		// 그래서 밑처럼 해야함 //강제 형변한거(casting)
		byte result = (byte) (num1 + val1);
		// 자바에선 데이터유형 맞춰줘야함
		// 아무리 작은숫자라도 인트형으로 됨 num1+ val1
		num1 = 120; //제일큰값은 127  (128에서 1뺀값)
		            //-128 ~ 127
		for(int i=0; i<20; i++) {
		System.out.println(num1++);
		/*num1++; //증가연산 그대로 바이트타입
		num1++;
		num1++;
		num1++;
		num1++;
		num1++;
		num1++;
		num1++;*/
		}
		char char1 = 97; //캐릭터타입 정수형타입 숫자별로 문자에적용돼있는 값 출력
		//char1 = 'a';
		for (int i = 0; i < 26; i++)
	    System.out.println(char1++); //chart 1씩증가시키면서출력 a~z까지나옴 알파벳26자
	
		float floatVal = 4.567F;
		double doubleVal = 3.4567; 
	    //굳이 float 안써도댐 더블쓰면댐
	}
}
