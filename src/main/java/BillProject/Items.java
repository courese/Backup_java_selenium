package BillProject;

public class Items extends invoice {
	double cost;
	double total;
	double price;

	public double foods(String hotelName, String food, int count) {
		if (hotelName == "Sangeetha") {

			String[] menu = { "idly", "wada", "dosa", "poori" };
			int rate[] = { 30, 35, 40, 30 };

			for (int i = 0; i < menu.length; i++) {
				if (food.equalsIgnoreCase(menu[i])) {
					total = rate[i] * count;
					System.out.println("\t\t\t\t" + food + "\t\t\t" + rate[i] + "*" + count + "\t\t" + total);
					break;
				}
			}
		}

		else if (hotelName == "Ambur") {
			System.out.println("\t\t\t\tfood" + "\t\t\t" + "count" + "\t\t" + "total");
			String[] menu = { "idly", "chapathi", "dosa", "chola poori" };
			int rate[] = { 30, 10, 40, 60 };

			for (int i = 0; i < menu.length; i++) {
				if (food.equalsIgnoreCase(menu[i])) {
					total = rate[i] * count;
					System.out.println("\t\t\t\t" + food + "\t\t" + rate[i] + "*" + count + "\t\t" + total);
					break;
				}
			}
		}

		else if (hotelName == "Paradise") {
			System.out.println("\t\t\t\tfood" + "\t\t\t" + "count" + "\t\t" + "total");
			String[] menu = { "Pongal", "chapathi", "dosa", "Kichadi", "wada", "poori" };
			int rate[] = { 30, 10, 40, 30, 10, 40 };

			for (int i = 0; i < menu.length; i++) {
				if (food.equalsIgnoreCase(menu[i])) {
					total = rate[i] * count;
					System.out.println("\t\t\t\t" + food + "\t\t\t" + rate[i] + "*" + count + "\t\t" + total);
					break;
				}
			}

		} else {
			System.out.println("the food is not available right now");
		}

		return total;
	}

}
