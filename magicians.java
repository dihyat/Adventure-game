
/**
 * Write a description of class magicians here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class magicians extends Heroes
{
   
    protected String name;
    public magicians()
    {
       
        health = 80;
        strength = 50;
        specialPower = 100;
    }
    public void increaseAttack()
    {
        strength = strength + 10;
    }
    
    public void increaseHealth()
    {
        health = health + 5;
    }
    
   
}
