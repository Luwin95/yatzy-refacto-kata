package operations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

abstract class YatzyScore {
    /**
     * The list of the diceResults launched during Yatzy game, limited to 5 results
     */
    protected List<Integer> diceResults = Arrays.asList(new Integer[5]);

    /**
     * A Yatzy score is made of five dice result
     * @param firstDiceResult
     * @param secondDiceResult
     * @param thirdDiceResult
     * @param fourthDiceResult
     * @param fifthDiceResult
     */
    public YatzyScore(int firstDiceResult, int secondDiceResult, int thirdDiceResult, int fourthDiceResult, int fifthDiceResult) {
        Collections.addAll(this.diceResults, firstDiceResult, secondDiceResult, thirdDiceResult, fourthDiceResult, fifthDiceResult);
    }

    abstract Integer calculateDiceScore();
}
