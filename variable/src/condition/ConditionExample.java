package condition;

public class ConditionExample {
	public static void main(String[] args) {
		int score = 95;
		String grade = "";
		if (score >= 90) {
			if (score >= 95)
				grade = "A+";
		} else if (score >= 80) {
			grade = "B";
			if (score >= 85)
				grade = "B+";
			// 70점이상 C, 60점 이상 D, 60미만 F
		} else if (score >= 70) {
			grade = "C";
			if (score >= 75)
				grade = "C+";

		} else if (score >= 60) {
			grade = "D";
			if (score >= 65) {
				grade = "D+";
			} else {
				grade = "F";

			}
			System.out.println(score + "점은" + grade + "입니다");
		}
	}

}