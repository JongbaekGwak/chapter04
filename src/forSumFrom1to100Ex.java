package chapter04;

public class forSumFrom1to100Ex {

	public static void main(String[] args) {
		int sum = 0; // 변수를 초기화 하지 않고 연산에 사용 시 잘못된 결과를 출력할 수 있음
//		int result; // 변수가 메모리에 등록만 되고 초기화되지 않았을 경우 변수에 쓰레기값이 들어가 있을 수 있음
//		변수 사용 시 반드시 초기화 작업을 진행 후 사용해야 함

		for (int i = 1; i <= 100; i++) {
			sum += 1;
		}

		System.out.println("1 ~ 100 합 :" + sum);

	}

}
