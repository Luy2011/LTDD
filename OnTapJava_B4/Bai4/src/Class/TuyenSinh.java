package Class;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TuyenSinh {
	private ArrayList<ThiSinh> dsts117;
	
	public TuyenSinh() {
		dsts117 = new ArrayList<ThiSinh>(10);
	}
	public void ThemThiSinh(ThiSinh ts) {
		dsts117.add(ts);
	}
	public void nhapThongTinThiSinh(Scanner sc ) {
		ThiSinh ts;
		int chon;
		
		System.out.println("Nhap so luong thi sinh: ");
		int n = sc.nextInt();sc.nextLine();
				
		for(int i=0;i<n; i++) {
			System.out.println("Vui long chon khoi (1-Khoi A; 2-Khoi B; 3-Khoi C");
			chon = sc.nextInt();
			
			switch (chon) {
			case 1:
				ts = new KhoiA("Toan","Ly","Hoa");
				break;
			case 2:
				ts = new KhoiB("Toan","Hoa","Sinh");

				break;
			case 3:
				ts = new KhoiC("Van", "Su","Dia");
				break;
			default:
				ts = new KhoiA("Toan","Ly","Hoa");
				break;
			}
			ts.NhapThongTin(sc);
			ThemThiSinh(ts);
			
		}
	}
	
	public void hienThiDanhSach() {
		int n = dsts117.size();
		for(int i=0;i<n;i++) {
			System.out.println("Thi sinh thu "+i+"la: ");
			dsts117.get(i).HienThiThongTin();
		}
	}
	
	public void timKiemThiSinh(int soBaoDanh) {
		for (ThiSinh thiSinh : dsts117) {
			if(thiSinh.getSBD()==soBaoDanh) {
				thiSinh.HienThiThongTin();
			}

		}
	}
}
