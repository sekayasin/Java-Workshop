package me.sekayasin;

public class Activity1 {

    public static void main(String[] args) {
        if (args.length < 2){
            System.err.println("Error. Usage is:");
            System.err.println("Activity1 systolic diastolic");
            System.exit(-1);
        }

        int systolic = Integer.parseInt(args[0]);
        int diastolic = Integer.parseInt(args[1]);

        System.out.print(systolic + "/" + diastolic + " is ");

        if (systolic <= 90 || diastolic <= 60)
            System.out.println("low blood pressure");
        else if (systolic >= 140 || diastolic >= 90)
            System.out.println("high blood pressure");
        else if (systolic >= 120 || diastolic >= 80)
            System.out.println("pre-high blood pressure");
        else
            System.out.println("ideal blood pressure");


//        if (args.length >= 2){
//            int systolicBloodPressure = Integer.parseInt(args[0]);
//            int diastolicBloodPressure = Integer.parseInt(args[1]);
//
//            if (systolicBloodPressure >= 140)
//                System.out.println("Systolic high blood pressure");
//            else if (systolicBloodPressure > 120)
//                System.out.println("Systolic pre-high blood pressure");
//            else if (systolicBloodPressure <= 90)
//                System.out.println("Systolic low blood pressure");
//
//            if (diastolicBloodPressure >= 90)
//                System.out.println("Diastolic high blood pressure");
//            else if (diastolicBloodPressure > 80)
//                System.out.println("Diastolic pre-high blood pressure");
//            else if (diastolicBloodPressure <= 60)
//                System.out.println("Diastolic low blood pressure");
//
//        } else {
//            System.err.println("missing input value for either systolic or diastolic blood pressure or even both.");
//        }
    }
}
