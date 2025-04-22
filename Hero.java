import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int counter = 0; 
    public void act()
    {
        if(Greenfoot.mouseClicked(null))
        {
            counter+= 1;
            
        }
        
        if(counter == 1){
            setLocation(300,0);
        } else if (counter == 2){
            setLocation(300,100);
        } else if (counter == 3) {
            setLocation(300,200);
        }else if (counter == 4){
            setLocation(300,300);
        }else{
            setLocation(300,400);
        }
            
            
        if(counter == 4)
        {
            counter = 0;
        }
    }
}
