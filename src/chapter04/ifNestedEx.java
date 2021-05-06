package chapter04;

public class ifNestedEx {

	public static void main(String[] args) {
//		Mate.random() : 0.0 ~ 1.0 사이의 임의의 숫자를 출력하는 명령어
//		Math.random() * 10 을 하면 0 ~ 9 까지의 숫자를 출력
		int score = (int) (Math.random() * 100);
		System.out.println("점수 : " + score);

		String grade;

		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else if (score >= 80) {
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		} else if (score >= 70) {
			if (score >= 75) {
				grade = "C+";
			} else {
				grade = "C";
			}
		} else if (score >= 60) {
			if (score >= 65) {
				grade = "D+";
			} else {
				grade = "D";
			}
		} else {
			grade = "F";
		}
		System.out.println("학점 : " + grade);
	}

}
