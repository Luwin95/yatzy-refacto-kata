import dice.DiceResult;
import dice.exceptions.UnconsistentDiceResult;
import org.junit.*;
import utils.DiceResultDataSet;

import static org.junit.Assert.*;

public class YatzyGameTest {
    
    private YatzyGame initializeYatzyGame(DiceResult firstDiceResult, DiceResult secondDiceResult, DiceResult thirdDiceResult, DiceResult fourthDiceResult, DiceResult fifthDiceResult){
        return new YatzyGame(firstDiceResult, secondDiceResult, thirdDiceResult, fourthDiceResult, fifthDiceResult);
    }

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
            this.initializeYatzyGame(
                DiceResultDataSet.two(),
                DiceResultDataSet.three(),
                DiceResultDataSet.four(),
                DiceResultDataSet.five(),
                DiceResultDataSet.one()
            ).chance()
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
            this.initializeYatzyGame(
                DiceResultDataSet.three(),
                DiceResultDataSet.three(),
                DiceResultDataSet.four(),
                DiceResultDataSet.five(),
                DiceResultDataSet.one()
            ).chance()
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
            this.initializeYatzyGame(
                DiceResultDataSet.four(),
                DiceResultDataSet.four(),
                DiceResultDataSet.four(),
                DiceResultDataSet.four(),
                DiceResultDataSet.four()
            ).yatzy()
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
            this.initializeYatzyGame(
                DiceResultDataSet.six(),
                DiceResultDataSet.six(),
                DiceResultDataSet.six(),
                DiceResultDataSet.six(),
                DiceResultDataSet.six()
            ).yatzy()
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
            this.initializeYatzyGame(
                DiceResultDataSet.six(),
                DiceResultDataSet.six(),
                DiceResultDataSet.six(),
                DiceResultDataSet.six(),
                DiceResultDataSet.three()
            ).yatzy()
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
            this.initializeYatzyGame(
                DiceResultDataSet.one(),
                DiceResultDataSet.two(),
                DiceResultDataSet.three(),
                DiceResultDataSet.four(),
                DiceResultDataSet.five()
            ).ones()
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
            this.initializeYatzyGame(
                DiceResultDataSet.one(),
                DiceResultDataSet.two(),
                DiceResultDataSet.one(),
                DiceResultDataSet.four(),
                DiceResultDataSet.five()
            ).ones()
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
            this.initializeYatzyGame(
                DiceResultDataSet.six(),
                DiceResultDataSet.two(),
                DiceResultDataSet.two(),
                DiceResultDataSet.four(),
                DiceResultDataSet.five()
            ).ones()
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
            this.initializeYatzyGame(
                DiceResultDataSet.one(),
                DiceResultDataSet.two(),
                DiceResultDataSet.one(),
                DiceResultDataSet.one(),
                DiceResultDataSet.one()
            ).ones()
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
            this.initializeYatzyGame(
                DiceResultDataSet.one(),
                DiceResultDataSet.two(),
                DiceResultDataSet.three(),
                DiceResultDataSet.two(),
                DiceResultDataSet.six()
            ).twos()
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
            this.initializeYatzyGame(
                DiceResultDataSet.two(),
                DiceResultDataSet.two(),
                DiceResultDataSet.two(),
                DiceResultDataSet.two(),
                DiceResultDataSet.two()
            ).twos()
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
            this.initializeYatzyGame(
                DiceResultDataSet.one(),
                DiceResultDataSet.two(),
                DiceResultDataSet.three(),
                DiceResultDataSet.two(),
                DiceResultDataSet.three()
            ).threes()
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
            this.initializeYatzyGame(
                DiceResultDataSet.two(),
                DiceResultDataSet.three(),
                DiceResultDataSet.three(),
                DiceResultDataSet.three(),
                DiceResultDataSet.three()
            ).threes()
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
            this.initializeYatzyGame(
                DiceResultDataSet.four(),
                DiceResultDataSet.four(),
                DiceResultDataSet.four(),
                DiceResultDataSet.five(),
                DiceResultDataSet.five()
            ).fours()
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
            this.initializeYatzyGame(
                DiceResultDataSet.four(),
                DiceResultDataSet.four(),
                DiceResultDataSet.five(),
                DiceResultDataSet.five(),
                DiceResultDataSet.five()
            ).fours()
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
            this.initializeYatzyGame(
                DiceResultDataSet.four(),
                DiceResultDataSet.five(),
                DiceResultDataSet.five(),
                DiceResultDataSet.five(),
                DiceResultDataSet.five()
            ).fours()
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
            this.initializeYatzyGame(
                DiceResultDataSet.four(),
                DiceResultDataSet.four(),
                DiceResultDataSet.four(),
                DiceResultDataSet.five(),
                DiceResultDataSet.five()
            ).fives()
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
            this.initializeYatzyGame(
                DiceResultDataSet.four(),
                DiceResultDataSet.four(),
                DiceResultDataSet.five(),
                DiceResultDataSet.five(),
                DiceResultDataSet.five()
            ).fives()
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
            this.initializeYatzyGame(
                DiceResultDataSet.four(),
                DiceResultDataSet.five(),
                DiceResultDataSet.five(),
                DiceResultDataSet.five(),
                DiceResultDataSet.five()
            ).fives()
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
            this.initializeYatzyGame(
                DiceResultDataSet.four(),
                DiceResultDataSet.four(),
                DiceResultDataSet.four(),
                DiceResultDataSet.five(),
                DiceResultDataSet.five()
            ).sixes()
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
            this.initializeYatzyGame(
                DiceResultDataSet.four(),
                DiceResultDataSet.four(),
                DiceResultDataSet.six(),
                DiceResultDataSet.five(),
                DiceResultDataSet.five()
            ).sixes()
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
            this.initializeYatzyGame(
                DiceResultDataSet.six(),
                DiceResultDataSet.five(),
                DiceResultDataSet.six(),
                DiceResultDataSet.six(),
                DiceResultDataSet.five()
            ).sixes()
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
            this.initializeYatzyGame(
                DiceResultDataSet.three(),
                DiceResultDataSet.four(),
                DiceResultDataSet.three(),
                DiceResultDataSet.five(),
                DiceResultDataSet.six()
            ).pair()
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
            this.initializeYatzyGame(
                DiceResultDataSet.five(),
                DiceResultDataSet.three(),
                DiceResultDataSet.three(),
                DiceResultDataSet.three(),
                DiceResultDataSet.five()
            ).pair()
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
            this.initializeYatzyGame(
                DiceResultDataSet.five(),
                DiceResultDataSet.three(),
                DiceResultDataSet.six(),
                DiceResultDataSet.six(),
                DiceResultDataSet.five()
            ).pair()
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
            this.initializeYatzyGame(
                DiceResultDataSet.three(),
                DiceResultDataSet.three(),
                DiceResultDataSet.five(),
                DiceResultDataSet.four(),
                DiceResultDataSet.five()
            ).twoPairs()
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
            this.initializeYatzyGame(
                DiceResultDataSet.three(),
                DiceResultDataSet.three(),
                DiceResultDataSet.five(),
                DiceResultDataSet.five(),
                DiceResultDataSet.five()
            ).twoPairs()
        );
    }

    // Three of a kind score

    /**
     * Given 3, 3, 3, 4, 5 dices results
     * When calculating three of a kind result
     * Then return 9
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenThreeThreeThreeFourFiveDicesResults_whenThreeOfAKind_ThenReturnNine() throws UnconsistentDiceResult {
        assertEquals(
            9,
            this.initializeYatzyGame(
                DiceResultDataSet.three(),
                DiceResultDataSet.three(),
                DiceResultDataSet.three(),
                DiceResultDataSet.four(),
                DiceResultDataSet.five()
            ).threeOfAKind()
        );
    }

    /**
     * Given 5, 3, 5, 4, 5 dices results
     * When calculating three of a kind result
     * Then return 15
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenFiveThreeFiveFourFiveDicesResults_whenThreeOfAKind_ThenReturnFifteen() throws UnconsistentDiceResult {
        assertEquals(
            15,
            this.initializeYatzyGame(
                DiceResultDataSet.five(),
                DiceResultDataSet.three(),
                DiceResultDataSet.five(),
                DiceResultDataSet.four(),
                DiceResultDataSet.five()
            ).threeOfAKind()
        );
    }

    /**
     * Given 3, 3, 3, 3, 5 dices results
     * When calculating three of a kind result
     * Then return 9
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenThreeThreeThreeThreeFiveDicesResults_whenCalculateThreeOfAKindScore_ThenReturnNine() throws UnconsistentDiceResult {
        assertEquals(
            9,
            this.initializeYatzyGame(
                DiceResultDataSet.three(),
                DiceResultDataSet.three(),
                DiceResultDataSet.three(),
                DiceResultDataSet.three(),
                DiceResultDataSet.five()
            ).threeOfAKind()
        );
    }

    // Four of a kind score

    /**
     * Given 3, 3, 3, 3, 5 dices results
     * When calculating four of a kind result
     * Then return 12
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenThreeThreeThreeThreeFiveDicesResults_whenFourOfAKind_ThenReturnTwelve() throws UnconsistentDiceResult {
        assertEquals(
            12,
            this.initializeYatzyGame(
                DiceResultDataSet.three(),
                DiceResultDataSet.three(),
                DiceResultDataSet.three(),
                DiceResultDataSet.three(),
                DiceResultDataSet.five()
            ).fourOfAKind()
        );
    }

    /**
     * Given 5, 5, 5, 4, 5 dices results
     * When calculating four of a kind result
     * Then return 20
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenFiveFiveFiveFourFiveDicesResults_whenFourOfAKind_ThenReturnTwenty() throws UnconsistentDiceResult {
        assertEquals(
            20,
            this.initializeYatzyGame(
                DiceResultDataSet.five(),
                DiceResultDataSet.five(),
                DiceResultDataSet.five(),
                DiceResultDataSet.four(),
                DiceResultDataSet.five()
            ).fourOfAKind()
        );
    }

    /**
     * Given 3, 3, 3, 3, 3 dices results
     * When calculating four of a kind result
     * Then return 20
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenOnlyThreesDicesResults_whenFourOfAKind_ThenReturnTwelve() throws UnconsistentDiceResult {
        assertEquals(
            12,
            this.initializeYatzyGame(
                DiceResultDataSet.three(),
                DiceResultDataSet.three(),
                DiceResultDataSet.three(),
                DiceResultDataSet.three(),
                DiceResultDataSet.three()
            ).fourOfAKind()
        );
    }

    // Small straight score

    /**
     * Given 1, 2, 3, 4, 5 dices results
     * When calculating small straight result
     * Then return 15
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenOneTwoThreeFourFiveDicesResults_whenSmallStraight_ThenReturnFifteen() throws UnconsistentDiceResult {
        assertEquals(
            15,
            this.initializeYatzyGame(
                DiceResultDataSet.one(),
                DiceResultDataSet.two(),
                DiceResultDataSet.three(),
                DiceResultDataSet.four(),
                DiceResultDataSet.five()
            ).smallStraight()
        );
    }

    /**
     * Given 2, 3, 4, 5, 1 dices results
     * When calculating small straight result
     * Then return 15
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenTwoThreeFourFiveOneDicesResults_whenSmallStraight_ThenReturnFifteen() throws UnconsistentDiceResult {
        assertEquals(
            15,
            this.initializeYatzyGame(
                DiceResultDataSet.two(),
                DiceResultDataSet.three(),
                DiceResultDataSet.four(),
                DiceResultDataSet.five(),
                DiceResultDataSet.one()
            ).smallStraight()
        );
    }

    /**
     * Given 1, 2, 2, 4, 5 dices results
     * When calculating small straight result
     * Then return 0
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenOneTwoTwoFourFiveDicesResults_whenSmallStraight_ThenReturnZero() throws UnconsistentDiceResult {
        assertEquals(
            0,
            this.initializeYatzyGame(
                DiceResultDataSet.one(),
                DiceResultDataSet.two(),
                DiceResultDataSet.two(),
                DiceResultDataSet.four(),
                DiceResultDataSet.five()
            ).smallStraight()
        );
    }

    // Large Straight score

    /**
     * Given 6, 2, 3, 4, 5 dices results
     * When calculating large straight result
     * Then return 20
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenSixTwoThreeFourFiveDicesResults_whenLargeStraight_ThenReturnTwenty() throws UnconsistentDiceResult {
        assertEquals(
            20,
            this.initializeYatzyGame(
                DiceResultDataSet.six(),
                DiceResultDataSet.two(),
                DiceResultDataSet.three(),
                DiceResultDataSet.four(),
                DiceResultDataSet.five()
            ).largeStraight()
        );
    }

    /**
     * Given 2, 3, 4, 5, 6 dices results
     * When calculating large straight result
     * Then return 20
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenTwoThreeFourFiveSixDicesResults_whenLargeStraight_ThenReturnTwenty() throws UnconsistentDiceResult {
        assertEquals(
            20,
            this.initializeYatzyGame(
                DiceResultDataSet.two(),
                DiceResultDataSet.three(),
                DiceResultDataSet.four(),
                DiceResultDataSet.five(),
                DiceResultDataSet.six()
            ).largeStraight()
        );
    }

    /**
     * Given 1, 2, 2, 4, 5, 6 dices results
     * When calculating large straight result
     * Then return 0
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenOneTwoTwoFourFiveDicesResults_whenLargeStraight_ThenReturnZero() throws UnconsistentDiceResult {
        assertEquals(
            0,
            this.initializeYatzyGame(
                DiceResultDataSet.one(),
                DiceResultDataSet.two(),
                DiceResultDataSet.two(),
                DiceResultDataSet.four(),
                DiceResultDataSet.five()
            ).largeStraight()
        );
    }

    // Full house score

    /**
     * Given 6, 2, 2, 2, 6 dices results
     * When calculating full house result
     * Then return 18
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenSixTwoTwoTwoSixDicesResults_whenFullHouse_ThenReturnEighteen() throws UnconsistentDiceResult {
        assertEquals(
            18,
            this.initializeYatzyGame(
                DiceResultDataSet.six(),
                DiceResultDataSet.two(),
                DiceResultDataSet.two(),
                DiceResultDataSet.two(),
                DiceResultDataSet.six()
            ).fullHouse()
        );
    }

    /**
     * Given 2, 3, 4, 5, 6 dices results
     * When calculating full house result
     * Then return 0
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenTwoThreeFourFiveSixDicesResults_whenFullHouse_ThenReturnZero() throws UnconsistentDiceResult {
        assertEquals(
            0,
            this.initializeYatzyGame(
                DiceResultDataSet.two(),
                DiceResultDataSet.three(),
                DiceResultDataSet.four(),
                DiceResultDataSet.five(),
                DiceResultDataSet.six()
            ).fullHouse()
        );
    }

    /**
     * Given 2, 2, 4, 5, 6 dices results
     * When calculating full house result
     * Then return 0
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenTwoTwoFourFiveSixDicesResults_whenFullHouse_ThenReturnZero() throws UnconsistentDiceResult {
        assertEquals(
            0,
            this.initializeYatzyGame(
                DiceResultDataSet.two(),
                DiceResultDataSet.two(),
                DiceResultDataSet.four(),
                DiceResultDataSet.five(),
                DiceResultDataSet.six()
            ).fullHouse()
        );
    }

    /**
     * Given 2, 2, 2, 5, 6 dices results
     * When calculating full house result
     * Then return 0
     * @throws UnconsistentDiceResult thrown if the created dice result is not between 1 and
     */
    @Test
    public void givenTwoTwoTwoFiveSixDicesResults_whenFullHouse_ThenReturnZero() throws UnconsistentDiceResult {
        assertEquals(
            0,
            this.initializeYatzyGame(
                DiceResultDataSet.two(),
                DiceResultDataSet.two(),
                DiceResultDataSet.two(),
                DiceResultDataSet.five(),
                DiceResultDataSet.six()
            ).fullHouse()
        );
    }
}
