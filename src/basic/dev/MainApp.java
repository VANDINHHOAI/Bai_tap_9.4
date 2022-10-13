package basic.dev;
import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a,b,c,x1,x2,delta;
		System.out.print("Nhap a: ");
		a = sc.nextInt();
		
		System.out.print("Nhap b: ");
		b = sc.nextInt();
		
		System.out.print("Nhap c: ");
		c = sc.nextInt();
		
		delta = b * b - 4 * a * c;
		
		if (a == 0) {
			System.out.print("Nhap a sai!.Nhap lai");
		}else {
			if (delta < 0) {
				System.out.println("Phuong trinh vo nghiem");
			}else if (delta == 0) {
				x1 = - b / 2 * a;
				System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + (x1));
			}else {
				System.out.println("Phuong trinh co nghiem");
				x1 = (-b - Math.sqrt(delta)) / (2 * a);
				x2 = (- b - Math.sqrt(delta)) / (2 * a);
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		}
	}

}
