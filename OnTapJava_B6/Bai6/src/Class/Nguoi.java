package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	protected String hoTen117;
	protected Date ngaySinh117;
	protected int CMND117;
	
	public Nguoi() {
		
	}
	
	public Nguoi(String hoTen, Date ngaySinh, int cMND) {
		this.hoTen117 = hoTen;
		this.ngaySinh117 = ngaySinh;
		this.CMND117 = CMND117;
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.println("Nhap ho ten: ");
		hoTen117 = sc.nextLine();
		System.out.println("Nhap ngay sinh: ");
		String strDate = sc.nextLine();
		ngaySinh117 = strToDate(strDate);
		System.out.println("Nhap CMND:");
		CMND117 = sc.nextInt();sc.nextLine();
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
		System.out.println("Ho ten: " +hoTen117);
		System.out.println("Ngay sinh: " +ngaySinh117);
		System.out.println("CMND: " +CMND117);
	}
	
	public int getCMND() {
		return CMND117;
	}
}
