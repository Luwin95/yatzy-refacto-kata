package score.face;

import dice.DiceResult;
import dice.exceptions.UnconsistentDiceResult;
import org.junit.Test;
import score.AbstractScoreTest;
import utils.DiceResultDataSet;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ThreesScoreTest extends AbstractScoreTest {
    /**
     * Given 1, 2, 3, 2, 3 dices results
     * When calculating threes result
     * Then return 6
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenOneTwoThreeTwoThreeDicesResults_whenCalculateThreesScore_ThenReturnSix() throws UnconsistentDiceResult {
        List<DiceResult> diceResults = this.initializeDicesResults(
            DiceResultDataSet.one(),
            DiceResultDataSet.two(),
            DiceResultDataSet.three(),
            DiceResultDataSet.two(),
            DiceResultDataSet.three()
        );

        assertEquals(6, ThreesScore.getInstance().calculateScore(diceResults));
    }

    /**
     * Given 2, 3, 3, 3, 3 dices results
     * When calculating threes result
     * Then return 12
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenTwoThreeThreeThreeThreeDicesResults_whenCalculateThreesScore_ThenReturnTwelve() throws UnconsistentDiceResult {
        List<DiceResult> diceResults = this.initializeDicesResults(
            DiceResultDataSet.two(),
            DiceResultDataSet.three(),
            DiceResultDataSet.three(),
            DiceResultDataSet.three(),
            DiceResultDataSet.three()
        );

        assertEquals(12, ThreesScore.getInstance().calculateScore(diceResults));
    }
}
