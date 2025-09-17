package Test;

import java.util.Scanner;

import Class.KhuPho;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		KhuPho qlkp117 = new KhuPho();
		
		qlkp117.nhapDanhSach(sc);
		
		System.out.println("Danh sach ho dan co nguoi 80 tuoi la: ");
		qlkp117.timKiemThongTin();

	}

}
