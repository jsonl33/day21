package day21;

public class Ex12_04 {

	void prn(int... num) {
		for (int x : num) {
			System.out.print(x + " ");
		}
	}

	public static void main(String[] args) {

		Ex12_04 ex = new Ex12_04();
		ex.prn(10, 20, 30);
		ex.prn(40, 50);
		ex.prn(60);
	}
}
