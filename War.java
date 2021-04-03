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
    private ArrayList<Creature> goodArmy;
    private ArrayList<Creature> badArmy;
    
    /**
     * Constructor for objects of class War
     * Establish ArrayLists for the two armies
     */
    public War()
    {
        goodArmy = new ArrayList<Creature>();
        badArmy = new ArrayList<Creature>();
        populate();
    }

    /**
     * Populates the ArrayLists of both armies for War
     * 
     */
    public void populate()
    {
        int x = 0;
        while(x<100){
            x+=1;
            int race = Randomizer.nextInt(10);
            if(race<=5){
                goodArmy.add(new Human());
            }
            else
            {
                goodArmy.add(new Elf());
            }
        }
        
        int y = 0;
        int size = Randomizer.nextInt(50-30)+30;
        while(y<size){
            y+=1;
            int race = Randomizer.nextInt(25);
            if(race<=17){
                badArmy.add(new Human());
            }
            else if(race>17 && race<=23)
            {
                badArmy.add(new CyberDemon());
            }
            else if(race>23 && race==24)
            {
                badArmy.add(new Balrog());
            }
        }
    }
    
    /**
     * Loop where the good army and the bad army battle and the winner(if there is one)
     * is announced 
     * 
     */
    public void battle()
    {
        int goodIndex = 0;
        int badIndex = 0;
        int goodDeaths = 0;
        int badDeaths = 0;
        System.out.println("On the bridge of destiny, a last alliance of men and elves hopes to combat the hordes from Hades. Corrupted men, Cyber Demons, and Balrogs march on the Pri Materia. What is the result of the war?");
        while(goodArmy.size()>=1 && badArmy.size()>=1)
        {
            goodArmy.get(goodIndex).takeDamage(badArmy.get(badIndex).attack());
            badArmy.get(badIndex).takeDamage(goodArmy.get(goodIndex).attack());
            if(goodArmy.get(goodIndex).isKnockedOut()==true)
            {
                goodArmy.remove(goodIndex);
                goodDeaths++;
            }
            if(badArmy.get(badIndex).isKnockedOut()==true)
            {
                badArmy.remove(badIndex);
                badDeaths++;
            }
        }
        
        if(goodArmy.size()==0)
        {
            if(badArmy.size()==0)
            {
                System.out.println("\n The armies fought valiantly, and in the process, destroyed themselves entirely.\n" + "Human and Elf army Casualties: " + goodDeaths + "   " + "Human and Demon army casualties: " + badDeaths);
            }
            else
            {
                System.out.println("\n The army of men and elves confronted the hordes of corrupted men, Cyber Demons, and dreaded Balrogs. However, the forces of evil prevail this day.\n" + "Human and Elf army Casualties: " + goodDeaths + "   " + "Human and Demon army casualties: " + badDeaths);
            }
        }
        if(badArmy.size()==0)
            {
                System.out.println("\n The armies of Hades were formidable, but lacked the will and numbers to defeat the last alliance. Today the demons are driven back whence they came.\n" + "Human and Elf army Casualties: " + goodDeaths + "   " + "Human and Demon army casualties: " + badDeaths);
            }
    }
}
