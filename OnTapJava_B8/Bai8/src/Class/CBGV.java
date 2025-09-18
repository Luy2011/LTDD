package Class;

import java.util.Scanner;

public class CBGV extends Nguoi{
	private double luongCung117, thuong117, phat117, luongThucLinh117;

	public CBGV() {
		
	}

	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		
		System.out.println("Nhap luong cung: ");
		luongCung117 = sc.nextDouble();sc.nextLine();
		System.out.println("Nhap thuong: ");
		thuong117= sc.nextDouble();sc.nextLine();
		System.out.println("Nhap phat: ");
		phat117 = sc.nextDouble();sc.nextLine();
		
		luongThucLinh117 = luongCung117+thuong117-phat117; 
	}
	
	public void hienThiThongTin() {
		super.hienThiThongTin();
		
		System.out.println("Luong cung: "+ luongCung117);
		System.out.println("Thuong: "+ thuong117);
		System.out.println("Phat: "+ phat117);
		System.out.println("Luong thuc linh: "+ luongThucLinh117);
	}
	
	public double getLuongTL() {
		return luongThucLinh117;
				
	}
}
