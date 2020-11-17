package condition;

public class ConditionExample1 {
	public static void main(String[] args) {
		int score = 95;
		String grade = "";
		if (score >= 90) {
			

		} else { 
			grade = "A" ;
		}
		if (score >= 80) {
			grade = "B";

			// 70점이상 C, 60점 이상 D, 60미만 F
		}
		if (score >= 70) {
			grade = "C";
		}
		if (score >= 60) {
			grade = "D";
		}
		if (score < 60) {
			grade = "F";

		}
		System.out.println(score + "점은" + grade + "입니다");
	}
	}



