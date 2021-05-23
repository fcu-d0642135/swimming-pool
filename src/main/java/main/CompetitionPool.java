package main;

public class CompetitionPool {
	public static int singleWaterwayFee = 3000;
	public static int chargeOfCoach = 120;
	public static int chargeOfStudent = 70;
	private char period;

	public static int priceOfRentSingleWay(int rentalTime) {
		return rentalTime * singleWaterwayFee;
	}
	
	public static int priceOfCompetitionPool(int numOfPeople, int numOfCoach) {
		return chargeOfCoach * numOfCoach + (numOfPeople - numOfCoach) * chargeOfStudent;
	}

}
