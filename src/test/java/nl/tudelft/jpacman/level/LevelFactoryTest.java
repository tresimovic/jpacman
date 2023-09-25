package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.npc.Ghost;
import nl.tudelft.jpacman.npc.ghost.GhostFactory;
import nl.tudelft.jpacman.points.PointCalculator;
import nl.tudelft.jpacman.sprite.PacManSprites;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

/**
 * Test class used to test the createGhost()
 * method of the LevelFactory class.
 *
 * @author Tarik Resimovic
 */

public class LevelFactoryTest {
    private static final PacManSprites sprites = new PacManSprites();
    private GhostFactory ghostfactory = new GhostFactory(sprites);
    private final PointCalculator pointcalculator = null;
    private LevelFactory levelfactory = new LevelFactory(sprites, ghostfactory, pointcalculator);

    @Test
    void testGhostCreator() {
        Ghost ghost = levelfactory.createGhost();
        assertThat(ghost.hasSquare()).isEqualTo(false);
    }
}
