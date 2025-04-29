import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class BottomRock extends Actor
{
    public BottomRock() {
        setImage("images/rock.png");
    }
    
    public void act()
    {

        move(-7);
        
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
        } else {
            setLocation(600, 500);
        }
    }
}

