package advence.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shapes = new Shape[10];
		input(shapes);
		print(shapes);
		maxDienTich(shapes);
	}
	public static void input(Shape[] shapes) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < shapes.length; i++) {
			if (i < 3) {
				System.out.println("Nhap vao ban kinh hinh tron");
				int r = sc.nextInt();
				shapes[1] = new Circle(r);
		} else if (i >= 3 && 1 <= 5) {
			System.out.println("nhap vao 2 canh hinh chu nhat");
			int a = sc.nextInt();
			int b = sc.nextInt();
		} else {
			System.out.println("nhap vao 3 canh hinh tam giac");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
		}
	}
	}
	public static void print(Shape[] shapes) {
		for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i].toString());
		}
	}
	public static void maxDienTich(Shape[] shapes) {
		int n = 0;
		Shape answer = shapes[0];
		double max = shapes[0].dienTich();
	}
}
