package score.fixed;

import dice.DiceResult;
import dice.exceptions.UnconsistentDiceResult;
import org.junit.Test;
import score.AbstractScoreTest;
import score.fixed.YatzyScore;
import utils.DiceResultDataSet;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class YatzyScoreTest extends AbstractScoreTest {

    /**
     * Given 4, 4, 4, 4, 4 dices results
     * When calculating yatzy result
     * Then return 50
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenOnlyFoursDicesResults_whenCalculateYatzyScore_ThenReturnFifty() throws UnconsistentDiceResult {
        List<DiceResult> diceResults = this.initializeDicesResults(
            DiceResultDataSet.four(),
            DiceResultDataSet.four(),
            DiceResultDataSet.four(),
            DiceResultDataSet.four(),
            DiceResultDataSet.four()
        );

        assertEquals(50, YatzyScore.getInstance().calculateScore(diceResults));
    }

    /**
     * Given 6, 6, 6, 6, 6 dices results
     * When calculating yatzy result
     * Then return 50
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenOnlySixesDicesResults_whenCalculateYatzyScore_ThenReturnFifty() throws UnconsistentDiceResult {
        List<DiceResult> diceResults = this.initializeDicesResults(
            DiceResultDataSet.six(),
            DiceResultDataSet.six(),
            DiceResultDataSet.six(),
            DiceResultDataSet.six(),
            DiceResultDataSet.six()
        );

        assertEquals(50, YatzyScore.getInstance().calculateScore(diceResults));
    }

    /**
     * Given 6, 6, 6, 6, 3 dices results
     * When calculating yatzy result
     * Then return 0
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenFourSixesAndAThreeDicesResults_whenCalculateYatzyScore_ThenReturnZero() throws UnconsistentDiceResult {
        List<DiceResult> diceResults = this.initializeDicesResults(
            DiceResultDataSet.six(),
            DiceResultDataSet.six(),
            DiceResultDataSet.six(),
            DiceResultDataSet.six(),
            DiceResultDataSet.three()
        );

        assertEquals(0, YatzyScore.getInstance().calculateScore(diceResults));
    }
}
