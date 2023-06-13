package day21;

class Product {
	String name;
	int price;

	{
		this.name = "물";
		this.price = 800;
	}

	public Product() {
	}

	public Product(String name) {
		this.name = name;
	}

	public Product(int price) {
		this.price = price;
	}

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void pr(String name, int price) {
		System.out.println(name + "," + price);
	}
}

public class Ex13_02 {
	public static void main(String[] args) {
		Product p1 = new Product("웰치스", 700);
		Product p2 = new Product("커피");
		Product p3 = new Product(500);
		Product p4 = new Product();
		p1.pr(p1.name, p1.price);
		p2.pr(p2.name, p2.price);
		p3.pr(p3.name, p3.price);
	}
}
