package score.severalOfAKind;

import dice.DiceResult;
import dice.exceptions.UnconsistentDiceResult;
import org.junit.Test;
import score.AbstractScoreTest;
import utils.DiceResultDataSet;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PairScoreTest extends AbstractScoreTest {
    /**
     * Given 3, 4, 3, 5, 6 dices results
     * When calculating pair result
     * Then return 6
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenThreeFourThreeFiveSixDicesResults_whenCalculatePairScore_ThenReturnSix() throws UnconsistentDiceResult {
        List<DiceResult> diceResults = this.initializeDicesResults(
            DiceResultDataSet.three(),
            DiceResultDataSet.four(),
            DiceResultDataSet.three(),
            DiceResultDataSet.five(),
            DiceResultDataSet.six()
        );

        assertEquals(6, PairScore.getInstance().calculateScore(diceResults));
    }

    /**
     * Given 5, 3, 3, 3, 5 dices results
     * When calculating pair result
     * Then return 10
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenFiveThreeThreeThreeFiveDicesResults_whenCalculatePairScore_ThenReturnTen() throws UnconsistentDiceResult {
        List<DiceResult> diceResults = this.initializeDicesResults(
            DiceResultDataSet.five(),
            DiceResultDataSet.three(),
            DiceResultDataSet.three(),
            DiceResultDataSet.three(),
            DiceResultDataSet.five()
        );

        assertEquals(10, PairScore.getInstance().calculateScore(diceResults));
    }

    /**
     * Given 5, 3, 6, 6, 5 dices results
     * When calculating pair result
     * Then return 12
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenFiveThreeSixSixFiveDicesResults_whenCalculatePairScore_ThenReturnTwelve() throws UnconsistentDiceResult {
        List<DiceResult> diceResults = this.initializeDicesResults(
            DiceResultDataSet.five(),
            DiceResultDataSet.three(),
            DiceResultDataSet.six(),
            DiceResultDataSet.six(),
            DiceResultDataSet.five()
        );

        assertEquals(12, PairScore.getInstance().calculateScore(diceResults));
    }
}
