package score.severalOfAKind;

import dice.exceptions.UnconsistentDiceResult;
import org.junit.Test;
import utils.DiceResultDataSet;

import static org.junit.Assert.assertEquals;

public class PairScoreTest {
    /**
     * Given 3, 4, 3, 5, 6 dices results
     * When calculating pair result
     * Then return 6
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenThreeFourThreeFiveSixDicesResults_whenCalculatePairScore_ThenReturnSix() throws UnconsistentDiceResult {
        PairScore actualPairScore = new PairScore(
            DiceResultDataSet.three(),
            DiceResultDataSet.four(),
            DiceResultDataSet.three(),
            DiceResultDataSet.five(),
            DiceResultDataSet.six()
        );
        assertEquals(6, actualPairScore.calculateScore());
    }

    /**
     * Given 5, 3, 3, 3, 5 dices results
     * When calculating pair result
     * Then return 10
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenFiveThreeThreeThreeFiveDicesResults_whenCalculatePairScore_ThenReturnTen() throws UnconsistentDiceResult {
        PairScore actualPairScore = new PairScore(
            DiceResultDataSet.five(),
            DiceResultDataSet.three(),
            DiceResultDataSet.three(),
            DiceResultDataSet.three(),
            DiceResultDataSet.five()
        );
        assertEquals(10, actualPairScore.calculateScore());
    }

    /**
     * Given 5, 3, 6, 6, 5 dices results
     * When calculating pair result
     * Then return 12
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenFiveThreeSixSixFiveDicesResults_whenCalculatePairScore_ThenReturnTwelve() throws UnconsistentDiceResult {
        PairScore actualPairScore = new PairScore(
            DiceResultDataSet.five(),
            DiceResultDataSet.three(),
            DiceResultDataSet.six(),
            DiceResultDataSet.six(),
            DiceResultDataSet.five()
        );
        assertEquals(12, actualPairScore.calculateScore());
    }
}
