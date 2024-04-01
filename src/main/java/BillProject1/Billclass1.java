package BillProject1;

public class Billclass1 extends Hotel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Billclass1 S = new Billclass1();
		String Hotelname = "Ambur";
		S.restaurant(Hotelname);
		double total2 = S.check(Hotelname, "paneer friedrice", 1);
		double total3 = S.check(Hotelname, "chicken Briyani", 1);
		double total= total2 + total3;
		S.calc(total);

	}

}
