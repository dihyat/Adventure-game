
/**
 * Write a description of class Villains here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Villains extends Characters
{
    public void setSpecialPower()
    {
        specialPower = 100;
    }
     public void decreaseHealth(Heroes h){
        health = health - h.strength;
    
    }
}
