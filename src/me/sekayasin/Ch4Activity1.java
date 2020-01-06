package me.sekayasin;

public class Ch4Activity1 {

    public static void main(String[] args) {

        String[] text = {"So", "many", "books", "so", "little", "time"};
        String searchText = "so";
        int occurrence = -1;

        for(int i = 0; i < text.length; i++) {
            if (text[i].compareToIgnoreCase(searchText) == 0){
                occurrence = i;
                System.out.println("Found query at: " + occurrence);
            }
        }
    }
}
