package Class;

import java.util.Scanner;

public class BienLai extends KhachHang{
	private int chiSoMoi117;
	private int chiSoCu117;
	private double tien117;
	
	
	
	public BienLai() {

	}

	public BienLai(String tenChuHo, int chiSoMoi, int chiSoCu, double tien) {
		this.tenChuHo117=tenChuHo;
		this.chiSoCu117 = chiSoMoi;
		this.chiSoCu117 = chiSoCu;
		this.tien117 = tien;
	}



	public BienLai(int chiSoMoi, int chiSoCu, double tien) {
		this.chiSoCu117 = chiSoMoi;
		this.chiSoCu117 = chiSoCu;
		this.tien117 = tien;
	}
	
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.println("Nhap chi so moi: ");
		chiSoCu117=sc.nextInt();sc.nextLine();
		System.out.println("Nhap chi so cu: ");
		chiSoCu117=sc.nextInt();sc.nextLine();
		tien117=(chiSoCu117-chiSoCu117)*750;
		
	}
	
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Chi so moi: "+ chiSoCu117);
		System.out.println("Chi so cu: "+ chiSoCu117);
		System.out.println("Tien: "+ tien117);
	}
}
