package advence.dev;

public class Circle extends Shape {
	private double r;

	public Circle(double r) {
		super();
		this.r = r;
	}
	public Circle() {		
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	double tinhChuVi() {
		return r * 2 * Math.PI;
	}
	double tinhDienTich() {
		return Math.PI * r * r;
	}
	}
