package score.face;

import dice.exceptions.UnconsistentDiceResult;
import org.junit.Test;
import utils.DiceResultDataSet;

import static org.junit.Assert.assertEquals;

public class FoursScoreTest {
    /**
     * Given 4, 4, 4, 5, 5 dices results
     * When calculating fours result
     * Then return 12
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenFourFourFourFiveFiveDicesResults_whenCalculateFoursScore_ThenReturnTwelve() throws UnconsistentDiceResult {
        FoursScore actualFoursScore = new FoursScore(
            DiceResultDataSet.four(),
            DiceResultDataSet.four(),
            DiceResultDataSet.four(),
            DiceResultDataSet.five(),
            DiceResultDataSet.five()
        );

        assertEquals(12, actualFoursScore.calculateScore());
    }

    /**
     * Given 4, 4, 5, 5, 5 dices results
     * When calculating fours result
     * Then return 8
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenFourFourFiveFiveFiveDicesResults_whenCalculateFoursScore_ThenReturnEight() throws UnconsistentDiceResult {
        FoursScore actualFoursScore = new FoursScore(
            DiceResultDataSet.four(),
            DiceResultDataSet.four(),
            DiceResultDataSet.five(),
            DiceResultDataSet.five(),
            DiceResultDataSet.five()
        );

        assertEquals(8, actualFoursScore.calculateScore());
    }

    /**
     * Given 4, 5, 5, 5, 5 dices results
     * When calculating fours result
     * Then return 4
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenFourFiveFiveFiveFiveDicesResults_whenCalculateFoursScore_ThenReturnFour() throws UnconsistentDiceResult {
        FoursScore actualFoursScore = new FoursScore(
            DiceResultDataSet.four(),
            DiceResultDataSet.five(),
            DiceResultDataSet.five(),
            DiceResultDataSet.five(),
            DiceResultDataSet.five()
        );

        assertEquals(4, actualFoursScore.calculateScore());
    }
}
