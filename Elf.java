
/**
 * The Elf class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [18/5]
 * Implements a maximum/minimum hitpoint total for the creature type [25/8]
 * 
 * @author Crosbie modified by Christopher Urban
 * @version 04-02-2021
 */
public class Elf extends Creature
{
    private static final int MAX_Elf_HP = 25;
    private static final int MIN_Elf_HP = 8;
    private static final int MAX_Elf_STR = 18;
    private static final int MIN_Elf_STR = 5;

    /**
     * Constructor for objects of class Elf -
     * Note that the calling class does not need to know anything about the 
     * requirements of Elf minimum and maximum values
     * 
     * The instantiating class asks for a Elf and the Elf class is responsible for
     * return a Elf object with values in the appropriate range
     * 
     */
    public Elf()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_Elf_HP-MIN_Elf_HP)+MIN_Elf_HP,    
            Randomizer.nextInt(MAX_Elf_STR-MIN_Elf_STR)+MIN_Elf_STR
        );
          
    }
    
    
    /**
     * Allows an Elf to determine how much damage it is causing in this round of battle
     * 10% chance to double the damage output of an attack
     * @return a value between 1 and str to be used to cause damage to another creature
     */
    public int attack(){
        int damage = super.attack();
        int magic = Randomizer.nextInt(10)+1;
        if (magic>1)
        {
            return damage;
        }
        else
        {
            return damage*2;
        }
    }
    // takeDamage(int) - not overridden, because Elves take all damage assigned to them
}