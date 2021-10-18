package dao;

import java.util.ArrayList;

import bean.khachhangbean;

public class khachhangdao {
	public ArrayList<khachhangbean> getkh(){
		ArrayList<khachhangbean> ds = new ArrayList<khachhangbean>();
		ds.add(new khachhangbean("kh1", "Hồ Quang Dũng", "Hue", "123"));
		ds.add(new khachhangbean("kh2", "Nguyễn Nam", "Hue", "123"));
		ds.add(new khachhangbean("kh3", "Hồ Văn A", "Hue", "123"));
		ds.add(new khachhangbean("kh4", "Phan Tiến B", "dn", "123"));
		ds.add(new khachhangbean("kh5", "Châu Hà", "Hue", "123"));
    	return ds;		
	}
	
}
