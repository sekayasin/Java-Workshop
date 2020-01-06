package me.sekayasin;

/**
 * <H1>Ch3Ex1WordTool is a Word Tool class</H1>
 * A class to perform calculations about text
 *
 * @author sekayasin
 * @version 0.1
 * @since 20200108
 * */
public class Ch3Ex1WordTool {

    public Ch3Ex1WordTool() {

    }

    /**
     * <h2>wordCount</h2>
     * returns the amount of words in a text, takes a string as parameter<br>
     *
     * count - variable to count words<br>
     * if the entry is empty or is null, count is zero,
     * therefore we evaluate it only otherwise.<br>
     * Use the split method from the string class to
     * separate the words having the whitespace as separator<br><br>
     *
     * @param s - text string
     * @return int
     * */
    public int wordCount (String s){
        int count = 0;
        if (!(s == null || s.isEmpty())) {
            String[] w = s.split("\\s+");
            count = w.length;
        }
        return count;
    }

    /**
     * <h2>symbolCount</h2>
     * returns the amount of symbols in a string with or without counting spaces
     *
     * count - variable to count symbols<br>
     * if the entry is empty or is null, count is zero
     * therefore we evaluate it only otherwise.<br>
     * With whitespaces return the full length.<br>
     * Without whitespaces, eliminate whitespaces
     * and get the length on the fly<br><br>
     *
     * @param s - text string
     * @param withSpaces - with whitespaces
     * @return int
     * */
    public int symbolCount (String s, boolean withSpaces){
        int count = 0;
        if (!(s == null || s.isEmpty())) {
            if (withSpaces) {
                count = s.length();
            } else {
                count = s.replace(" ", "").length();
            }
        }
        return count;
    }

    /**
     * <h2>getFrequency</h2>
     * returns the amount of occurrences of a symbol in a string
     *
     * count - variable to count the frequency of the search character<br>
     * if the entry is empty or is null, count is zero
     * therefore we evaluate it only otherwise<br>
     *
     * @param s - text string
     * @param c - character to search
     * @return int
     * */
    public int getFrequency(String s, char c) {
        int count = 0;
        if (!(s == null || s.isEmpty())) {
            count = s.length() - s.replace(Character.toString(c), "").length();
        }
        return count;
    }

    public static void main(String[] args){

        Ch3Ex1WordTool wt = new Ch3Ex1WordTool();
        String text = "The river carried the memories from her childhood.";
        char search = 'e';

        System.out.println("Analyzing the text: \n" + text);
        System.out.println("Total words: " + wt.wordCount(text));
        System.out.println("Total symbols (w. spaces): " + wt.symbolCount(text,true));
        System.out.println("Total symbols (wo. spaces): " + wt.symbolCount(text, false));
        System.out.println("Total amount of " + search + ": " + wt.getFrequency(text, search));
    }
}
