package Class;

import java.util.Scanner;

public class ThiSinh {
	private String  hoTen117, diaChi117, dienUuTienKV117;
	private int soBaoDanh117;
	public ThiSinh() {

	}

	public ThiSinh(int soBaoDanh, String hoTen, String diaChi, String dienUuTienKV) {
		this.soBaoDanh117 = soBaoDanh;
		this.hoTen117 = hoTen;
		this.diaChi117 = diaChi;
		this.dienUuTienKV117 = dienUuTienKV;
	}
	
	public void NhapThongTin(Scanner sc) {
		System.out.println("Nhap so bao danh thi sinh: ");soBaoDanh117=sc.nextInt();sc.nextLine();
		System.out.println("Nhap ho ten thi sinh: ");hoTen117=sc.nextLine();
		System.out.println("Nhap dia chi thi sinh: ");diaChi117=sc.nextLine();
		System.out.println("Nhap dien uu tien khu vuc uu tien thi sinh: ");dienUuTienKV117=sc.nextLine();
	}
	
	public void HienThiThongTin() {
		System.out.println("So bao danh thi sinh: "+ soBaoDanh117);
		System.out.println("Ho ten thi sinh: "+ hoTen117);
		System.out.println("Dia chi thi sinh: "+ diaChi117);
		System.out.println("Dien uu tien khu vuc uu tien thi sinh: "+ dienUuTienKV117);
	}
	
	public int getSBD() {
		return soBaoDanh117;
	}
}
