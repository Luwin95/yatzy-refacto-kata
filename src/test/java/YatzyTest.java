import dice.exceptions.UnconsistentDiceResult;
import org.junit.*;
import utils.DiceResultDataSet;

import static org.junit.Assert.*;

public class YatzyTest {

    // Chance Score

    /**
     * Given 2, 3, 4, 5, 1 dices results
     * When calculating chance result
     * Then return 15
     * @throws UnconsistentDiceResult thrown id the created dice result is not between 1 and
     */
    @Test
    public void givenTwoThreeFourFiveAndOneDicesResults_whenChance_ThenReturnFifteen() throws UnconsistentDiceResult {
        assertEquals(
            15,
            Yatzy.chance(
                DiceResultDataSet.two(),
                DiceResultDataSet.three(),
                DiceResultDataSet.four(),
                DiceResultDataSet.five(),
                DiceResultDataSet.one()
            )
        );
    }

    // Yatzy Score

    /**
     * Given 3, 3, 4, 5, 1 dices results
     * When calculating chance result
     * Then return 16
     * @throws UnconsistentDiceResult thrown id the created dice result is not between 1 and
     */
    @Test
    public void givenThreeThreeFourFiveAndOneDicesResults_whenChance_ThenReturnSixteen() throws UnconsistentDiceResult {
        assertEquals(
            16,
            Yatzy.chance(
                DiceResultDataSet.three(),
                DiceResultDataSet.three(),
                DiceResultDataSet.four(),
                DiceResultDataSet.five(),
                DiceResultDataSet.one()
            )
        );
    }

