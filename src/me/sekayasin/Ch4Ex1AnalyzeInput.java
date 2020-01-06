package me.sekayasin;

import javax.xml.crypto.Data;
import java.io.Console;
import java.util.*;

public class Ch4Ex1AnalyzeInput {

    public static void main(String[] args) {
        ArrayList<String> text = new ArrayList<>();

        /**
         * using the console to capture input from the user
         * */
//        Console cons;
//        String line = "";
//        while (!line.equals("*") && (cons = System.console()) != null && (line = cons.readLine()) != null) {
//            List<String> lineList = new ArrayList<>(Arrays.asList(line.split(" ")));
//            text.addAll(lineList);
//        }

        /**
         * Using the scanner to capture input from the user
         * */
        Scanner in = new Scanner(System.in);
        String line = "";
        while (!line.equals("*")) {
            line = in.nextLine();
            List<String> lineList = new ArrayList<>(Arrays.asList(line.split(" ")));
            text.addAll(lineList);
        }

        System.out.println("You typed: " + text);
        System.out.println("Word count: " + text.size());

        Set <String> textSet = new HashSet<>();
        textSet.addAll(text);
        Iterator iterator = textSet.iterator();
        List <DataPoint> frequencies = new ArrayList<>();
        while(iterator.hasNext()){
//            Point to next element
            String s = (String) iterator.next();
//            get the amount of times this word shows up in the text
            int freq = Collections.frequency(text, s);
//            print out the result
            System.out.println(s + " appears " + freq + " times");
//            create the object to be stored
            DataPoint dataPoint = new DataPoint(s, freq);
//            add dataPoints to the list
            frequencies.add(dataPoint);
        }
        Collections.sort(frequencies, Collections.reverseOrder(new SortByValue()));
        System.out.println("Resulted sorted");
        for (int i = 0; i < frequencies.size(); i++)
            System.out.println(frequencies.get(i).value + " times for word " + frequencies.get(i).key);
    }
}

class DataPoint {
    String key = "";
    int value = 0;
//    constructor
    DataPoint(String s, int i) {
        key = s;
        value = i;
    }
}

class SortByValue implements Comparator<DataPoint> {
//    used for sorting in ascending order
    public int compare(DataPoint a, DataPoint b) {
        return a.value - b.value;
    }
}
