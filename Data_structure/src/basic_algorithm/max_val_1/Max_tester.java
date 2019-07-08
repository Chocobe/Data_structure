package basic_algorithm.max_val_1;

import java.util.Scanner;

// 정수 3개를 입력받아, 최대값 구하기
public class Max_tester {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] input_data = new int[3];
		int max = 0;
		
		for(int i = 0; i < input_data.length; i++) {
			System.out.print("정수입력 : ");
			input_data[i] = scanner.nextInt();
		}
		
		max = Calculator.find_max(input_data[0], input_data[1], input_data[2]);
		
		System.out.println("최대값 : " + max);
		scanner.close();
	}
}
