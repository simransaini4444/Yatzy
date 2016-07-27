package com.bitwiseyatzy;

import java.util.Arrays;

/**
 * Created by Simran on 7/23/2016.
 */
    class Yatzy {
    private final int dievalue1;
    private final int dievalue2;
    private final int dievalue3;
    private final int dievalue4;
    private final int dievalue5;
    private int score;


    public Yatzy(int dievalue1, int dievalue2, int dievalue3, int dievalue4, int dievalue5) {
        this.dievalue1 = dievalue1;
        this.dievalue2 = dievalue2;
        this.dievalue3 = dievalue3;
        this.dievalue4 = dievalue4;
        this.dievalue5 = dievalue5;
    }

    public int scoreYatzyCondition() {
        if (dievalue1 == dievalue2 && dievalue2 == dievalue3 && dievalue3 == dievalue4 && dievalue4 == dievalue5)
            return score = 50;
        return 0;
    }

    public int scoreWhenChanceCondition() {
        score = dievalue1 + dievalue2 + dievalue3 + dievalue4 + dievalue5;
        return score;
    }

    private int[] diceArray() {
        return new int[]{dievalue1, dievalue2, dievalue3, dievalue4, dievalue5};
    }

    public int threeOfKind() {
        score = countSamekindAndGiveScore(3);
        return score;
    }

    public int fourOfKind() {
        score = countSamekindAndGiveScore(4);
        return score;
    }

    public int ones() {
        score = sameNumbers(1);
        return score;
    }

    public int twos() {
        score = sameNumbers(2);
        return score;
    }

    public int threes() {
        score = sameNumbers(3);
        return score;
    }

    public int fours() {
        score = sameNumbers(4);
        return score;
    }

    public int fives() {
        score = sameNumbers(5);
        return score;
    }

    public int sixes() {
        score = sameNumbers(6);
        return score;
    }

    public int smallStraight() {
        int[] dice = diceArray();
        Arrays.sort(dice);
        if (dice[0] == 1 && dice[1] == 2 && dice[2] == 3 && dice[3] == 4 && dice[4] == 5)
            score = 15;
        return score;
    }

    public int largeStraight() {
        int[] dice = diceArray();
        Arrays.sort(dice);
        if (dice[0] == 2 && dice[1] == 3 && dice[2] == 4 && dice[3] == 5 && dice[4] == 6)
            score = 20;
        return score;
    }

    public int fullHouse() {
        int sum = countSamekindAndGiveScore(2);
        score = countSamekindAndGiveScore(3);
        return sum + score;
    }

    public int pair() {
        score = countSamekindAndGiveScore(2);
        return score;
    }

    public int twoPair() {
        int[] dice = diceArray();
        Arrays.sort(dice);
        int sum=0;
        for (int i = 1; i <= 6; i++) {
            int count=0;
            for (int j = 0;j<3; j++) {
                count = getCount(dice[j] == i, count);
                if(count==2)
                    sum=2*i;
            }
            for (int j = 2; j < 5; j++) {
                count = getCount(dice[j]==i, count);
                if(count==2)
                    score=2*i;
            }
        }
        return sum+score;
    }
    private int getCount(boolean b, int count) {
        if(b)
             count++;
        return count;
    }


    private int countSamekindAndGiveScore(int c)
    {
        int[] dice = diceArray();
        Arrays.sort(dice);
        for (int i = 1; i <= 6; i++) {
            int count = 0;
            for (int j = 0; j < 5; j++) {
                if (dice[j] == i)
                    count++;
                if (count == c)
                    score = c * i;
            }
        }
        return score;
    }
    private int sameNumbers(int a)
    {
        int[] dice = diceArray();
        for (int i : dice) {
            if (i == a)
                score = score + a;
        }
        return score;
    }

}
