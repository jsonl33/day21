package day21;

public class Ex12_02 {
	public static void main(String[] args) {
		int i;

		int odd = 0;
		int even = 0;
		for (i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				even += i;
			} else if (i % 2 != 0) {
				odd += i;
			}
		}
		System.out.println("홀수의 합: " + odd);
		System.out.println("짝수의 합: " + even);
	}
}
