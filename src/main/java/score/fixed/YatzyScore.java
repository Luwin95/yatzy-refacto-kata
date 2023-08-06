package score.fixed;

import dice.DiceResult;
import score.fixed.FixedScore;
import score.fixed.straight.SmallStraightScore;

import java.util.List;

public class YatzyScore extends FixedScore {
    private static final int YATZY_SCORE = 50;

    private static final YatzyScore instance = new YatzyScore();

    public static YatzyScore getInstance(){
        return instance;
    }

    private YatzyScore() {
        super(YATZY_SCORE);
    }

    /**
     * A Yatzy score gives a 50 if all dices have the same result, 0 otherwise
     * @return the score of a yatzy
     */
    @Override
    public int calculateScore(List<DiceResult> diceResults) {
        return diceResults.stream().allMatch(currentDiceResult -> diceResults.get(0).getResult() == currentDiceResult.getResult()) ? this.score : 0;
    }
}
