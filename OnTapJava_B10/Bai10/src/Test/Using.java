package Test;

import java.util.Scanner;

import Class.QuanLy;

public class Using {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		QuanLy ql117 = new QuanLy();
		ql117.nhapDanhSach(sc);
		
		System.out.println("Danh sach bien lai cua cac ho gia dinh la: ");
		ql117.hienThiDanhSach();
		
		sc.close();
	}
}
