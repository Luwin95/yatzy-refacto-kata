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

import java.util.Arrays;
import java.util.List;


public class YatzyGame {

    /**
     * The list of the diceResults launched during Yatzy game, limited to 5 results
     */
    private final List<DiceResult> diceResults;

    /**
     * The score of a Yatzy game is calculated with 5 dices results (between 1 and 6)
     * @param firstDiceResult the result of the first dice
     * @param secondDiceResult the result of the second dice
     * @param thirdDiceResult the result of the third dice
     * @param fourthDiceResult the result of the fourth dice
     * @param fifthDiceResult the result of the fifth dice
     */
    public YatzyGame(DiceResult firstDiceResult, DiceResult secondDiceResult, DiceResult thirdDiceResult, DiceResult fourthDiceResult, DiceResult fifthDiceResult) {
        this.diceResults = Arrays.asList(firstDiceResult, secondDiceResult, thirdDiceResult, fourthDiceResult, fifthDiceResult);
    }

    /**
     * A chance score is the sum of all five dices results
     * @return chance score for given diceResults
     */
    public int chance() {
        return ChanceScore.getInstance().calculateScore(this.diceResults);
    }

    /**
     * A yatzy score gives a fifty score when all five results are the same
     * @return yatzy score for given diceResults
     */
    public int yatzy()
    {
        return YatzyScore.getInstance().calculateScore(this.diceResults);
    }

    /**
     * Ones score is the sum of all dice results equals to one
     * @return ones score for given diceResults
     */
    public int ones() {
        return OnesScore.getInstance().calculateScore(this.diceResults);
    }

    /**
     * Twos score is the sum of all dice results equals to two
     * @return twos score for given diceResults
     */
    public int twos() {
        return TwosScore.getInstance().calculateScore(this.diceResults);
    }

    /**
     * Threes score is the sum of all dice results equals to three
     * @return threes score for given diceResults
     */
    public int threes() {
        return ThreesScore.getInstance().calculateScore(this.diceResults);
    }

    /**
     * Fours score is the sum of all dice results equals to four
     * @return fours score for given diceResults
     */
    public int fours()
    {
        return FoursScore.getInstance().calculateScore(this.diceResults);
    }

    /**
     * Fives score is the sum of all dice results equals to five
     * @return fives score for given diceResults
     */
    public int fives()
    {
        return FivesScore.getInstance().calculateScore(this.diceResults);
    }

    /**
     * Sixes score is the sum of all dice results equals to six
     * @return sixes score for given diceResults
     */
    public int sixes()
    {
        return SixesScore.getInstance().calculateScore(this.diceResults);
    }

    /**
     * A pair score is the double of the dice face in pair.
     * diceResults contains a pair when two or more diceResults are equals
     * @return pair score for given diceResults
     */
    public int pair()
    {
        return PairScore.getInstance().calculateScore(this.diceResults);
    }

    /**
     * Two pair score is the sum of the double of the dice face in pairs.
     * diceResults contains two pairs when it contains two identical faces result twice
     * @return twoPairs score for given diceResults
     */
    public int twoPairs()
    {
        return TwoPairsScore.getInstance().calculateScore(this.diceResults);
    }


    /**
     * A threeOfAkind gives a score of the three times spotted dice face times three.
     * diceResults contains a threeOfAKind when three or more diceResults are equals
     * @return threeOfAkind score for given diceResults
     */
    public int threeOfAKind()
    {
        return ThreeOfAKindScore.getInstance().calculateScore(this.diceResults);
    }

    /**
     * A fourOfAKind gives a score of the four times spotted dice face times four.
     * diceResults contains a fourOfAKind when four or more diceResults are equals
     * @return fourOfAKind score for given diceResults
     */
    public  int fourOfAKind()
    {
        return FourOfAKindScore.getInstance().calculateScore(this.diceResults);
    }

    /**
     * A smallStraight gives a score of fifteen if the diceResults contains in any order one, two, three, four and five
     * @return smallStraight score for given diceResults
     */
    public int smallStraight()
    {
        return SmallStraightScore.getInstance().calculateScore(this.diceResults);
    }

    /**
     * A largeStraight gives a score of twenty if the diceResults contains in any order two, three, four, five and six
     * @return largeStraight score for given diceResults
     */
    public int largeStraight()
    {
        return LargeStraightScore.getInstance().calculateScore(this.diceResults);
    }

    /**
     * A fullHouse happens when a pair and a thirdOfAKind can be made with the diceResults
     * The score is the sum of the pair and the thirdOfAKind
     * @return fullHouse score for given diceResults
     */
    public int fullHouse()
    {
        return FullHouseScore.getInstance().calculateScore(this.diceResults);
    }
}



