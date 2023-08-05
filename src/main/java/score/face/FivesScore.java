package score.face;

import dice.DiceResult;

public class FivesScore extends FaceScore{
    private static final int FIVE_FACE = 5;

    public FivesScore(DiceResult firstDiceResult, DiceResult secondDiceResult, DiceResult thirdDiceResult, DiceResult fourthDiceResult, DiceResult fifthDiceResult) {
        super(firstDiceResult, secondDiceResult, thirdDiceResult, fourthDiceResult, fifthDiceResult, FIVE_FACE);
    }
}
