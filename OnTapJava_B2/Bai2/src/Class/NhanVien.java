package Class;

import java.util.Scanner;

public class NhanVien extends CanBo {
	private String congViec117;
	public NhanVien() {

	}

	public NhanVien(String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
		super(hoTen, ngaySinh, gioiTinh, diaChi);
		this.congViec117 = congViec117;
	}
	
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.println("Nhap cong viec: ");
		congViec117 = sc.nextLine();
	}
	
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Cong viec: "+congViec117);
	}
	
}
