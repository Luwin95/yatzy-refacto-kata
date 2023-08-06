package score.face;

import dice.DiceResult;
import score.AbstractScore;

import java.util.List;

abstract class FaceScore extends AbstractScore {
    private final int face;

    public FaceScore(int face) {
        super();
        this.face = face;
    }

    /**
     * A Face score is the sum of all dices matching the given face
     * @return the sum or all dices matching the given face
     */
    @Override
    public int calculateScore(List<DiceResult> diceResults) {
        return diceResults.stream().filter(currentDiceResult -> currentDiceResult.getResult() == this.face).mapToInt(DiceResult::getResult).sum();
    }
}
