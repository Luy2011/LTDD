package Class;

import java.util.Scanner;

public class Sach extends TaiLieu {
	private String tacGia117;
	private int soTrang117;
	public Sach() {

	}
	public Sach(String maTaiLieu, String tenNhaSanXuat, int soBanPhatHanh, String tacGia, int soTrang) {
		super(maTaiLieu, tenNhaSanXuat, soBanPhatHanh);
		this.tacGia117 = tacGia;
		this.soTrang117 = soTrang;
	}
	
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.println("Nhap tac gia: ");
		tacGia117 = sc.nextLine();
		System.out.println("Nhap so trang: ");
		soTrang117 = sc.nextInt();
		sc.nextLine();
	}
	
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Tac gia: "+ tacGia117);
		System.out.println("So trang: "+ soTrang117);
	}
	
	
	
	
	
}
