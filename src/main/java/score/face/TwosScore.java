package score.face;

import dice.DiceResult;

public class TwosScore extends FaceScore {

    private static final int TWO_FACE = 2;

    private static final TwosScore instance = new TwosScore();

    public static TwosScore getInstance(){
        return instance;
    }

    private TwosScore() {
        super(TWO_FACE);
    }
}
