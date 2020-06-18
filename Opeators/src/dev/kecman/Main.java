package dev.kecman;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;    // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println(previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("10 * result = " + result);

        result = result / 5; // 20 / 5 = 4;
        System.out.println("20 / 5 = " + result);

        result = result % 3; // The reminder of (4 % 3 ) = 1
        System.out.println("4 % 3 = " + result);

        result++;
        System.out.println(result);
        result--;
        System.out.println(result);

        result += 2;
        System.out.println(result);

        result *= 10;
        System.out.println(result);

        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("It is not an alien!");
            System.out.println("Alien!");
        }

        int topScore = 80;
        if( topScore < 100) {
            System.out.println("You got the highest score");
        }

        int secondTopScore = 95;
        if((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

        if((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of conditions are true");
        }

        int newValue = 50;
        if(newValue == 50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if(isCar == true){
            System.out.println("THis is not supposed to happend");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar){
            System.out.println("wasCar is true");
        }

        double firstValue = 20.00d;
        double secondValue = 80.00d;
        double cResult = (firstValue + secondValue) * 100;
        double remainder = cResult % 40.00;

        boolean isZero = remainder == 0 ? true : false;

        System.out.println(isZero);

        if(!isZero){
            System.out.println("Got some remainder");
        }

    }
}