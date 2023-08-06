package score.fixed;

import dice.DiceResult;
import score.AbstractScore;

public abstract class FixedScore extends AbstractScore {
    protected final int score;

    public FixedScore(int score) {
        super();
        this.score = score;
    }


}
