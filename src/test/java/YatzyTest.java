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

    // Threes Score

    /**
     * Given 1, 2, 3, 2, 3 dices results
     * When calculating chance result
     * Then return 6
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenOneTwoThreeTwoThreeDicesResults_whenThrees_ThenReturnSix() throws UnconsistentDiceResult {
        assertEquals(
            6,
            Yatzy.threes(
                DiceResultDataSet.one(),
                DiceResultDataSet.two(),
                DiceResultDataSet.three(),
                DiceResultDataSet.two(),
                DiceResultDataSet.three()
            )
        );
    }

    /**
     * Given 2, 3, 3, 3, 3 dices results
     * When calculating chance result
     * Then return 12
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenTwoThreeThreeThreeThreeDicesResults_whenThrees_ThenReturnTwelve() throws UnconsistentDiceResult {
        assertEquals(
            12,
            Yatzy.threes(
                DiceResultDataSet.two(),
                DiceResultDataSet.three(),
                DiceResultDataSet.three(),
                DiceResultDataSet.three(),
                DiceResultDataSet.three()
            )
        );
    }

    // Fours score

    /**
     * Given 4, 4, 4, 5, 5 dices results
     * When calculating fours result
     * Then return 12
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenFourFourFourFiveFiveDicesResults_whenFours_ThenReturnTwelve() throws UnconsistentDiceResult {
        assertEquals(
            12,
            Yatzy.fours(
                DiceResultDataSet.four(),
                DiceResultDataSet.four(),
                DiceResultDataSet.four(),
                DiceResultDataSet.five(),
                DiceResultDataSet.five()
            )
        );

    }

    /**
     * Given 4, 4, 5, 5, 5 dices results
     * When calculating fours result
     * Then return 8
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenFourFourFiveFiveFiveDicesResults_whenFours_ThenReturnEight() throws UnconsistentDiceResult {
        assertEquals(
            8,
            Yatzy.fours(
                DiceResultDataSet.four(),
                DiceResultDataSet.four(),
                DiceResultDataSet.five(),
                DiceResultDataSet.five(),
                DiceResultDataSet.five()
            )
        );
    }

    /**
     * Given 4, 5, 5, 5, 5 dices results
     * When calculating fours result
     * Then return 4
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenFourFiveFiveFiveFiveDicesResults_whenFours_ThenReturnFour() throws UnconsistentDiceResult {
        assertEquals(
            4,
            Yatzy.fours(
                DiceResultDataSet.four(),
                DiceResultDataSet.five(),
                DiceResultDataSet.five(),
                DiceResultDataSet.five(),
                DiceResultDataSet.five()
            )
        );
    }

    // Fives score

    /**
     * Given 4, 4, 4, 5, 5 dices results
     * When calculating fives result
     * Then return 10
     *
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenFourFourFourFiveFiveDicesResults_whenFives_ThenReturnTen() throws UnconsistentDiceResult {
        assertEquals(
            10,
            Yatzy.fives(
                DiceResultDataSet.four(),
                DiceResultDataSet.four(),
                DiceResultDataSet.four(),
                DiceResultDataSet.five(),
                DiceResultDataSet.five()
            )
        );
    }

    /**
     * Given 4, 4, 5, 5, 5 dices results
     * When calculating fives result
     * Then return 15
     *
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenFourFourFiveFiveFiveDicesResults_whenFives_ThenReturnFifteen() throws UnconsistentDiceResult {
        assertEquals(
            15,
            Yatzy.fives(
                DiceResultDataSet.four(),
                DiceResultDataSet.four(),
                DiceResultDataSet.five(),
                DiceResultDataSet.five(),
                DiceResultDataSet.five()
            )
        );
    }

    /**
     * Given 4, 5, 5, 5, 5 dices results
     * When calculating fives result
     * Then return 20
     *
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenFourFiveFiveFiveFiveDicesResults_whenFives_ThenReturnTwenty() throws UnconsistentDiceResult {
        assertEquals(
            20,
            Yatzy.fives(
                DiceResultDataSet.four(),
                DiceResultDataSet.five(),
                DiceResultDataSet.five(),
                DiceResultDataSet.five(),
                DiceResultDataSet.five()
            )
        );
    }

    // Sixes score

    /**
     * Given 4, 4, 4, 5, 5 dices results
     * When calculating sixes result
     * Then return 0
     *
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenFourFourFourFiveFiveDicesResults_whenSixes_ThenReturnZero() throws UnconsistentDiceResult {
        assertEquals(
            0,
            Yatzy.sixes(
                DiceResultDataSet.four(),
                DiceResultDataSet.four(),
                DiceResultDataSet.four(),
                DiceResultDataSet.five(),
                DiceResultDataSet.five()
            )
        );
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
        assertEquals(
            6,
            Yatzy.sixes(
                DiceResultDataSet.four(),
                DiceResultDataSet.four(),
                DiceResultDataSet.six(),
                DiceResultDataSet.five(),
                DiceResultDataSet.five()
            )
        );
    }

    /**
     * Given 6, 5, 6, 6, 5 dices results
     * When calculating sixes result
     * Then return 18
     *
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenSixFiveSixSixFiveDicesResults_whenSixes_ThenReturnEighteen() throws UnconsistentDiceResult {
        assertEquals(
            18,
            Yatzy.sixes(
                DiceResultDataSet.six(),
                DiceResultDataSet.five(),
                DiceResultDataSet.six(),
                DiceResultDataSet.six(),
                DiceResultDataSet.five()
            )
        );

    }

    // Pair score

    /**
     * Given 3, 4, 3, 5, 6 dices results
     * When calculating pair result
     * Then return 6
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenThreeFourThreeFiveSixDicesResults_whenPair_ThenReturnSix() throws UnconsistentDiceResult {
        assertEquals(
            6,
            Yatzy.pair(
                DiceResultDataSet.three(),
                DiceResultDataSet.four(),
                DiceResultDataSet.three(),
                DiceResultDataSet.five(),
                DiceResultDataSet.six()
            )
        );

    }

    /**
     * Given 5, 3, 3, 3, 5 dices results
     * When calculating pair result
     * Then return 10
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenFiveThreeThreeThreeFiveDicesResults_whenPair_ThenReturnTen() throws UnconsistentDiceResult {
        assertEquals(
            10,
            Yatzy.pair(
                DiceResultDataSet.five(),
                DiceResultDataSet.three(),
                DiceResultDataSet.three(),
                DiceResultDataSet.three(),
                DiceResultDataSet.five()
            )
        );
    }

    /**
     * Given 5, 3, 6, 6, 5 dices results
     * When calculating pair result
     * Then return 12
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenFiveThreeSixSixFiveDicesResults_whenPair_ThenReturnTwelve() throws UnconsistentDiceResult {
        assertEquals(
            12,
            Yatzy.pair(
                DiceResultDataSet.five(),
                DiceResultDataSet.three(),
                DiceResultDataSet.six(),
                DiceResultDataSet.six(),
                DiceResultDataSet.five()
            )
        );
    }

    // Two pairs score

    /**
     * Given 3, 3, 5, 4, 5 dices results
     * When calculating two pair result
     * Then return 16
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenThreeThreeFiveFourFiveDicesResults_whenTwoPairs_ThenReturnSixteen() throws UnconsistentDiceResult {
        assertEquals(
            16,
            Yatzy.twoPairs(
                DiceResultDataSet.three(),
                DiceResultDataSet.three(),
                DiceResultDataSet.five(),
                DiceResultDataSet.four(),
                DiceResultDataSet.five()
            )
        );
    }

    /**
     * Given 3, 3, 5, 5, 5 dices results
     * When calculating two pair result
     * Then return 16
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenThreeFiveFiveFourFiveDicesResults_whenTwoPairs_ThenReturnSixteen() throws UnconsistentDiceResult {
        assertEquals(
            16,
            Yatzy.twoPairs(
                DiceResultDataSet.three(),
                DiceResultDataSet.three(),
                DiceResultDataSet.five(),
                DiceResultDataSet.five(),
                DiceResultDataSet.five()
            )
        );
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
