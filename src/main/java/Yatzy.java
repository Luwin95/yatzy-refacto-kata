import dice.DiceResult;
import score.ChanceScore;
import score.FullHouseScore;
import score.fixed.YatzyScore;
import score.face.*;
import score.fixed.straight.LargeStraightScore;
import score.fixed.straight.SmallStraightScore;
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

    public static int smallStraight(DiceResult firstDiceResult, DiceResult secondDiceResult, DiceResult thirdDiceResult, DiceResult fourthDiceResult, DiceResult fifthDiceResult)
    {
        return new SmallStraightScore(firstDiceResult, secondDiceResult, thirdDiceResult, fourthDiceResult, fifthDiceResult).calculateScore();
    }

    public static int largeStraight(DiceResult firstDiceResult, DiceResult secondDiceResult, DiceResult thirdDiceResult, DiceResult fourthDiceResult, DiceResult fifthDiceResult)
    {
        return new LargeStraightScore(firstDiceResult, secondDiceResult, thirdDiceResult, fourthDiceResult, fifthDiceResult).calculateScore();
    }

    public static int fullHouse(DiceResult firstDiceResult, DiceResult secondDiceResult, DiceResult thirdDiceResult, DiceResult fourthDiceResult, DiceResult fifthDiceResult)
    {
        return new FullHouseScore(firstDiceResult, secondDiceResult, thirdDiceResult, fourthDiceResult, fifthDiceResult).calculateScore();
    }
}



