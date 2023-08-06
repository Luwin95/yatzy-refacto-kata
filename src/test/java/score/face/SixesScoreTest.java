package score.face;

import dice.DiceResult;
import dice.exceptions.UnconsistentDiceResult;
import org.junit.Test;
import score.AbstractScoreTest;
import utils.DiceResultDataSet;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SixesScoreTest extends AbstractScoreTest {
    /**
     * Given 4, 4, 4, 5, 5 dices results
     * When calculating sixes result
     * Then return 0
     *
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenFourFourFourFiveFiveDicesResults_whenCalculateSixesScore_ThenReturnZero() throws UnconsistentDiceResult {
        List<DiceResult> diceResults = this.initializeDicesResults(
            DiceResultDataSet.one(),
            DiceResultDataSet.two(),
            DiceResultDataSet.one(),
            DiceResultDataSet.one(),
            DiceResultDataSet.one()
        );

        assertEquals(0, SixesScore.getInstance().calculateScore(diceResults));
    }

    /**
     * Given 4, 4, 6, 5, 5 dices results
     * When calculating sixes result
     * Then return 6
     *
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenFourFourSixFiveFiveDicesResults_whenCalculateSixesScore_ThenReturnSixes() throws UnconsistentDiceResult {
        List<DiceResult> diceResults = this.initializeDicesResults(
            DiceResultDataSet.four(),
            DiceResultDataSet.four(),
            DiceResultDataSet.six(),
            DiceResultDataSet.five(),
            DiceResultDataSet.five()
        );

        assertEquals(6, SixesScore.getInstance().calculateScore(diceResults));
    }

    /**
     * Given 6, 5, 6, 6, 5 dices results
     * When calculating sixes result
     * Then return 18
     *
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenSixFiveSixSixFiveDicesResults_whenCalculateSixesScore_ThenReturnEighteen() throws UnconsistentDiceResult {
        List<DiceResult> diceResults = this.initializeDicesResults(
            DiceResultDataSet.six(),
            DiceResultDataSet.five(),
            DiceResultDataSet.six(),
            DiceResultDataSet.six(),
            DiceResultDataSet.five()
        );
        assertEquals(18, SixesScore.getInstance().calculateScore(diceResults));
    }
}
