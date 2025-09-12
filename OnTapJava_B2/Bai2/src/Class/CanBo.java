package Class;

import java.util.Scanner;

public class CanBo {
	private String hoTen117, ngaySinh117, gioiTinh117, diaChi117;

	public CanBo() {
	}

	public CanBo(String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
		this.hoTen117 = hoTen;
		this.ngaySinh117 = ngaySinh;
		this.gioiTinh117 = gioiTinh;
		this.diaChi117 = diaChi;
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.println("Nhap vao ho ten: ");
		hoTen117 = sc.nextLine();
		System.out.println("Nhap vao ngay sinh(dd/MM/yyyy): ");
		ngaySinh117 = sc.nextLine();
		System.out.println("Nhap vao gioi tinh: ");
		gioiTinh117 = sc.nextLine();
		System.out.println("Nhap vao dia chi: ");
		diaChi117 = sc.nextLine();
	}
	public void hienThiThongTin() {
		System.out.println("Ho ten: "+hoTen117);
		System.out.println("Ngay sinh: "+ngaySinh117);
		System.out.println("Gioi tinh: "+gioiTinh117);
		System.out.println("Dia chi: "+diaChi117);
	}
	
	public String getHoTen() {
		return this.hoTen117;
	}
}