    /**
     * Given 4, 4, 4, 4, 4 dices results
     * When calculating yatzy result
     * Then return 50
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenOnlyFoursDicesResults_whenYatzy_ThenReturnFifty() throws UnconsistentDiceResult {
        assertEquals(
            50,
            Yatzy.yatzy(
                DiceResultDataSet.four(),
                DiceResultDataSet.four(),
                DiceResultDataSet.four(),
                DiceResultDataSet.four(),
                DiceResultDataSet.four()
            )
        );
    }

    /**
     * Given 6, 6, 6, 6, 6 dices results
     * When calculating yatzy result
     * Then return 50
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenOnlySixesDicesResults_whenYatzy_ThenReturnFifty() throws UnconsistentDiceResult {
        assertEquals(
            50,
            Yatzy.yatzy(
                DiceResultDataSet.six(),
                DiceResultDataSet.six(),
                DiceResultDataSet.six(),
                DiceResultDataSet.six(),
                DiceResultDataSet.six()
            )
        );
    }

    /**
     * Given 6, 6, 6, 6, 3 dices results
     * When calculating yatzy result
     * Then return 0
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenFourSixesAndAThreeDicesResults_whenYatzy_ThenReturnZero() throws UnconsistentDiceResult {
        assertEquals(
            0,
            Yatzy.yatzy(
                DiceResultDataSet.six(),
                DiceResultDataSet.six(),
                DiceResultDataSet.six(),
                DiceResultDataSet.six(),
                DiceResultDataSet.three()
            )
        );
    }

    // Ones Score

    /**
     * Given 1, 2, 3, 4, 5 dices results
     * When calculating ones result
     * Then return 1
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenOneTwoThreeFourFiveDicesResults_whenOnes_ThenReturnOne() throws UnconsistentDiceResult {
        assertEquals(
            1,
            Yatzy.ones(
                DiceResultDataSet.one(),
                DiceResultDataSet.two(),
                DiceResultDataSet.three(),
                DiceResultDataSet.four(),
                DiceResultDataSet.five()
            )
        );
    }

    /**
     * Given 1, 2, 1, 4, 5 dices results
     * When calculating ones result
     * Then return 2
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenOneTwoOneFourFiveDicesResults_whenOnes_ThenReturnTwo() throws UnconsistentDiceResult {
        assertEquals(
            2,
            Yatzy.ones(
                DiceResultDataSet.one(),
                DiceResultDataSet.two(),
                DiceResultDataSet.one(),
                DiceResultDataSet.four(),
                DiceResultDataSet.five()
            )
        );
    }

    /**
     * Given 6, 2, 2, 4, 5 dices results
     * When calculating ones result
     * Then return 0
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenSixTwoTwoFourFiveDicesResults_whenOnes_ThenReturnZero() throws UnconsistentDiceResult {
        assertEquals(
            0,
            Yatzy.ones(
                DiceResultDataSet.six(),
                DiceResultDataSet.two(),
                DiceResultDataSet.two(),
                DiceResultDataSet.four(),
                DiceResultDataSet.five()
            )
        );
    }

    /**
     * Given 1, 2, 1, 1, 1 dices results
     * When calculating ones result
     * Then return 4
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenOneTwoOneOneOneDicesResults_whenOnes_ThenReturnFour() throws UnconsistentDiceResult {
        assertEquals(
            4,
            Yatzy.ones(
                DiceResultDataSet.one(),
                DiceResultDataSet.two(),
                DiceResultDataSet.one(),
                DiceResultDataSet.one(),
                DiceResultDataSet.one()
            )
        );
    }

    // Twos Score

    /**
     * Given 1, 2, 3, 2, 6 dices results
     * When calculating chance result
     * Then return 4
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenOneTwoThreeTwoSixDicesResults_whenTwos_ThenReturnFour() throws UnconsistentDiceResult {
        assertEquals(
            4,
            Yatzy.twos(
                DiceResultDataSet.one(),
                DiceResultDataSet.two(),
                DiceResultDataSet.three(),
                DiceResultDataSet.two(),
                DiceResultDataSet.six()
            )
        );
    }

    /**
     * Given 1, 2, 3, 2, 6 dices results
     * When calculating chance result
     * Then return 4
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenFiveTwosDicesResults_Twos_ThenReturnTen() throws UnconsistentDiceResult {
        assertEquals(
            10,
            Yatzy.twos(
                DiceResultDataSet.two(),
                DiceResultDataSet.two(),
                DiceResultDataSet.two(),
                DiceResultDataSet.two(),
                DiceResultDataSet.two()
            )
        );
    }


    @Test
    public void test_threes() {
        assertEquals(6, Yatzy.threes(1,2,3,2,3));
        assertEquals(12, Yatzy.threes(2,3,3,3,3));
    }

    @Test
    public void fours_test() 
    {
        assertEquals(12, new Yatzy(4,4,4,5,5).fours());
        assertEquals(8, new Yatzy(4,4,5,5,5).fours());
        assertEquals(4, new Yatzy(4,5,5,5,5).fours());
    }

    @Test
    public void fives() {
        assertEquals(10, new Yatzy(4,4,4,5,5).fives());
        assertEquals(15, new Yatzy(4,4,5,5,5).fives());
        assertEquals(20, new Yatzy(4,5,5,5,5).fives());
    }

    @Test
    public void sixes_test() {
        assertEquals(0, new Yatzy(4,4,4,5,5).sixes());
        assertEquals(6, new Yatzy(4,4,6,5,5).sixes());
        assertEquals(18, new Yatzy(6,5,6,6,5).sixes());
    }

    @Test
    public void one_pair() {
        assertEquals(6, Yatzy.score_pair(3,4,3,5,6));
        assertEquals(10, Yatzy.score_pair(5,3,3,3,5));
        assertEquals(12, Yatzy.score_pair(5,3,6,6,5));
    }

    @Test
    public void two_Pair() {
        assertEquals(16, Yatzy.two_pair(3,3,5,4,5));
        assertEquals(16, Yatzy.two_pair(3,3,5,5,5));
    }

    @Test
    public void three_of_a_kind() 
    {
        assertEquals(9, Yatzy.three_of_a_kind(3,3,3,4,5));
        assertEquals(15, Yatzy.three_of_a_kind(5,3,5,4,5));
        assertEquals(9, Yatzy.three_of_a_kind(3,3,3,3,5));
    }

    @Test
    public void four_of_a_knd() {
        assertEquals(12, Yatzy.four_of_a_kind(3,3,3,3,5));
        assertEquals(20, Yatzy.four_of_a_kind(5,5,5,4,5));
        assertEquals(9, Yatzy.three_of_a_kind(3,3,3,3,3));
    }

    @Test
    public void smallStraight() {
        assertEquals(15, Yatzy.smallStraight(1,2,3,4,5));
        assertEquals(15, Yatzy.smallStraight(2,3,4,5,1));
        assertEquals(0, Yatzy.smallStraight(1,2,2,4,5));
    }

    @Test
    public void largeStraight() {
        assertEquals(20, Yatzy.largeStraight(6,2,3,4,5));
        assertEquals(20, Yatzy.largeStraight(2,3,4,5,6));
        assertEquals(0, Yatzy.largeStraight(1,2,2,4,5));
    }

    @Test
    public void fullHouse() {
        assertEquals(18, Yatzy.fullHouse(6,2,2,2,6));
        assertEquals(0, Yatzy.fullHouse(2,3,4,5,6));
    }
}
