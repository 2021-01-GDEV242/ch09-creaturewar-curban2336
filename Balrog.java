
/**
 * The Balrog class implements a wrapper for the base Demon class with the following additions
 * Implements a maximum/minimum strength for the creature type [40/20]
 * Implements a maximum/minimum hitpoint total for the creature type [100/25]
 * 
 * @author Christopher Urban
 * @version 04-02-2021
 */
public class Balrog extends Demon
{
    private static final int MAX_Balrog_HP = 200;
    private static final int MIN_Balrog_HP = 80;
    private static final int MAX_Balrog_STR = 100;
    private static final int MIN_Balrog_STR = 50;

    /**
     * Constructor for objects of class Balrog -
     * Note that the calling class does not need to know anything about the 
     * requirements of Balrog minimum and maximum values
     * 
     * The instantiating class asks for a Balrog and the Balrog class is responsible for
     * return a Balrog object with values in the appropriate range
     * 
     */
    public Balrog()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super((Randomizer.nextInt(MAX_Balrog_HP-MIN_Balrog_HP)+MIN_Balrog_HP),(Randomizer.nextInt(MAX_Balrog_STR-MIN_Balrog_STR)+MIN_Balrog_STR));
        
    }
    
    /**
     * Allows a Balrog to determine how much damage it is causing in this round of battle
     * 5% chance to deal +50 damage to an attack
     * The Balrog attacks twice
     * @return a value between 1 and str to be used to cause damage to another creature
     */
    public int attack(){
        int damage = super.attack();
        int damage2 = super.attack();
        return damage + damage2;
    }
}