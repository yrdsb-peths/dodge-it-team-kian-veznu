import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)



<<<<<<<< HEAD:CarTwo.java
public class CarTwo extends Actor
{
    public CarTwo() {
        setImage("images/car01.png");    
========
public class Car_1 extends Actor
{
    public Car_1() {
        setImage("images/rock.png");    
>>>>>>>> 006670824d257fa5d424db711fd3418070969115:Car_1.java
    }
    
    public void act()
    {
        move(-7);
        

        if (getX() <= 0) {
            resetCar_1();
        }
        
        if (isTouching(Hero.class)){
            Skull skull = new Skull();
            getWorld().addObject(skull, 300, 200);
            getWorld().removeObject(this);
        }
    }
    
    public void resetCar_1()
    {
        int num = Greenfoot.getRandomNumber(2);
        if (num == 1){
            setLocation(600, 300);
        } else {
            setLocation(600, 400);
        } 

    }
}
