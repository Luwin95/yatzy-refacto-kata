package score.severalOfAKind;

import dice.DiceResult;
import score.fixed.YatzyScore;

public class FourOfAKindScore extends SeveralOfAKindScore{
    private static final int FOUR_OF_A_KIND_NUMBER = 4;

    private static final FourOfAKindScore instance = new FourOfAKindScore();

    public static FourOfAKindScore getInstance(){
        return instance;
    }

    private FourOfAKindScore() {
        super(FOUR_OF_A_KIND_NUMBER);
    }
}
