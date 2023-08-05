package score.face;

import dice.DiceResult;

public class OnesScore extends FaceScore {
    private static final int ONE_FACE = 1;
    public OnesScore(DiceResult firstDiceResult, DiceResult secondDiceResult, DiceResult thirdDiceResult, DiceResult fourthDiceResult, DiceResult fifthDiceResult) {
        super(firstDiceResult, secondDiceResult, thirdDiceResult, fourthDiceResult, fifthDiceResult, ONE_FACE);
    }
}
