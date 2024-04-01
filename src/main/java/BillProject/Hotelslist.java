package BillProject;

public class Hotelslist extends Items {
	public void names(String str) {
		if (str == "Sangeetha") {
			System.out.println("\t\t\t\t\tHotel Name: " + str);
			System.out.println("\t\t\t\tAddress: No: 7, Gandhi Nagar, Adyar, Chennai, Tamil Nadu ");
			System.out.println("\t\t\t\t-------------------------------------------");
		} else if (str == "Ambur") {
			System.out.println("\t\t\t\t\tHotel Name: " + str);
			System.out.println("\t\tAddress: 2/383, AGS Colony, Kannappa Nagar, Thiruvanmiyur, Chennai, Tamil Nadu ");
			System.out.println("\t\t\t\t-------------------------------------------");
		} else if (str == "Paradise") {
			System.out.println("\t\t\t\t\tHotel Name: " + str);
			System.out.println("\t\t\t\tAddress: 248, Purasawalkam,Chennai, Tamil Nadu ");
			System.out.println("\t\t\t\t-------------------------------------------");

		} else {
			System.out.println("Hotels not available now");
		}
	}

}
