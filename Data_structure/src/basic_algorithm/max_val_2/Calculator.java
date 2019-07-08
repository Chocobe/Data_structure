package basic_algorithm.max_val_2;

public class Calculator {
	public static int find_max(int _a, int _b, int _c, int _d) {
		int max = _a;
		
		if(max < _b) { max = _b; }
		
		if(max < _c) { max = _c; }
		
		if(max < _d) { max = _d; }
		
		return max;
	}
}
