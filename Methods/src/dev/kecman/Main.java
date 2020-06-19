package dev.kecman;

public class Main {

    public static void main(String[] args) {
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
//
//        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
//        System.out.println(highScore);
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//
//        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
//        System.out.println(highScore);

        // Challenge
        int firstScore = calculateHighstorePosition(1500);
        displayHighScorePosition("Name 1", firstScore);

        int secondScore = calculateHighstorePosition(900);
        displayHighScorePosition("name 2", secondScore);

        int thirdScore = calculateHighstorePosition(400);
        displayHighScorePosition("name 2", thirdScore);

        int fourthScore = calculateHighstorePosition(50);
        displayHighScorePosition("name 2", fourthScore);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;

            return finalScore;
        }else{
            return -1;
        }

    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position);
    }

    public static int calculateHighstorePosition(int playerScore){
        if(playerScore >= 1000){
            return 1;
        }else if(playerScore >= 500){
            return 2;
        }else if(playerScore >= 100){
            return 3;
        }else{
            return 4;
        }
    }
}
