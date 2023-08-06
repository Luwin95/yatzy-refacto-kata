package score.face;

import dice.DiceResult;
import dice.exceptions.UnconsistentDiceResult;
import org.junit.Test;
import score.AbstractScoreTest;
import utils.DiceResultDataSet;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TwosScoreTest extends AbstractScoreTest {
    /**
     * Given 1, 2, 3, 2, 6 dices results
     * When calculating twos result
     * Then return 4
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenOneTwoThreeTwoSixDicesResults_whenCalculateTwosScore_ThenReturnFour() throws UnconsistentDiceResult {
        List<DiceResult> diceResults = this.initializeDicesResults(
            DiceResultDataSet.one(),
            DiceResultDataSet.two(),
            DiceResultDataSet.three(),
            DiceResultDataSet.two(),
            DiceResultDataSet.six()
        );

        assertEquals(4, TwosScore.getInstance().calculateScore(diceResults));
    }

    /**
     * Given 2, 2, 2, 2, 2 dices results
     * When calculating twos result
     * Then return 10
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenFiveTwosDicesResults_whenCalculateTwosScore_ThenReturnTen() throws UnconsistentDiceResult {
        List<DiceResult> diceResults = this.initializeDicesResults(
            DiceResultDataSet.two(),
            DiceResultDataSet.two(),
            DiceResultDataSet.two(),
            DiceResultDataSet.two(),
            DiceResultDataSet.two()
        );

        assertEquals(10, TwosScore.getInstance().calculateScore(diceResults));
    }
}
