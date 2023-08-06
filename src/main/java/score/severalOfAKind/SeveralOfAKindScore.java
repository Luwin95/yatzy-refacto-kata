package score.severalOfAKind;

import dice.DiceResult;
import score.AbstractScore;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

abstract class SeveralOfAKindScore extends AbstractScore {
    private final int numberOfAKind;

    public SeveralOfAKindScore(int numberOfAKind) {
        super();
        this.numberOfAKind = numberOfAKind;
    }

    /**
     * When a dice face is spotted several times the result is the face number times the number of time it was spotted
     * @return the diceFace times the numberOfAKind (for each detected occurences)
     */
    @Override
    public int calculateScore(List<DiceResult> diceResults) {
        AtomicInteger score = new AtomicInteger();
        diceResults.stream().mapToInt(DiceResult::getResult).distinct().forEach(diceFace -> {
            if(diceResults.stream().filter(currentDiceResult -> currentDiceResult.getResult() == diceFace).count() >= this.numberOfAKind){
                score.addAndGet(diceFace * numberOfAKind);
            }
        });
        return score.get();
    }
}
