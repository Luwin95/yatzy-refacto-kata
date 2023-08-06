package score.face;

import dice.DiceResult;
import dice.exceptions.UnconsistentDiceResult;
import org.junit.Test;
import score.AbstractScoreTest;
import utils.DiceResultDataSet;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FivesScoreTest extends AbstractScoreTest {
    /**
     * Given 4, 4, 4, 5, 5 dices results
     * When calculating fives result
     * Then return 10
     *
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenFourFourFourFiveFiveDicesResults_whenCalculateFivesScore_ThenReturnTen() throws UnconsistentDiceResult {
        List<DiceResult> diceResults = this.initializeDicesResults(
            DiceResultDataSet.four(),
            DiceResultDataSet.four(),
            DiceResultDataSet.four(),
            DiceResultDataSet.five(),
            DiceResultDataSet.five()
        );

        assertEquals(10, FivesScore.getInstance().calculateScore(diceResults));
    }

    /**
     * Given 4, 4, 5, 5, 5 dices results
     * When calculating fives result
     * Then return 15
     *
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenFourFourFiveFiveFiveDicesResults_whenCalculateFivesScore_ThenReturnFifteen() throws UnconsistentDiceResult {
        List<DiceResult> diceResults = this.initializeDicesResults(
            DiceResultDataSet.four(),
            DiceResultDataSet.four(),
            DiceResultDataSet.five(),
            DiceResultDataSet.five(),
            DiceResultDataSet.five()
        );

        assertEquals(15, FivesScore.getInstance().calculateScore(diceResults));
    }

    /**
     * Given 4, 5, 5, 5, 5 dices results
     * When calculating fives result
     * Then return 20
     *
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenFourFiveFiveFiveFiveDicesResults_whenCalculateFivesScore_ThenReturnTwenty() throws UnconsistentDiceResult {
        List<DiceResult> diceResults = this.initializeDicesResults(
            DiceResultDataSet.four(),
            DiceResultDataSet.five(),
            DiceResultDataSet.five(),
            DiceResultDataSet.five(),
            DiceResultDataSet.five()
        );

        assertEquals(20, FivesScore.getInstance().calculateScore(diceResults));
    }
}
