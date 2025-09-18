package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TheMuon extends SinhVien{
	private int soMuon117;
	private Date ngayMuon117;
	private Date hanTra117;
	private String soHieu117;
	
	public TheMuon() {
		
	}
	
	public TheMuon(int soMuon, Date ngayMuon , String soHieu) {
		this.soMuon117 = soMuon;
		this.ngayMuon117 = ngayMuon;
		this.soHieu117 = soHieu;
	}
	
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.println("Nhap so muon: ");
		soMuon117 = sc.nextInt();sc.nextLine();
		System.out.println("Nhap ngay muon: ");
		String strNgayMuon = sc.nextLine();
		ngayMuon117=strToDate(strNgayMuon);
		String strNgayTra="31-12-2025";
		hanTra117=strToDate(strNgayTra);
		System.out.println("Nhap so hieu: ");
		soHieu117=sc.nextLine();
	}

	private Date strToDate(String strNgayMuon) {
		Date date = null;
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			date = sdf.parse(strNgayMuon);
		} catch (ParseException e) {
			System.out.println("Sai định dạng ngày tháng!");
		}
		return date;
	}
	
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("So phieu muon: "+ soMuon117);
		System.out.println("Ngay muon: "+ ngayMuon117);
		System.out.println("Han tra: "+ hanTra117);
		System.out.println("So hieu: "+ soHieu117);
	}
	
	public Date getHanTra() {
		return hanTra117;
	}
}
