package Test;

import java.util.Scanner;

import Class.QuanLy;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		QuanLy ql117 = new QuanLy();
		
		ql117.nhapDanhSach(sc);
		
		System.out.println("Danh sach sinh vien tra sach vao cuoi thang: ");
		ql117.hienThiDanhSachTraCuoiThang();
	}
}
