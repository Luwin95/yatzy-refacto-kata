package score;

import dice.DiceResult;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

abstract class YatzyScore {
    /**
     * The list of the diceResults launched during Yatzy game, limited to 5 results
     */
    protected List<DiceResult> diceResults;

    /**
     * The score of a Yatzy game is calculated with 5 dices results (between 1 and 6)
     * @param firstDiceResult the result of the first dice
     * @param secondDiceResult the result of the second dice
     * @param thirdDiceResult the result of the third dice
     * @param fourthDiceResult the result of the fourth dice
     * @param fifthDiceResult the result of the fifth dice
     */
    public YatzyScore(DiceResult firstDiceResult, DiceResult secondDiceResult, DiceResult thirdDiceResult, DiceResult fourthDiceResult, DiceResult fifthDiceResult) {
        this.diceResults = Arrays.asList(firstDiceResult, secondDiceResult, thirdDiceResult, fourthDiceResult, fifthDiceResult);
    }

    abstract Integer calculateScore();
}
