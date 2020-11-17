package variable;

public class ReferenceExample {
	public static void main(String[] args) {
		String str1 = "Hello"; // 주소값.. str에 담겨있다
		String str2 = "Hello";// string이 클래스 경우에 변수str선언하면 실제값이 아니라 주소값이 담긴다
		String str3 = new String("Hello"); // 그 주소값을 만드는게 new다 메모리에 가보면 찾지못하지만
		if (str1.equals(str3)) { // str1==str2 는 동일한주소값 str==str3은 다른주소값 뜸
		//==는 주소값 다르게나오므로 같게할려면 .equals
			System.out.println("동일한 주소값."); //참조변수(값)이 들어가있을때는 실제값이 아니라 주소값을 가지고있음
		} else {
			System.out.println("다른 주소값");
		}
	}
}