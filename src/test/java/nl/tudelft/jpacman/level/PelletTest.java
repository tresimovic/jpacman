package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.sprite.PacManSprites;
import nl.tudelft.jpacman.sprite.Sprite;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

/**
 * Test class used to test the getValue() method
 * of the Pellet class. Also tests getPelletSprite()
 * of PacManSprites class.
 *
 * @author Tarik Resimovic
 */

public class PelletTest {
    private final PacManSprites sprites = new PacManSprites();
    private final Sprite sprite = sprites.getPelletSprite();
    private Pellet pellet = new Pellet(250, sprite);

    @Test
    void pelletTest() {
        int pelletValue = pellet.getValue();
        assertThat(pelletValue == 250).isEqualTo(true);
    }
}
