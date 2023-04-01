package advence.dev;

public class Rectangle extends Shape {
	private double a;
	private double b;
	
	public Rectangle(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	public Rectangle() {
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	
	double tinhChuVi() {
		return a + b;
	}
	double tinhDienTich() {
		return a * b;
	}
}
