import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cactus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rock_1 extends Actor
{
    /**
     * Act - do whatever the Cactus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-7);
        

        if (getX() <= 0) {
            resetRock_1();
        }
        
        if (isTouching(Hero.class)){
            Skull skull = new Skull();
            getWorld().addObject(skull, 300, 200);
            getWorld().removeObject(this);
        }
    }
    
    public void resetRock_1()
    {
        int num = Greenfoot.getRandomNumber(3);
        if (num == 1){
            setLocation(600, 200);
        } else if (num == 2){
            setLocation(600, 100);
        } else {
            setLocation (600, 0);
        }

    }
}
