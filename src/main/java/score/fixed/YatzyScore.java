package score.fixed;

import dice.DiceResult;
import score.fixed.FixedScore;

public class YatzyScore extends FixedScore {
    private static final int YATZY_MAX_SCORE = 50;
    public YatzyScore(DiceResult firstDiceResult, DiceResult secondDiceResult, DiceResult thirdDiceResult, DiceResult fourthDiceResult, DiceResult fifthDiceResult) {
        super(firstDiceResult, secondDiceResult, thirdDiceResult, fourthDiceResult, fifthDiceResult, YATZY_MAX_SCORE);
    }

    /**
     * A Yatzy score gives a 50 if all dices have the same result, 0 otherwise
     * @return the score of a yatzy
     */
    @Override
    public int calculateScore() {
        return this.diceResults.stream().allMatch(currentDiceResult -> diceResults.get(0).getResult() == currentDiceResult.getResult()) ? this.score : 0;
    }
}
