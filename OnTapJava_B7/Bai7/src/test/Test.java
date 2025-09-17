package test;

import java.util.Scanner;

import Class.QLHS;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		QLHS list117 = new QLHS();
		
		list117.nhapDanhSachHS(sc);
		
		System.out.println("Nhung hoc sinh sinh nam 1985 va que Thai Nguyen la: ");
		list117.timKiemThongTin(1985, "Thai Nguyen");
		
		System.out.println("Nhung hoc sinh hoc lop 10A1 la: ");
		list117.timKiemThongTin("10A1");
	}
}
