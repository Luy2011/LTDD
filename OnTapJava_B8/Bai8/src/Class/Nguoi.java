package Class;

import java.util.Scanner;

public class Nguoi {
	private String hoTen117, ngaySinh117, queQuan117;
	public Nguoi() {
	
	}

	public Nguoi(String hoTen, String ngaySinh, String queQuan) {
		this.hoTen117 = hoTen;
		this.ngaySinh117 = ngaySinh;
		this.queQuan117 = queQuan;
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.println("Nhap ho ten:");
		hoTen117 =sc.nextLine();
		System.out.println("Nhap ngay sinh:");
		ngaySinh117 =sc.nextLine();
		System.out.println("Nhap que quan:");
		queQuan117 =sc.nextLine();
	}
	
	public void hienThiThongTin() {
		System.out.println("Ho ten: "+ hoTen117);
		System.out.println("Ngay sinh: "+ ngaySinh117);
		System.out.println("Que quan: "+ queQuan117);
	}
}
