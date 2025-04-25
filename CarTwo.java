import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)



public class CarTwo extends Actor
{
    public CarTwo() {
        setImage("images/car01.png");    
    }
    
    public void act()
    {
        move(-7);
        

        if (getX() <= 0) {
            resetRock();
        }
        
        if (isTouching(Hero.class)){
            Skull skull = new Skull();
            getWorld().addObject(skull, 300, 200);
            getWorld().removeObject(this);
        }
    }
    
    public void resetRock()
    {
        int num = Greenfoot.getRandomNumber(2);
        if (num == 1){
            setLocation(600, 300);
        } else {
            setLocation(600, 400);
        } 

    }
}
