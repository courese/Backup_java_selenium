package BillProject1;

public class Hotel1 extends Hotel2{
	double total = 0;
	public void restaurant(String str) {
		if (str == "Ambur") {
			System.out.println("\t\t\t\t\tHotel Name: " + str);
			System.out.println("\t\t\t\tAddress: No: 7, Gandhi Nagar, Adyar, Chennai, Tamil Nadu ");
			System.out.println("\t\t\t\t--------------------------------------------------------------");
			System.out.println("\t\t\t\t" + "Food" + "\t\t\t" + "Rate" + "*" + "Count" + "\t\t" + "Total");
		}
	}

	public double check(String str, String food, int count) {

		String[] items = { "Paneer Friedrice", "chicken Briyani", "Tandoori", "fish gravy" };
		int rate[] = { 210, 230, 260, 180 };
		double total=0;
		
			for (int i = 0; i < items.length; i++) {
				if (food.equalsIgnoreCase(items[i])) {

				total = rate[i] * count;
				System.out.println("\t\t\t\t" + food + "\t\t" + rate[i] + "*" + count + "\t\t" + total);				
			}
			}
			return total;
	}
	public void calc(double total)
	{
					
			double discount = total * .15;
			double taxpercent = .09;
			double tax = total * .09;
			double percent = .15;
			System.out.println("\t\t\t\tDiscount amt @15%\t" + percent + "\t\t\t" + discount);
			System.out.println("\t\t\t\tGCST amt @9%\t\t" + taxpercent + "\t\t\t" + tax);
			double price = discount + tax + total;
			System.out.println("\t\t\t\tPrice(Rs):\t\t\t\t\t" + price);


		
	}
}
