package Class;

import java.util.Scanner;

public class TaiLieu {
	private String maTaiLieu117, tenNhaXuatBan17;
	private int soBanPhatHanh117;
	
	public TaiLieu() {
		
	}
	
	public TaiLieu(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
		this.maTaiLieu117 = maTaiLieu;
		this.tenNhaXuatBan17 = tenNhaXuatBan;
		this.soBanPhatHanh117 = this.soBanPhatHanh117;
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.print(" Nhap ma tai lieu: "); maTaiLieu117 = sc.nextLine();
		System.out.print(" Nhap ten nha xuat ban: "); tenNhaXuatBan17 = sc.nextLine();
		System.out.print(" Nhap so ban phat hanh: "); soBanPhatHanh117 = sc.nextInt();sc.nextLine();
	}
	
	public void hienThiThongTin() {
		System.out.println("Ma tai lieu: "+ maTaiLieu117);
		System.out.println("Ten nha xuat ban: "+ tenNhaXuatBan17);
		System.out.println("So ban phat hanh: "+ soBanPhatHanh117);
	}
	
	public String getMaTaiLieu() {
		return maTaiLieu117;
	}
}
