package basic_algorithm.sum_to_n;

import java.util.Scanner;

public class Sum_tester {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input_num = 0;
		int sum = 0;
		
		System.out.print("정수를 입력하세요 : ");
		input_num = scanner.nextInt();
		sum = Calculator.sum_to_n(input_num);
		
		// n까지 총 합 구하기
		//
		System.out.println(input_num + "까지의 총 합 : " + sum);
		
		print_line();
		
		// n까지 총 합 구하기 (마지막 루프값 출력)
		//
		sum = Calculator.sum_to_n_print_last_val(input_num);
		System.out.println(input_num + "까지의 총 합 : " + sum);
		
		print_line();
		
		// n까지 총 합 구하기 (연산식 출력)
		//
		sum = Calculator.sum_to_n_print_process(input_num);
		System.out.println(sum);
		
		print_line();
		
		// n까지 총 합 구하기 (가우스 덧셈)
		sum = Calculator.sum_to_n_gauss(input_num);
		System.out.println(input_num + "까지 총 합(가우스 덧셈) : " + sum);
		
		print_line();
		
		// 두 정수 사이값의 총 합 구하기
		//
		System.out.print("정수입력 : ");
		int lhs = scanner.nextInt();
		
		System.out.print("정수입력 : ");
		int rhs = scanner.nextInt();
		
		sum = Calculator.sumof(lhs, rhs);
		System.out.println(lhs + "과(와) " + rhs + "사이의 정수의 합 : " + sum);
		
		print_line();
		
		Calculator.sum_only_plus(scanner);		
		
		print_line();
		
		Calculator.sub_b_a(scanner);
		
		print_line();
		
		Calculator.print_digit_number(scanner);
		
		scanner.close();		
	}
	
	
	public static void print_line() {
		System.out.println("-----------------------");
	}
}
