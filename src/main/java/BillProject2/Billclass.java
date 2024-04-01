package BillProject2;

import java.io.IOException;

public class Billclass extends Hotel1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String Hotelname="Sangeetha";
		Billclass s = new Billclass();
		s.hotelname(Hotelname);
		double total1=s.restaurant(Hotelname, "Tandoori", 2);
	
		double total= total1;
		s.calc(total);

	}

}
