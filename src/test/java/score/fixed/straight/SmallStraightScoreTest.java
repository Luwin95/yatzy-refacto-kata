package score.fixed.straight;

import dice.DiceResult;
import dice.exceptions.UnconsistentDiceResult;
import org.junit.Test;
import score.AbstractScoreTest;
import utils.DiceResultDataSet;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SmallStraightScoreTest extends AbstractScoreTest {
    /**
     * Given 1, 2, 3, 4, 5 dices results
     * When calculating small straight result
     * Then return 15
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenOneTwoThreeFourFiveDicesResults_whenCalculateSmallStraightScore_ThenReturnFifteen() throws UnconsistentDiceResult {
        List<DiceResult> diceResults = this.initializeDicesResults(
            DiceResultDataSet.one(),
            DiceResultDataSet.two(),
            DiceResultDataSet.three(),
            DiceResultDataSet.four(),
            DiceResultDataSet.five()
        );

        assertEquals(15, SmallStraightScore.getInstance().calculateScore(diceResults));
    }

    /**
     * Given 2, 3, 4, 5, 1 dices results
     * When calculating small straight result
     * Then return 15
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenTwoThreeFourFiveOneDicesResults_whenCalculateSmallStraightScore_ThenReturnFifteen() throws UnconsistentDiceResult {
        List<DiceResult> diceResults = this.initializeDicesResults(
            DiceResultDataSet.two(),
            DiceResultDataSet.three(),
            DiceResultDataSet.four(),
            DiceResultDataSet.five(),
            DiceResultDataSet.one()
        );

        assertEquals(15, SmallStraightScore.getInstance().calculateScore(diceResults));
    }

    /**
     * Given 1, 2, 2, 4, 5 dices results
     * When calculating small straight result
     * Then return 0
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenOneTwoTwoFourFiveDicesResults_whenCalculateSmallStraightScore_ThenReturnZero() throws UnconsistentDiceResult {
        List<DiceResult> diceResults = this.initializeDicesResults(
            DiceResultDataSet.one(),
            DiceResultDataSet.two(),
            DiceResultDataSet.two(),
            DiceResultDataSet.four(),
            DiceResultDataSet.five()
        );

        assertEquals(0, SmallStraightScore.getInstance().calculateScore(diceResults));
    }
}
