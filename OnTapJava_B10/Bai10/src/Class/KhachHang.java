package Class;

import java.util.Scanner;

public class KhachHang {
	protected  String tenChuHo117;
	protected int soNha117;
	protected String maCongTo117;
	
	public KhachHang() {
		
	}
	
	public KhachHang(String tenChuHo, int soNha, String maCongTo) {
		this.tenChuHo117 = tenChuHo;
		this.soNha117 = soNha;
		this.maCongTo117 = maCongTo;
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.println("Nhap ten chu ho: ");
		tenChuHo117=sc.nextLine();
		System.out.println("Nhap so nha: ");
		soNha117=sc.nextInt();sc.nextLine();
		System.out.println("Nhap ma cong to: ");
		maCongTo117=sc.nextLine();
	}
	
	public void hienThiThongTin() {
		System.out.println("Ten chu ho: "+tenChuHo117);
		System.out.println("So nha: "+soNha117);
		System.out.println("Ma cong to: "+maCongTo117);
	}
}
