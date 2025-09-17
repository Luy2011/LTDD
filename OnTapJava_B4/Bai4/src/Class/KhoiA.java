package Class;

import java.util.Scanner;

public class KhoiA extends ThiSinh {
	private String mon1117, mon2117, mon3117;

	public KhoiA() {

	}

	public KhoiA(String mon1, String mon2, String mon3) {

		this.mon1117 = mon1;
		this.mon2117 = mon2;
		this.mon3117 = mon3;
	}

	public void NhapThongTin(Scanner sc) {
		super.NhapThongTin(sc);
		System.out.println("Nhap mon thu nhat: ");mon1117 = sc.nextLine();
		System.out.println("Nhap mon thu hai: ");mon2117 = sc.nextLine();
		System.out.println("Nhap mon thu ba: ");mon3117 = sc.nextLine();
	}
	
	public void hienThiThongTin() {
		super.HienThiThongTin();
		System.out.println("To hop mon thi: "+mon1117+"-"+mon2117+"mon3");
	}
}
