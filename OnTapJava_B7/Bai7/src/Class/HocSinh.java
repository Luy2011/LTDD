package Class;

import java.util.Date;
import java.util.Scanner;

public class HocSinh extends Nguoi{
	private String lop117, khoaHoc117, kyHoc117;

	public HocSinh() {

	}

	public HocSinh(String hoTen, String lop, String khoaHoc, String kyHoc) {
		this.hoTen117 = hoTen;
		this.lop117 = lop;
		this.kyHoc117 = kyHoc;
		this.khoaHoc117 = khoaHoc;
	}
	
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		
		System.out.println("Nhap lop: ");
		lop117 = sc.nextLine();
		
		System.out.println("Nhap khoa hoc: ");
		khoaHoc117 = sc.nextLine();
		
		System.out.println("Nhap ky hoc: ");
		kyHoc117 = sc.nextLine();
	}
	
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Lop: "+lop117);
		System.out.println("Khoa hoc: "+khoaHoc117);
		System.out.println("Ky hoc: "+kyHoc117);
	}
	
	public String getLop() {
		return lop117;
	}
}
