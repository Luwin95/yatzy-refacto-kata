package score.severalOfAKind;

import dice.DiceResult;
import score.AbstractScore;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class PairScore extends AbstractScore {

    private static final PairScore instance = new PairScore();

    public static PairScore getInstance(){
        return instance;
    }

    private PairScore(){}

    /**
     * When a dice face is spotted two times the result is the face number times two
     * @return the result times two
     */
    @Override
    public int calculateScore(List<DiceResult> diceResults) {
        AtomicInteger maxDicePairFace = new AtomicInteger();
        diceResults.stream().mapToInt(DiceResult::getResult).distinct().forEach(diceFace -> {
            if(diceResults.stream().filter(currentDiceResult -> currentDiceResult.getResult() == diceFace).count() >= 2 && diceFace > maxDicePairFace.get()){
                maxDicePairFace.set(diceFace);
            }
        });
        return maxDicePairFace.get() * 2;
    }
}
