package condition;

public class ConditionExample3 {
public static void main(String[] args) {
	//System.out.println((int)(Math.random()*6)+1); // int 소수점 제외
	// 6)+1); --> 1을추가하면 0~6사이에 나온값의 정수형치환(int) +1  그래서 1~6사이의 값

	    int num = (int)(Math.random()*6) + 1;
	    switch(num) {	    
	    case 1:
	    System.out.println("1번이 나왔습니다");
	    break;
	    case 2:
		System.out.println("2번이 나왔습니다");
		break;
	    case 3:
		System.out.println("3번이 나왔습니다");
		break;
default :
	System.out.println("4번이나왔습니다");
	   break; 
	    }
}
}
