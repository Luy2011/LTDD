package Class;

import java.util.Scanner;

public class SinhVien {
	private String hoTen117, maSV117, ngaySinh117, lop117;

	
	
	public SinhVien() {
	
	}



	public SinhVien(String hoTen, String maSV, String ngaySinh, String lop) {
		this.hoTen117 = hoTen;
		this.lop117 = maSV;
		this.ngaySinh117 = ngaySinh;
		this.lop117 = lop;
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.println("Nhap ho ten: ");
		hoTen117 = sc.nextLine();
		System.out.println("Nhap ma sinh vien: ");
		lop117 = sc.nextLine();
		System.out.println("Nhap ngay sinh: ");
		ngaySinh117 = sc.nextLine();
		System.out.println("Nhap lop: ");
		lop117 = sc.nextLine();
	}
	
	public void hienThiThongTin() {
		System.out.println("Ho ten: "+ hoTen117);
		System.out.println("Ma sinh vien: "+ lop117);
		System.out.println("Ngay sinh: "+ ngaySinh117);
		System.out.println("Lop: "+ lop117);
	}
}
