package Practical9;

public class Game {

    public String resetGame(boolean minScore, boolean target, boolean cont, boolean repeat) {
        if (!minScore && !target) {
            return "None"; // Neither score nor life will be reset.
        } else if (minScore && !target) {
            return "Life"; // Reset / deduct life.
        } else if (minScore && target && !cont) {
            return "Both"; // Reset both score and life.
        } else if (minScore && target && cont && !repeat) {
            return "Both"; // Reset both score and life.
        } else if (minScore && target && cont && repeat) {
            return "Score or Life"; // Reset either score or life.
        }
        return "None";
    }
}
