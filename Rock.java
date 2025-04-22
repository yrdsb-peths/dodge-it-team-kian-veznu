import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rock extends Actor
{
    /**
     * Act - do whatever the Rock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-3);
        

        if (getX() <= 0) {
            resetHero();
        }
        
        if (isTouching(Hero.class)){
            Skull skull = new Skull();
            getWorld().addObject(skull, 300, 200);
            getWorld().removeObject(this);
        }
    }
    
    public void resetHero()
    {
        int num = Greenfoot.getRandomNumber(4);
        if (num == 0){
            setLocation(600, 100);
        } else if (num == 1) {
            setLocation(600, 200);
        } else if (num == 2){
            setLocation(600, 300);
        } else if (num == 3){
            setLocation(600, 400);
        }

    }
}
