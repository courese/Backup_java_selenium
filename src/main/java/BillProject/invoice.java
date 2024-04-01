package BillProject;

public class invoice {
	double discount, discount1, discount2, tax, discounts;

	public double discountcalc(double total, String hotelName) {
		double discount = 0;
		if (hotelName == "Sangeetha") {
			double percent = .11;
			discount = total * .11;
			System.out.println("\t\t\t\tDiscount amt @11%\t" + percent + "\t\t" + discount);

		}
		if (hotelName == "Ambur") {
			double percent = .15;
			discount = total * .15;
			System.out.println("\t\t\t\tDiscount amt @15%\t" + percent + "\t\t" + discount1);
		}
		if (hotelName == "Paradise") {
			double percent = .05;
			discount = total * .05;
			System.out.println("\t\t\t\tDiscount amt @50%\t" + percent + "\t\t" + discount2);
		}

		return discount;
	}

	public double taxcalc(double total) {
		double percent = .09;
		double GCST = total * .09;

		System.out.println("\t\t\t\tGCST amt @9%\t\t" + percent + "\t\t" + GCST);
		return GCST;
	}
}
