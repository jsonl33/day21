package day21;

public class Var {
	static void vars(String...str) {
		for(String x: str) {
			System.out.print(x+" ");
		}
	}
	public static void main(String[] args) {
		vars("a","b","c","d");
	}
}