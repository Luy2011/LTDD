package Class;

import java.util.Scanner;

public class Bao extends TaiLieu{
	private String ngayPhatHanh117;

	public Bao() {

	}

	public Bao(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int ngayPhatHanh) {
		super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
		this.ngayPhatHanh117 = this.ngayPhatHanh117;
	}
	
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.println("Nhap ngay phat hanh: ");
		ngayPhatHanh117 = sc.nextLine();
	}
	
	public void hienThongTin() {
		super.hienThiThongTin();
		System.out.println("Ngay phat hanh: "+ ngayPhatHanh117);
	}
}
