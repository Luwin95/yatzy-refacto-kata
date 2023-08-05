package score;

import dice.DiceResult;

public abstract class FixedScore extends AbstractScore {
    protected final int score;

    public FixedScore(DiceResult firstDiceResult, DiceResult secondDiceResult, DiceResult thirdDiceResult, DiceResult fourthDiceResult, DiceResult fifthDiceResult, int score) {
        super(firstDiceResult, secondDiceResult, thirdDiceResult, fourthDiceResult, fifthDiceResult);
        this.score = score;
    }

}
