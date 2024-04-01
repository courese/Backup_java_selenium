package BillProject;

public class Billclass extends Hotelslist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Billclass v = new Billclass();

		String hotelName = "Sangeetha";
		v.names("Sangeetha");
		System.out.println("\t\t\t\tfood" + "\t\t\t" + "count" + "\t\t" + "total");
		double total1 = v.foods(hotelName, "idly", 3);
		double total2 = v.foods(hotelName, "dosa", 3);
		double total3 = v.foods(hotelName, "poori", 2);
		double total = total1 + total2 + total3;

		double discount = v.discountcalc(total, hotelName);
		double tax = v.taxcalc(total);
		System.out.println("\t\t\t\t-------------------------------------------");
		double price = discount + tax + total;
		System.out.println("\t\t\t\tPrice(Rs):\t\t\t\t" + price);

	}

}
