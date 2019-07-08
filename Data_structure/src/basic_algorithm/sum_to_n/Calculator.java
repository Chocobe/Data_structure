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
}
