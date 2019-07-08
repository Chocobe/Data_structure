package basic_algorithm.sum_to_n;

public class Calculator {
	// n까지의 합 구하기
	public static int sum_to_n(int _n) {
		int sum = 0;
		int i = 1;		
		
		while(i <= _n) {
			sum += i;
			i++;
		}
		
		return sum;
	}
	
	
	// n까지의 합 구하기 (각 루프값 출력)
	public static int sum_to_n_print_last_val(int _n) {
		int sum = 0;
		int i = 1;
		
		while(i <= _n) {
			sum += i;
			i++;
		}
		System.out.println("루프 종료 시, 루프값 : " + i);
		
		return sum;
	}
	
	
	// n까지의 합 구하기 (연산식 출력)
	public static int sum_to_n_print_process(int _n) {
		int sum = 0;
		int i = 1;
		
		while(i < _n) {
			sum += i;
			System.out.print(i + " + ");
			i++;
		}
		
		System.out.print(i + " = ");
		sum += i;
		
		return sum;
	}
	
	
	// n까지의 합 구하기 (가우스 덧셈)
	public static int sum_to_n_gauss(int _n) {
		return _n * (_n + 1) / 2;
	}
	
	
	// 두 정수를 포함하는 사이값들의 총 합 구하기
	public static int sumof(int _lhs, int _rhs) {
		int begin;
		int end;
		int sum = 0;
		
		if(_lhs > _rhs) {
			begin = _rhs; 
			end = _lhs;
			
		} else {
			begin = _lhs;
			end = _rhs;
		}
		
		for(int i = begin; i <= end; i++) {
			sum += i;
		}
		
		return sum;
	}
}
