package score.face;

import dice.DiceResult;
import dice.exceptions.UnconsistentDiceResult;
import org.junit.Test;
import score.AbstractScoreTest;
import utils.DiceResultDataSet;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class OnesScoreTest extends AbstractScoreTest {
    /**
     * Given 1, 2, 3, 4, 5 dices results
     * When calculating ones result
     * Then return 1
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenOneTwoThreeFourFiveDicesResults_whenCalculateOnesScore_ThenReturnOne() throws UnconsistentDiceResult {
        List<DiceResult> diceResults = this.initializeDicesResults(
            DiceResultDataSet.one(),
            DiceResultDataSet.two(),
            DiceResultDataSet.three(),
            DiceResultDataSet.four(),
            DiceResultDataSet.five()
        );

        assertEquals(1, OnesScore.getInstance().calculateScore(diceResults));
    }

    /**
     * Given 1, 2, 1, 4, 5 dices results
     * When calculating ones result
     * Then return 2
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenOneTwoOneFourFiveDicesResults_whenCalculateOnesScore_ThenReturnTwo() throws UnconsistentDiceResult {
        List<DiceResult> diceResults = this.initializeDicesResults(
            DiceResultDataSet.one(),
            DiceResultDataSet.two(),
            DiceResultDataSet.one(),
            DiceResultDataSet.four(),
            DiceResultDataSet.five()
        );

        assertEquals(2, OnesScore.getInstance().calculateScore(diceResults));
    }

    /**
     * Given 6, 2, 2, 4, 5 dices results
     * When calculating ones result
     * Then return 0
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenSixTwoTwoFourFiveDicesResults_whenCalculateOnesScore_ThenReturnZero() throws UnconsistentDiceResult {
        List<DiceResult> diceResults = this.initializeDicesResults(
            DiceResultDataSet.six(),
            DiceResultDataSet.two(),
            DiceResultDataSet.two(),
            DiceResultDataSet.four(),
            DiceResultDataSet.five()
        );

        assertEquals(0, OnesScore.getInstance().calculateScore(diceResults));
    }

    /**
     * Given 1, 2, 1, 1, 1 dices results
     * When calculating ones result
     * Then return 4
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenOneTwoOneOneOneDicesResults_whenCalculateOnesScore_ThenReturnFour() throws UnconsistentDiceResult {
        List<DiceResult> diceResults = this.initializeDicesResults(
            DiceResultDataSet.one(),
            DiceResultDataSet.two(),
            DiceResultDataSet.one(),
            DiceResultDataSet.one(),
            DiceResultDataSet.one()
        );

        assertEquals(4, OnesScore.getInstance().calculateScore(diceResults));
    }
}
