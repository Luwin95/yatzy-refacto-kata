package operations;

import java.util.Set;

abstract class YatzyScore {
    Set<Integer> diceResults;

    abstract Integer calculateDiceScore();
}
