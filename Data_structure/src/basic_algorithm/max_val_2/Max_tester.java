package basic_algorithm.max_val_2;

import java.util.Scanner;

public class Max_tester {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] input_data = new int[4];
		int max = 0;
		int min = 0;
		
		for(int i = 0; i < input_data.length; i++) {
			System.out.print("정수입력 : ");
			input_data[i] = scanner.nextInt();
		}
		
		// 4개 정수 중, 최대값 테스트
		max = Calculator.find_max(input_data[0], input_data[1], input_data[2], input_data[3]);
		System.out.println("4개 항 중 최대값 : " + max);
		
		// 3개 정수 중, 최소값 테스트
		min = Calculator.find_min(input_data[0], input_data[1], input_data[2]);
		System.out.println("3개 항 중 최소값 : " + min);
		
		// 4개 정수 중, 최소값 테스트
		min = Calculator.find_min(input_data[0], input_data[1], input_data[2], input_data[3]);
		System.out.println("4개 항 중 최소값 : " + min);
		
		scanner.close();
	}
}
