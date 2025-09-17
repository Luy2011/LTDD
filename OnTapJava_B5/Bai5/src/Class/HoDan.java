package Class;

import java.util.Date;
import java.util.Scanner;

public class HoDan extends Nguoi{
	private int soNguoi117, soNha117;
	private Nguoi[] list117;
	public HoDan() {
		list117 = new Nguoi[10];
	}
	public HoDan(String hoTen, Date ngaySinh, String ngheNghiep, int soNguoi, int soNha) {
		super(hoTen, ngaySinh, ngheNghiep);
		this.soNguoi117 = soNguoi;
		this.soNha117 = soNha;
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.println("Nhap so nguoi: ");
		soNguoi117 = sc.nextInt();sc.nextLine();
		System.out.println("Nhap so nha: ");
		soNha117 = sc.nextInt();sc.nextLine();
		System.out.println("Nhap thong tin cho tung nguoi trong ho: ");
		for(int i = 0;i<soNguoi117;i++) {
			System.out.println("Nguoi thu "+(i+1)+" la: ");
			list117[i] = new Nguoi();
			list117[i].nhapThongTin(sc);		
		}
	}
	
	public void hienThiThongTin() {
		System.out.println("So nguoi: "+soNguoi117);
		System.out.println("So nha: "+soNha117);
		System.err.println("Thong tin tung nguoi trong gia dinh: ");
		for(int i = 0;i<soNguoi117;i++) {
			System.out.println("Nguoi thu "+(i+1)+" la: ");
			list117[i].hienThiThongTin();
		}
	}
	
	public Nguoi[] getList() {
		return list117;
	}
	
	public int getSoNguoi() {
		return soNguoi117;
	}
}
