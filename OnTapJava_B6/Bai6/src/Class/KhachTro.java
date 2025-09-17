package Class;

import java.util.Date;
import java.util.Scanner;

public class KhachTro extends Nguoi {
	private int soNgayTro117;
	private String loaiPhong117;
	private double giaPhong117;
	public KhachTro() {
	
	}
	public KhachTro(String hoTen, int CMND, int soNgayTro, String loaiPhong, double giaPhong) {
		this.hoTen117 = hoTen;
		this.CMND117 = CMND;
		this.soNgayTro117 = soNgayTro;
		this.loaiPhong117 = loaiPhong;
		this.giaPhong117 = giaPhong;
	}
	
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.println("Nhap vao so ngay tro: ");
		soNgayTro117 = sc.nextInt();loaiPhong117 = sc.nextLine();
		System.out.println("Nhap vao loai phong: ");
		loaiPhong117 = sc.nextLine();
		System.out.println("Nhap gia phong: ");
		giaPhong117 = sc.nextDouble();sc.nextLine();
	}
	
	public void hienThiThongTin() {
		super.hienThiThongTin();
		
		System.out.println("So ngay tro" +soNgayTro117);
		System.out.println("Loai phong" +loaiPhong117);
		System.out.println("Gia phong" +giaPhong117);
	}
	
	public int getSoNgayTro() {
		return soNgayTro117;
	}
	
	public double getGiaPhong() {
		return giaPhong117;
	}
}
