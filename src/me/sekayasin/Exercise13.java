package me.sekayasin;

public class Exercise13 {

    public static void main(String[] args) {

        String[] letters = {"A", "B", "C", "D", "E"};

        for (String letter : letters) {
            if (letter.equals("A")) {
                continue;
            }

            System.out.println(letter);

            if (letter.equals("C")) {
                break;
            }
        }
    }
}
