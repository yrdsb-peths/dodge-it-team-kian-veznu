import greenfoot.*;

public class MyWorld extends World {
    
    public MyWorld() {
        super(600, 400, 1);

        Hero hero = new Hero();
        addObject(hero, 300, 200);

        Car carOne = new Car();
        addObject(carOne,0,0);

        Car carTwo = new Car();
        addObject(carTwo,0,300);
        
        

        GreenfootImage background = new GreenfootImage("grass.jpg");
        setBackground(background);

    }
    
    
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    //private void prepare()
