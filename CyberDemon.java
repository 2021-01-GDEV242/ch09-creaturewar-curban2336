
/**
 * The CyberDemon class implements a wrapper for the base Demon class with the following additions
 * Implements a maximum/minimum strength for the creature type [40/20]
 * Implements a maximum/minimum hitpoint total for the creature type [100/25]
 * 
 * @author Christopher Urban
 * @version 04-02-2021
 */
public class CyberDemon extends Demon
{
    private static final int MAX_Cyber_HP = 100;
    private static final int MIN_Cyber_HP = 25;
    private static final int MAX_Cyber_STR = 40;
    private static final int MIN_Cyber_STR = 20;

    /**
     * Constructor for objects of class CyberDemon -
     * Note that the calling class does not need to know anything about the 
     * requirements of CyberDemon minimum and maximum values
     * 
     * The instantiating class asks for a CyberDemon and the CyberDemon class is responsible for
     * return a CyberDemon object with values in the appropriate range
     * 
     */
    public CyberDemon()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super((Randomizer.nextInt(MAX_Cyber_HP-MIN_Cyber_HP)+MIN_Cyber_HP),(Randomizer.nextInt(MAX_Cyber_STR-MIN_Cyber_STR)+MIN_Cyber_STR));
        
    }
}
