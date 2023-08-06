package score.severalOfAKind;

import dice.DiceResult;

public class TwoPairsScore extends SeveralOfAKindScore{
    private static final int NUMBER_OF_A_KIND_PAIR = 2;

    private static final TwoPairsScore instance = new TwoPairsScore();

    public static TwoPairsScore getInstance(){
        return instance;
    }

    private TwoPairsScore() {
        super(NUMBER_OF_A_KIND_PAIR);
    }
}
