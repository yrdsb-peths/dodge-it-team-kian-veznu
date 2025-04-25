import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class BottomRock extends Actor
{
    public void act()
    {
        move(-2);
        
        if(getX()==0)
        {
            setLocation(600,300);
        }
    }
}
