import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cactus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    public Car() {
        setImage("images/rock.png");
    }
    
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
            setLocation(600, 0);
        } else if (num == 2){
            setLocation(600, 100);
        } else {
            setLocation (600,200);
        }

    }
}
