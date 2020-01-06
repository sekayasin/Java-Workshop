package me.sekayasin;

public class Exercise03 {

    public static void main(String[] args) {
        int speed = 75;
        int speedForFine = 70;
        int maxSpeed = 60;

        if (speed >= maxSpeed) {
            System.out.println("You're over the speed limit!");
            if (speed >= speedForFine){
                System.out.println("You're eligible for a fine!");
            }
        }
    }
}
