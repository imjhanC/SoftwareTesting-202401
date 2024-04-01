package Practical9;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GameTest {

    @Test
    public void testResetGame() {
        Game game = new Game();
        
        // Test cases covering decision table
        assertEquals("None", game.resetGame(false, false, false, false)); // No reset needed
        assertEquals("None", game.resetGame(false, true, false, false)); // No reset needed
        assertEquals("Life", game.resetGame(true, false, false, false)); // Reset life
        assertEquals("Both", game.resetGame(true, true, false, false)); // Reset both score and life
        assertEquals("Both", game.resetGame(true, true, true, false)); // Reset both score and life
        assertEquals("Score or Life", game.resetGame(true, true, true, true)); // Reset either score or life
    }
}
