package iteration;

public class WhileMyExample {
	public static void main(String[] args) {
		// for(int i=0; i<10; i++ {}
//int i = 0;
//while (i < 10) {
//System.out.println("2 *" + i + "=" + (2 * i));
//i++;

	//	int i = 0, sum = 0;
		//while (i <= 10) {
			//sum = sum + i;
		//	sum += i;
		//	i++;
		//}
	//	System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
		int i = 0 , sum = 0 ;
		while (true) {
		sum += i;
		
		if (i ==10) {
			break;
		}
		i++;
	}
		System.out.println("1부터 10까지 합 :"+sum);
		
	}
}