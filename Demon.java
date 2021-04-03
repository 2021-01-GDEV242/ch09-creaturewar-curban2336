
/**
 * The Demon class implements a wrapper for the base Creature class with the following additions
 * Demons have a 5% chance to deal an additional +50 to the damage
 * 
 * @author Christopher Urban
 * @version 04-02-2021
 */
public class Demon extends Creature
{
    /**
     * Constructor for objects of class Demon -
     * 
     * 
     * The instantiating class asks for a Demon and the Demon class is responsible for
     * return a Demon object with values in the appropriate range
     * 
     */
    public Demon(int hp, int str)
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(hp, str);
          
    }
    
    /**
     * Allows an Demon to determine how much damage it is causing in this round of battle
     * 5% chance to deal +50 damage to an attack
     * @return a value between 1 and str to be used to cause damage to another creature
     */
    public int attack(){
        int damage = super.attack();
        int magic = Randomizer.nextInt(20)+1;
        if (magic>1)
        {
            return damage;
        }
        else
        {
            return damage+50;
        }
    }
}
