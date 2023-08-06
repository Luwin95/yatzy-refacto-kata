package score.severalOfAKind;

import dice.DiceResult;
import dice.exceptions.UnconsistentDiceResult;
import org.junit.Test;
import score.AbstractScoreTest;
import utils.DiceResultDataSet;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TwoPairsScoreTest extends AbstractScoreTest {
    /**
     * Given 3, 3, 5, 4, 5 dices results
     * When calculating two pair result
     * Then return 16
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenThreeThreeFiveFourFiveDicesResults_whenCalculateTwoPairsScore_ThenReturnSixteen() throws UnconsistentDiceResult {
        List<DiceResult> diceResults = this.initializeDicesResults(
            DiceResultDataSet.three(),
            DiceResultDataSet.three(),
            DiceResultDataSet.five(),
            DiceResultDataSet.four(),
            DiceResultDataSet.five()
        );

        assertEquals(16, TwoPairsScore.getInstance().calculateScore(diceResults));
    }

    /**
     * Given 3, 3, 5, 5, 5 dices results
     * When calculating two pair result
     * Then return 16
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenThreeFiveFiveFourFiveDicesResults_whenCalculateTwoPairsScore_ThenReturnSixteen() throws UnconsistentDiceResult {
        List<DiceResult> diceResults = this.initializeDicesResults(
            DiceResultDataSet.three(),
            DiceResultDataSet.three(),
            DiceResultDataSet.five(),
            DiceResultDataSet.five(),
            DiceResultDataSet.five()
        );

        assertEquals(16, TwoPairsScore.getInstance().calculateScore(diceResults));
    }

}
