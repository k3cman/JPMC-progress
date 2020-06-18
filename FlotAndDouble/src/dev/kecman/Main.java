package dev.kecman;

public class Main {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        
        
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;


        // Challenge

        double myPounds = 200;
        double poundToKgRatio = 0.45359237;

        double result = myPounds * poundToKgRatio;

        System.out.println(result);


        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;

    }
}
