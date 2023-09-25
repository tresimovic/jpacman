package nl.tudelft.jpacman.ghost;

import nl.tudelft.jpacman.npc.Ghost;
import nl.tudelft.jpacman.npc.ghost.GhostFactory;
import nl.tudelft.jpacman.sprite.PacManSprites;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

/**
 * Test class used to test the createBlinky()
 * method of the GhostFactory class. Also tests
 * hasSquare() method of Unit class.
 *
 * @author Tarik Resimovic
 */

public class GhostFactoryTest {
    private static final PacManSprites sprites = new PacManSprites();
    private GhostFactory factory = new GhostFactory(sprites);

    @Test
    void createGhosts() {
        Ghost ghost = factory.createBlinky();
        assertThat(ghost.hasSquare()).isEqualTo(false);
    }
}
