package basic_algorithm.sum_to_n;

public class Calculator {
	public static int sum_to_n(int _n) {
		int sum = 0;
		int i = 1;		
		
		while(i <= _n) {
			sum += i;
			i++;
		}
		
		return sum;
	}
}
