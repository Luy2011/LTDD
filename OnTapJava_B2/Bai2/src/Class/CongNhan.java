package Class;

import java.util.Scanner;

public class CongNhan extends CanBo{
	private String bac117;

	public CongNhan() {

	}

	public CongNhan(String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
		super(hoTen, ngaySinh, gioiTinh, diaChi);
		this.bac117 = bac117;
	}
	
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.println("Nhap Bac: ");
		bac117 = sc.nextLine();
	}
	
	public void hienThiThongTin(){
		super.hienThiThongTin();
		System.out.println("Bac: "+bac117);
	}
}
