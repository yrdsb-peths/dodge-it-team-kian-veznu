import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    public Hero() {
        setImage("images/person.png");
    }
    
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
            
            
        if(counter == 5)
        {
            counter = 0;
        }
    }
}
