package basic_algorithm.sum_to_n;

import java.util.Scanner;

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
	
	
	// 1부터 n까지 경계값을 포함하는 정수들의 합 구하기 (음수 예외처리)
	public static void sum_only_plus(Scanner _scanner) {
		Scanner sc = _scanner;
		int n = 0;
		int sum = 0;
		
		do {
			System.out.print("n값 입력 : ");
			n = sc.nextInt();

		} while(n <= 0);
		
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		
		System.out.println("1부터 " + n + "까지 정수의 합 : " + sum);
	}
	
	
	// 입력값 a, b에서 "b - a"를 출력하기(b가 a보다 작다면, 재입력)
	public static void sub_b_a(Scanner _scanner) {
		Scanner scanner = _scanner;
		int a = 0;
		int b = 0;
		
		System.out.println("b - a연산 메소드 (b는 a보다 커야합니다)");
		
		System.out.print("a값 입력 : ");
		a = scanner.nextInt();
		
		do {
			System.out.print("b값 입력 : ");
			b = scanner.nextInt();
			
		} while(b <= a);
		
		System.out.println(b + " - " + a + " = " + (b - a));
	}
	
	
	// 양의 정수를 입력받고, 자릿수를 출력하기
	public static void print_digit_number(Scanner _scanner) {
		Scanner scanner = _scanner;
		int origin_val = 0;
		int digit_num = 0;
		int quotient = 0;
		
		do {
			System.out.print("양의 정수 입력 : ");
			origin_val = scanner.nextInt();
			quotient = origin_val;
			
		} while(origin_val <= 0);
		
		do {
			quotient /= 10;
			digit_num++;
			
		} while(quotient > 0);
		
		System.out.println(origin_val + "는 " + digit_num + "자리 수 입니다");
	}
}
