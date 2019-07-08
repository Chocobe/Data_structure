package basic_algorithm.max_val_1;

public class Calculator {
	public static int find_max(int _a, int _b, int _c) {
		int max = _a;
		
		if(max < _b) {
			max = _b;
		}
		
		if(max < _c) {
			max = _c;
		}
		
		return max;
	}
}
