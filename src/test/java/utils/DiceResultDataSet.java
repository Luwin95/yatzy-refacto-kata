package utils;

import dice.DiceResult;
import dice.exceptions.UnconsistentDiceResult;

public class DiceResultDataSet {
    public static DiceResult one() throws UnconsistentDiceResult {
        return new DiceResult(1);
    }

    public static DiceResult two() throws UnconsistentDiceResult {
        return new DiceResult(2);
    }

    public static DiceResult three() throws UnconsistentDiceResult {
        return new DiceResult(3);
    }

    public static DiceResult four() throws UnconsistentDiceResult {
        return new DiceResult(4);
    }

    public static DiceResult five() throws UnconsistentDiceResult {
        return new DiceResult(5);
    }

    public static DiceResult six() throws UnconsistentDiceResult {
        return new DiceResult(6);
    }
}
