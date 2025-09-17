package Test;

import java.util.Scanner;

import Class.KhachSan;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		KhachSan ql117 = new KhachSan();
		
		ql117.nhapDanhSach(sc);
		
		System.out.println("Nhap vao khach tro can tinh tien: ");
		int cmnd = sc.nextInt();
		
		System.out.println("==> Tong tien la: "+ql117.tinhTien(cmnd));
		sc.close();
	}
}
