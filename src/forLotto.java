package chapter04;

public class forLotto {

	public static void main(String[] args) {
//		문제 1) Mate.random() 과 for 문을 사용하여 임의 숫자 6개를 출력하는 프로그램을 작성하세요

		for (int i = 0; i < 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			System.out.println(num);
		}
		
	}

}
