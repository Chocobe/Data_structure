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
		
		System.out.println(input_num + "까지의 총 합 : " + sum);
		
		scanner.close();		
	}
}
