

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class HumanTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class HumanTest
{
    /**
     * Default constructor for test class HumanTest
     */
    public HumanTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testHumanCreation()
    {
        Human human1 = new Human();
    }

    @Test
    public void testAliveBool()
    {
        Human human1 = new Human();
        assertEquals(true, human1.isAlive());
    }

    @Test
    public void testKnockedOutBool()
    {
        Human human1 = new Human();
        human1.takeDamage(600);
        assertEquals(true, human1.isKnockedOut());
        assertEquals(false, human1.isAlive());
    }
}



