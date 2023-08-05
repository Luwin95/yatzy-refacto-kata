package score.face;

import dice.DiceResult;

public class TwosScore extends FaceScore {

    private static final int TWO_FACE = 2;

    public TwosScore(DiceResult firstDiceResult, DiceResult secondDiceResult, DiceResult thirdDiceResult, DiceResult fourthDiceResult, DiceResult fifthDiceResult) {
        super(firstDiceResult, secondDiceResult, thirdDiceResult, fourthDiceResult, fifthDiceResult, TWO_FACE);
    }
}
