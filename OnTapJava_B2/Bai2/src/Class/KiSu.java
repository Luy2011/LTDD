package Class;

import java.util.Scanner;

public class KiSu extends CanBo{
	private String nganhDaoTao117;

	public KiSu() {

	}

	public KiSu(String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
		super(hoTen, ngaySinh, gioiTinh, diaChi);
		this.nganhDaoTao117 = nganhDaoTao117;
	}
	
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.println("Nhap nganh dao tao:");
		nganhDaoTao117 = sc.nextLine();
	}
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Nganh dao tao: "+nganhDaoTao117);
	}
	
	
}
