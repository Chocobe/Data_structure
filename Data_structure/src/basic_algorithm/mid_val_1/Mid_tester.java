package basic_algorithm.mid_val_1;

public class Mid_tester {
	public static void main(String[] args) {
		int mid = 0;
		
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 3; j++) {
				for(int k = 1; k <= 3; k++) {
					mid = Calculator.find_mid(i, j, k);
					System.out.println(i + ", " + j + ", " + k + " 중앙값 : " + mid);
				}
				System.out.println();
			}
		}
	}
}
