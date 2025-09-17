package Class;

import java.util.Scanner;

public class KhoiB extends KhoiA  {
	private String mon1117, mon2117, mon3117;
	public KhoiB() {

	}
	
	
	public KhoiB( String mon1, String mon2, String mon3) {
		this.mon1117 = mon1;
		this.mon2117 = mon2;
		this.mon3117 = mon3;
	}


	public void NhapThongTin(Scanner sc) {
		super.NhapThongTin(sc);
	}
	
	public void hienThiThongTin() {
		super.HienThiThongTin();
		System.out.println("To hop mon thi: "+mon1117+"-"+mon2117+"mon3");
	}
}
