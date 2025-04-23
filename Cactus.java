import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cactus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cactus extends Actor
{
    /**
     * Act - do whatever the Cactus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-7);
        

        if (getX() <= 0) {
            resetCactus();
        }
        
        if (isTouching(Hero.class)){
            Skull skull = new Skull();
            getWorld().addObject(skull, 300, 200);
            getWorld().removeObject(this);
        }
    }
    
    public void resetCactus()
    {
        int num = Greenfoot.getRandomNumber(6);
        if (num == 1){
            setLocation(600, 500);
        } else if (num == 2) {
            setLocation(600, 400);
        } else if (num == 3){
            setLocation(600, 300);
        } else if (num == 4){
            setLocation(600, 200);
        } else {
            setLocation(600, 100);
        }

    }
}
