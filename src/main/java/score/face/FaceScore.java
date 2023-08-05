package score.face;

import dice.DiceResult;
import score.AbstractScore;

abstract class FaceScore extends AbstractScore {
    private final int face;

    public FaceScore(DiceResult firstDiceResult, DiceResult secondDiceResult, DiceResult thirdDiceResult, DiceResult fourthDiceResult, DiceResult fifthDiceResult, int face) {
        super(firstDiceResult, secondDiceResult, thirdDiceResult, fourthDiceResult, fifthDiceResult);
        this.face = face;
    }

    /**
     * A Face score is the sum of all dices matching the given face
     * @return the sum or all dices matching the given face
     */
    @Override
    public int calculateScore() {
        return this.diceResults.stream().filter(currentDiceResult -> currentDiceResult.getResult() == this.face).mapToInt(DiceResult::getResult).sum();
    }
}
