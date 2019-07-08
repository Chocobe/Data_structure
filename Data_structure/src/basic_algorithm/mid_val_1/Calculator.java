package basic_algorithm.mid_val_1;

public class Calculator {
	// 3개의 항으로 만들 수 있는 13개 조합에 대해 중앙값 구하기
	public static int find_mid(int _a, int _b, int _c) {
		if(_a > _b) {
			if(_b > _c) {
				return _b;
				
			} else if(_a > _c) {
				return _c;
				
			} else {
				return _a;
			}
			
		} else if(_a > _c) {
			return _a;
			
		} else if(_b > _c) {
			return _c;
			
		} else {
			return _b;
		}
	}
}
