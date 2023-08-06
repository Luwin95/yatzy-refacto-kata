package score.face;

import dice.DiceResult;

public class OnesScore extends FaceScore {
    private static final int ONE_FACE = 1;

    private static final OnesScore instance = new OnesScore();

    public static OnesScore getInstance(){
        return instance;
    }

    private OnesScore() {
        super(ONE_FACE);
    }
}
