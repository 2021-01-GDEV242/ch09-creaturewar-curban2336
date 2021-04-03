

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ElfTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ElfTest
{
    /**
     * Default constructor for test class ElfTest
     */
    public ElfTest()
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
    public void testAliveBool()
    {
        Elf elf1 = new Elf();
        assertEquals(true, elf1.isAlive());
    }

    @Test
    public void testKnockOutBool()
    {
        Elf elf1 = new Elf();
        elf1.takeDamage(600);
        assertEquals(true, elf1.isKnockedOut());
        assertEquals(false, elf1.isAlive());
    }
}
