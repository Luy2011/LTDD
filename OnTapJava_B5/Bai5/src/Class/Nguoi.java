package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	private String hoTen117;
	private Date ngaySinh117;
	private String ngheNghiep117;
	
	public Nguoi() {

	}
	
	public Nguoi(String hoTen, Date ngaySinh, String ngheNghiep) {
		this.hoTen117 = hoTen;
		this.ngaySinh117 = ngaySinh;
		this.ngheNghiep117 = ngheNghiep;
	}

	public void nhapThongTin(Scanner sc) {
		System.out.println("Nhap ho ten: ");
		hoTen117 = sc.nextLine();
		System.out.println("Nhap ngay sinh: ");
		String strDate = sc.nextLine();
		ngaySinh117 = strToDate(strDate);
		System.out.println("Nhap nghe nghiep: ");
		ngheNghiep117=sc.nextLine();
	}

	private Date strToDate(String strDate) {
		Date date = null;
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date = sdf.parse(strDate);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang");
		}
		return date;
	}
	
	public void hienThiThongTin() {
		System.out.println("Ho ten: "+hoTen117);
		System.out.println("Ngay sinh: "+dateToString(ngaySinh117));
		System.out.println("Nghe nghiep: "+ngheNghiep117);
	}

	private String dateToString(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		String strDate = sdf.format(date);
		return strDate;
	}
	
	public Date getNgaySinh() {
		return ngaySinh117;
	}
}
