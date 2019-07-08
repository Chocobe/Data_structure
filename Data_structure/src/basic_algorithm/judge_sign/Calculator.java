package basic_algorithm.judge_sign;

public class Calculator {
	// 정수의 부호 판단하기
	public static void judge_sign(int _val) {
		if(_val > 0) {
			System.out.println(_val + "은(는) 양수입니다.");
			
		} else if(_val < 0) {
			System.out.println(_val + "은(는) 음수입니다.");
			
		} else {
			System.out.println("0입니다.");
		}
	}
}
