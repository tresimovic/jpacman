package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.sprite.PacManSprites;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

/**
 * Test class used to test the isAlive() method
 * of the Player class.
 *
 * @author Tarik Resimovic
 */

public class PlayerTest {
    private static final PacManSprites SPRITE_STORE = new PacManSprites();
    private PlayerFactory factory = new PlayerFactory(SPRITE_STORE);
    private Player player = factory.createPacMan();

    @Test
    void testAlive() {
        assertThat(player.isAlive()).isEqualTo(true);
    }
}
