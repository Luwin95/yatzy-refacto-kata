package score.face;

import dice.exceptions.UnconsistentDiceResult;
import org.junit.Test;
import utils.DiceResultDataSet;

import static org.junit.Assert.assertEquals;

public class TwosScoreTest {
    /**
     * Given 1, 2, 3, 2, 6 dices results
     * When calculating twos result
     * Then return 4
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenOneTwoThreeTwoSixDicesResults_whenCalculateTwosScore_ThenReturnFour() throws UnconsistentDiceResult {
        TwosScore actualTwosScore = new TwosScore(
            DiceResultDataSet.one(),
            DiceResultDataSet.two(),
            DiceResultDataSet.three(),
            DiceResultDataSet.two(),
            DiceResultDataSet.six()
        );

        assertEquals(4, actualTwosScore.calculateScore());
    }

    /**
     * Given 1, 2, 3, 2, 6 dices results
     * When calculating twos result
     * Then return 10
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenFiveTwosDicesResults_whenCalculateTwosScore_ThenReturnTen() throws UnconsistentDiceResult {
        TwosScore actualTwosScore = new TwosScore(
            DiceResultDataSet.two(),
            DiceResultDataSet.two(),
            DiceResultDataSet.two(),
            DiceResultDataSet.two(),
            DiceResultDataSet.two()
        );

        assertEquals(10, actualTwosScore.calculateScore());
    }
}
