package basic_algorithm.max_val_2;

public class Calculator {
	// 4개의 정수 중, 최대값 구하기
	public static int find_max(int _a, int _b, int _c, int _d) {
		int max = _a;
		
		if(max < _b) { max = _b; }
		
		if(max < _c) { max = _c; }
		
		if(max < _d) { max = _d; }
		
		return max;
	}
	
	
	// 3개 정수 중, 최소값 구하기
	public static int find_min(int _a, int _b, int _c) {
		int min = _a;
		
		if(min > _b) { min = _b; }
		
		if(min > _c) { min = _c; }
		
		return min;
	}
	
	
	// 4개 정수 중, 최소값 구하기
	public static int find_min(int _a, int _b, int _c, int _d) {
		int min = _a;
		
		if(min > _b) { min = _b; }
		
		if(min > _c) { min = _c; }
		
		if(min > _d) { min = _d; }
		
		return min;
	}
}
