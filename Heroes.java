

public abstract class Heroes extends Characters
{
   public void setSpecialPower()
   {
       specialPower = 100;
   }
    public void increaseAttack()
    {
        strength = strength + 10;
    }
    public void decreaseHealth(Villains v){
        health = health - v.strength;
    
    }
    public void increaseHealth(){
        health = health + 20;
    }
    public void increasespecialPower(){
        specialPower = 100;
    }

    
}
