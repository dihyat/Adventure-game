
/**
 * Write a description of class warriors here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class warriors extends Heroes
{
    protected String name;
    public warriors()
    {
        
        health = 100;
        strength = 20;
        specialPower = 100;
    }
    
    
    public void increaseAttack()
    {
        strength = strength + 5;
    }
    
    public void increaseHealth()
    {
        health = health + 10;
    }
}
