import dice.DiceResult;
import score.ChanceScore;
import score.YatzyScore;
import score.face.*;
import score.severalOfAKind.FourOfAKindScore;
import score.severalOfAKind.PairScore;
import score.severalOfAKind.ThreeOfAKindScore;
import score.severalOfAKind.TwoPairsScore;


public class Yatzy {

    public static int chance(DiceResult firstDiceResult, DiceResult secondDiceResult, DiceResult thirdDiceResult, DiceResult fourthDiceResult, DiceResult fifthDiceResult)
    {
        return new ChanceScore(firstDiceResult, secondDiceResult, thirdDiceResult, fourthDiceResult, fifthDiceResult).calculateScore();
    }

    public static int yatzy(DiceResult firstDiceResult, DiceResult secondDiceResult, DiceResult thirdDiceResult, DiceResult fourthDiceResult, DiceResult fifthDiceResult)
    {
        return new YatzyScore(firstDiceResult, secondDiceResult, thirdDiceResult, fourthDiceResult, fifthDiceResult).calculateScore();
    }

    public static int ones(DiceResult firstDiceResult, DiceResult secondDiceResult, DiceResult thirdDiceResult, DiceResult fourthDiceResult, DiceResult fifthDiceResult) {
        return new OnesScore(firstDiceResult, secondDiceResult, thirdDiceResult, fourthDiceResult, fifthDiceResult).calculateScore();
    }

    public static int twos(DiceResult firstDiceResult, DiceResult secondDiceResult, DiceResult thirdDiceResult, DiceResult fourthDiceResult, DiceResult fifthDiceResult) {
        return new TwosScore(firstDiceResult, secondDiceResult, thirdDiceResult, fourthDiceResult, fifthDiceResult).calculateScore();
    }

    public static int threes(DiceResult firstDiceResult, DiceResult secondDiceResult, DiceResult thirdDiceResult, DiceResult fourthDiceResult, DiceResult fifthDiceResult) {
        return new ThreesScore(firstDiceResult, secondDiceResult, thirdDiceResult, fourthDiceResult, fifthDiceResult).calculateScore();
    }

    public static int fours(DiceResult firstDiceResult, DiceResult secondDiceResult, DiceResult thirdDiceResult, DiceResult fourthDiceResult, DiceResult fifthDiceResult)
    {
        return new FoursScore(firstDiceResult, secondDiceResult, thirdDiceResult, fourthDiceResult, fifthDiceResult).calculateScore();
    }

    public static int fives(DiceResult firstDiceResult, DiceResult secondDiceResult, DiceResult thirdDiceResult, DiceResult fourthDiceResult, DiceResult fifthDiceResult)
    {
        return new FivesScore(firstDiceResult, secondDiceResult, thirdDiceResult, fourthDiceResult, fifthDiceResult).calculateScore();
    }

    public static int sixes(DiceResult firstDiceResult, DiceResult secondDiceResult, DiceResult thirdDiceResult, DiceResult fourthDiceResult, DiceResult fifthDiceResult)
    {
        return new SixesScore(firstDiceResult, secondDiceResult, thirdDiceResult, fourthDiceResult, fifthDiceResult).calculateScore();
    }

    public static int pair(DiceResult firstDiceResult, DiceResult secondDiceResult, DiceResult thirdDiceResult, DiceResult fourthDiceResult, DiceResult fifthDiceResult)
    {
        return new PairScore(firstDiceResult, secondDiceResult, thirdDiceResult, fourthDiceResult, fifthDiceResult).calculateScore();
    }

    public static int twoPairs(DiceResult firstDiceResult, DiceResult secondDiceResult, DiceResult thirdDiceResult, DiceResult fourthDiceResult, DiceResult fifthDiceResult)
    {
            return new TwoPairsScore(firstDiceResult, secondDiceResult, thirdDiceResult, fourthDiceResult, fifthDiceResult).calculateScore();
    }

    public static int threeOfAKind(DiceResult firstDiceResult, DiceResult secondDiceResult, DiceResult thirdDiceResult, DiceResult fourthDiceResult, DiceResult fifthDiceResult)
    {
        return new ThreeOfAKindScore(firstDiceResult, secondDiceResult, thirdDiceResult, fourthDiceResult, fifthDiceResult).calculateScore();
    }


    public static int fourOfAKind(DiceResult firstDiceResult, DiceResult secondDiceResult, DiceResult thirdDiceResult, DiceResult fourthDiceResult, DiceResult fifthDiceResult)
    {
        return new FourOfAKindScore(firstDiceResult, secondDiceResult, thirdDiceResult, fourthDiceResult, fifthDiceResult).calculateScore();
    }

    public static int smallStraight(int d1, int d2, int d3, int d4, int d5)
    {
        int[] tallies;
        tallies = new int[6];
        tallies[d1-1] += 1;
        tallies[d2-1] += 1;
        tallies[d3-1] += 1;
        tallies[d4-1] += 1;
        tallies[d5-1] += 1;
        if (tallies[0] == 1 &&
            tallies[1] == 1 &&
            tallies[2] == 1 &&
            tallies[3] == 1 &&
            tallies[4] == 1)
            return 15;
        return 0;
    }

    public static int largeStraight(int d1, int d2, int d3, int d4, int d5)
    {
        int[] tallies;
        tallies = new int[6];
        tallies[d1-1] += 1;
        tallies[d2-1] += 1;
        tallies[d3-1] += 1;
        tallies[d4-1] += 1;
        tallies[d5-1] += 1;
        if (tallies[1] == 1 &&
            tallies[2] == 1 &&
            tallies[3] == 1 &&
            tallies[4] == 1
            && tallies[5] == 1)
            return 20;
        return 0;
    }

    public static int fullHouse(int d1, int d2, int d3, int d4, int d5)
    {
        int[] tallies;
        boolean _2 = false;
        int i;
        int _2_at = 0;
        boolean _3 = false;
        int _3_at = 0;




        tallies = new int[6];
        tallies[d1-1] += 1;
        tallies[d2-1] += 1;
        tallies[d3-1] += 1;
        tallies[d4-1] += 1;
        tallies[d5-1] += 1;

        for (i = 0; i != 6; i += 1)
            if (tallies[i] == 2) {
                _2 = true;
                _2_at = i+1;
            }

        for (i = 0; i != 6; i += 1)
            if (tallies[i] == 3) {
                _3 = true;
                _3_at = i+1;
            }

        if (_2 && _3)
            return _2_at * 2 + _3_at * 3;
        else
            return 0;
    }
}



