package score.fixed.straight;

import dice.exceptions.UnconsistentDiceResult;
import org.junit.Test;
import utils.DiceResultDataSet;

import static org.junit.Assert.assertEquals;

public class LargeStraightScoreTest {
    /**
     * Given 6, 2, 3, 4, 5 dices results
     * When calculating large straight result
     * Then return 20
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenSixTwoThreeFourFiveDicesResults_whenCalculateLargeStraightScore_ThenReturnTwenty() throws UnconsistentDiceResult {
        LargeStraightScore largeStraightScore = new LargeStraightScore(
            DiceResultDataSet.six(),
            DiceResultDataSet.two(),
            DiceResultDataSet.three(),
            DiceResultDataSet.four(),
            DiceResultDataSet.five()
        );

        assertEquals(20, largeStraightScore.calculateScore());
    }

    /**
     * Given 2, 3, 4, 5, 6 dices results
     * When calculating large straight result
     * Then return 20
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenTwoThreeFourFiveSixDicesResults_whenCalculateLargeStraightScore_ThenReturnTwenty() throws UnconsistentDiceResult {
        LargeStraightScore largeStraightScore = new LargeStraightScore(
            DiceResultDataSet.two(),
            DiceResultDataSet.three(),
            DiceResultDataSet.four(),
            DiceResultDataSet.five(),
            DiceResultDataSet.six()
        );

        assertEquals(20, largeStraightScore.calculateScore());
    }

    /**
     * Given 1, 2, 2, 4, 5, 6 dices results
     * When calculating large straight result
     * Then return 0
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenOneTwoTwoFourFiveDicesResults_whenCalculateLargeStraightScore_ThenReturnZero() throws UnconsistentDiceResult {
        LargeStraightScore largeStraightScore = new LargeStraightScore(
            DiceResultDataSet.one(),
            DiceResultDataSet.two(),
            DiceResultDataSet.two(),
            DiceResultDataSet.four(),
            DiceResultDataSet.five()
        );

        assertEquals(0, largeStraightScore.calculateScore());
    }
}
