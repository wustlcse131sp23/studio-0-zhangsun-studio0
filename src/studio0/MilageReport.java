package studio0;

public class MilageReport {
	
	public static void main(String[] args) {
		int car1miles = 250;
		int car2miles = 100;
		int car3miles = 900;
		
		int totalMiles = car1miles + car2miles + car3miles;
		double milesPerGallon = 24.50111;
		double totalGallons = totalMiles / milesPerGallon;
		double pricePerGallon = 3.05;
		double totalPrice = totalGallons * pricePerGallon;
		
		System.out.println("Total price spent on gas was $" + totalPrice);
	}
}
