package me.sekayasin;

public class Exercise06 {

    public static void main(String[] args) {
        int height = 200;
        int minHeight = 121;
        String result;

        result = (height > minHeight) ? "You're allowed on the ride" : "Sorry, you do not meet the height requirement";
        System.out.println(result);
    }
}
