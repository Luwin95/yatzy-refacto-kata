package score.severalOfAKind;

import dice.DiceResult;

public class ThreeOfAKindScore extends SeveralOfAKindScore{
    private static final int THREE_OF_A_KIND_NUMBER = 3;

    private static final ThreeOfAKindScore instance = new ThreeOfAKindScore();

    public static ThreeOfAKindScore getInstance(){
        return instance;
    }

    private ThreeOfAKindScore() {
        super(THREE_OF_A_KIND_NUMBER);
    }
}
