import greenfoot.*;

public class MyWorld extends World {
    
    public MyWorld() {
        super(600, 400, 1);

        Hero hero = new Hero();
        addObject(hero, 300, 200);


        Rock rock = new Rock();
        Rock rock_1 = new Rock();
        addObject(rock,0,0);
        addObject(rock_1,0,0);

        
        
        

        GreenfootImage background = new GreenfootImage("grass.jpg");
        setBackground(background);

    }
    
    
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    //private void prepare()
