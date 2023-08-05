package score.severalOfAKind;

import dice.DiceResult;
import score.AbstractScore;

import java.util.concurrent.atomic.AtomicInteger;

public class PairScore extends AbstractScore {
    public PairScore(DiceResult firstDiceResult, DiceResult secondDiceResult, DiceResult thirdDiceResult, DiceResult fourthDiceResult, DiceResult fifthDiceResult) {
        super(firstDiceResult, secondDiceResult, thirdDiceResult, fourthDiceResult, fifthDiceResult);
    }

    /**
     * When a dice face is spotted several times the result is the face number times the number of time it was spotted
     * @return
     */
    @Override
    public int calculateScore() {
        AtomicInteger maxDicePairFace = new AtomicInteger();
        this.diceResults.stream().mapToInt(DiceResult::getResult).distinct().forEach(diceFace -> {
            if(this.diceResults.stream().filter(currentDiceResult -> currentDiceResult.getResult() == diceFace).count() >= 2 && diceFace > maxDicePairFace.get()){
                maxDicePairFace.set(diceFace);
            }
        });
        return maxDicePairFace.get() * 2;
    }
}
