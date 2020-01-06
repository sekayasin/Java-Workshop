package me.sekayasin;

public class Exercise07 {

    public static void main(String[] args) {
        double a = .6 + .6 + .6 + .6 + .6 + .6;
        double b = .6 * 6;

        double x = .7 + .7 + 7 + .7 + .7;
        double y = .7 * 6;

        System.out.println("A is " + x);
        System.out.println("B is " + y);

        if (x != y) {
            System.out.println("A is not equal to B.");
        }

        if (Math.abs(x - y) < .001) {
            System.out.println("A is close enough to B.");
        }
    }
}
