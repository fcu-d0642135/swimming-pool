package main;

public class Payment {
    public static int weekdayCharge = 200;
    public static int weekendCharge = 250;
    private static int money;
    private final float totalCharge;

    public Payment(Discount discount, String dateTime) {

        String week = dateTime.split(" ")[1];

        switch (week) {
            case "週一":
            case "週二":
            case "週三":
            case "週四":
            case "週五":
                money = weekdayCharge;
                break;
            case "週六":
            case "週日":
                money = weekendCharge;
                break;
        }

        totalCharge = money * discount.getDiscount();
    }

    public void printPayment() {
        System.out.println("Please pay $" + this.totalCharge);
    }

    public float getTotalCharge(){
        return totalCharge;
    }
}
