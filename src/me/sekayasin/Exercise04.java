package me.sekayasin;

public class Exercise04 {

    public static void main(String[] args){
        int smallDiscount = 0;
        int mediumDiscount = 10;
        int largeDiscount = 15;

        int mediumThreshold = 5;
        int largeThreshold = 50;

        int purchaseAmount = 40;

        if (purchaseAmount >= largeThreshold) {
            System.out.println("You get a discount of " + largeDiscount + "%");
        } else if (purchaseAmount >= mediumThreshold) {
            System.out.println("You get a discount of " + mediumDiscount + "%");
        } else {
            System.out.println("You get a discount of " + smallDiscount + "%");
        }
    }
}
