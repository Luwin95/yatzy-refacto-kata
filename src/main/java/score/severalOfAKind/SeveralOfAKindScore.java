package score.severalOfAKind;

import dice.DiceResult;
import score.AbstractScore;

import java.util.concurrent.atomic.AtomicInteger;

abstract class SeveralOfAKindScore extends AbstractScore {
    private final int numberOfAKind;

    public SeveralOfAKindScore(DiceResult firstDiceResult, DiceResult secondDiceResult, DiceResult thirdDiceResult, DiceResult fourthDiceResult, DiceResult fifthDiceResult, int numberOfAKind) {
        super(firstDiceResult, secondDiceResult, thirdDiceResult, fourthDiceResult, fifthDiceResult);
        this.numberOfAKind = numberOfAKind;
    }

    /**
     * When a dice face is spotted several times the result is the face number times the number of time it was spotted
     * @return the diceFace times the numberOfAKind (for each detected occurences)
     */
    @Override
    public int calculateScore() {
        AtomicInteger score = new AtomicInteger();
        this.diceResults.stream().mapToInt(DiceResult::getResult).distinct().forEach(diceFace -> {
            if(this.diceResults.stream().filter(currentDiceResult -> currentDiceResult.getResult() == diceFace).count() >= this.numberOfAKind){
                score.addAndGet(diceFace * numberOfAKind);
            }
        });
        return score.get();
    }
}
