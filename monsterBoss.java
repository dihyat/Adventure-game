
/**
 * Write a description of class monsterBoss here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class monsterBoss extends Villains
{
    
    public monsterBoss()
    {
        
        health = 60;
        strength = 40;
        specialPower = 100;
    }
    
   
    public void increaseAttack()
    {
        strength = strength + 3;
    }
    
    public void increaseHealth()
    {
        health = health + 3;
    }
}
