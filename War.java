import java.util.ArrayList;
/**
 * Two Armies meet on the bridge of destiny....it is a very narrow bridge. 100 men and elves fight an army of men and demons 30-50
 * strong. the exact content of the armies is decided at random. Two ArrayLists will act as the armies. Combatants will engage one on 
 * one and attack at the same time. They will continue to do so until one or both of them die. The next combatants will then fill in
 * the slot. This continues until one or both of the armies are defeated. When the battle is over, it will be displayed which side won
 * if either did. Will also display ties
 *
 * @author Christopher Urban
 * @version 04-02-2021
 */
public class War
{
    /**
     * Constructor for objects of class War
     * Establish ArrayLists for the two armies
     */
    public War()
    {
        ArrayList<Creature> goodArmy = new ArrayList<Creature>();
        ArrayList<Creature> badArmy = new ArrayList<Creature>();
    }

    public void populate()
    {
        int x = 0;
        while(x>100){
            x+=1;
            int race = Randomizer.nextInt(10);
            if(race<=5){
                Creature addition = new Human();
                goodArmy.add(addition);
            }
            else
            {
                Creature addition = new Elf();
                goodArmy.add(addition);
            }
        }
        
        int y = 0;
        int size = Randomizer.nextInt(50-30)+30;
        while(y>size){
            y+=1;
            int race = Randomizer.nextInt(25);
            if(race<=17){
                Creature addition = new Human();
                badArmy.add(addition);
            }
            else if(race>17 && race<=23)
            {
                Creature addition = new CyberDemon();
                badArmy.add(addition);
            }
            else if(race>23 && race<=24)
            {
                Creature addition = new Balrog();
                badArmy.add(addition);
            }
        }
    }
}
