package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class KhachSan {
	private ArrayList<KhachTro> ds117;
	
	public KhachSan() {
		ds117 = new ArrayList<KhachTro>(10);
	}
	
	public void themKhachTro(KhachTro kt) {
		ds117.add(kt);
	}
	
	public void nhapDanhSach(Scanner sc) {
		KhachTro khach;
		
		System.out.println("Nhap vao so luong khach: ");
		int n = sc.nextInt();sc.nextLine();
		
		System.out.println("Nhap vao danh sach khach tro: ");
		for(int i = 0; i<n;i++) {
			System.out.println("Khach tro thu "+(i+1)+" la: ");
			khach = new KhachTro();
			khach.nhapThongTin(sc);
			themKhachTro(khach);
		}
	}
	public void hienThiDanhSach() {
		for (KhachTro khach : ds117) {
			khach.hienThiThongTin();
		}
	}
	public double tinhTien(int CMND) {
		double tien = 0;
		for(KhachTro khach:ds117) {
			if(khach.getCMND()==CMND);
				tien=khach.getSoNgayTro()*khach.getGiaPhong();
		}
		return tien;
	}
}
