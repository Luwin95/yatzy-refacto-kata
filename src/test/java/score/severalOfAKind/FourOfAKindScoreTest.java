package score.severalOfAKind;

import dice.DiceResult;
import dice.exceptions.UnconsistentDiceResult;
import org.junit.Test;
import score.AbstractScoreTest;
import utils.DiceResultDataSet;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FourOfAKindScoreTest extends AbstractScoreTest {
    /**
     * Given 3, 3, 3, 3, 5 dices results
     * When calculating four of a kind result
     * Then return 12
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenThreeThreeThreeThreeFiveDicesResults_whenCalculateFourOfAKindScore_ThenReturnTwelve() throws UnconsistentDiceResult {
        List<DiceResult> diceResults = this.initializeDicesResults(
            DiceResultDataSet.three(),
            DiceResultDataSet.three(),
            DiceResultDataSet.three(),
            DiceResultDataSet.three(),
            DiceResultDataSet.five()
        );

        assertEquals(12, FourOfAKindScore.getInstance().calculateScore(diceResults));
    }

    /**
     * Given 5, 5, 5, 4, 5 dices results
     * When calculating four of a kind result
     * Then return 20
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenFiveFiveFiveFourFiveDicesResults_whenCalculateFourOfAKindScore_ThenReturnTwenty() throws UnconsistentDiceResult {
        List<DiceResult> diceResults = this.initializeDicesResults(
            DiceResultDataSet.five(),
            DiceResultDataSet.five(),
            DiceResultDataSet.five(),
            DiceResultDataSet.four(),
            DiceResultDataSet.five()
        );

        assertEquals(20, FourOfAKindScore.getInstance().calculateScore(diceResults));
    }

    /**
     * Given 3, 3, 3, 3, 3 dices results
     * When calculating four of a kind result
     * Then return 20
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenOnlyThreesDicesResults_whenCalculateFourOfAKindScore_ThenReturnTwelve() throws UnconsistentDiceResult {
        List<DiceResult> diceResults = this.initializeDicesResults(
            DiceResultDataSet.three(),
            DiceResultDataSet.three(),
            DiceResultDataSet.three(),
            DiceResultDataSet.three(),
            DiceResultDataSet.three()
        );

        assertEquals(12, FourOfAKindScore.getInstance().calculateScore(diceResults));
    }
}
