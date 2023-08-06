package score.face;

import dice.DiceResult;
import dice.exceptions.UnconsistentDiceResult;
import org.junit.Test;
import score.AbstractScoreTest;
import utils.DiceResultDataSet;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FoursScoreTest extends AbstractScoreTest {
    /**
     * Given 4, 4, 4, 5, 5 dices results
     * When calculating fours result
     * Then return 12
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenFourFourFourFiveFiveDicesResults_whenCalculateFoursScore_ThenReturnTwelve() throws UnconsistentDiceResult {
        List<DiceResult> diceResults = this.initializeDicesResults(
            DiceResultDataSet.four(),
            DiceResultDataSet.four(),
            DiceResultDataSet.four(),
            DiceResultDataSet.five(),
            DiceResultDataSet.five()
        );


        assertEquals(12, FoursScore.getInstance().calculateScore(diceResults));
    }

    /**
     * Given 4, 4, 5, 5, 5 dices results
     * When calculating fours result
     * Then return 8
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenFourFourFiveFiveFiveDicesResults_whenCalculateFoursScore_ThenReturnEight() throws UnconsistentDiceResult {
        List<DiceResult> diceResults = this.initializeDicesResults(
            DiceResultDataSet.four(),
            DiceResultDataSet.four(),
            DiceResultDataSet.five(),
            DiceResultDataSet.five(),
            DiceResultDataSet.five()
        );

        assertEquals(8, FoursScore.getInstance().calculateScore(diceResults));
    }

    /**
     * Given 4, 5, 5, 5, 5 dices results
     * When calculating fours result
     * Then return 4
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenFourFiveFiveFiveFiveDicesResults_whenCalculateFoursScore_ThenReturnFour() throws UnconsistentDiceResult {
        List<DiceResult> diceResults = this.initializeDicesResults(
            DiceResultDataSet.four(),
            DiceResultDataSet.five(),
            DiceResultDataSet.five(),
            DiceResultDataSet.five(),
            DiceResultDataSet.five()
        );

        assertEquals(4, FoursScore.getInstance().calculateScore(diceResults));
    }
}
