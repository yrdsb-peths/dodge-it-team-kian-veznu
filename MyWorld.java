import greenfoot.*;

public class MyWorld extends World {
    private Counter scoreCounter;
    public MyWorld() {
        super(600, 400, 1);

        Hero hero = new Hero();
        addObject(hero, 300, 200);


        Car_1 rock = new Car_1();
        addObject(rock,0,0);
        Car carOne = new Car();
        addObject(carOne,0,0);

        Car carTwo = new Car();
        addObject(carTwo,0,300);
        
        scoreCounter = new Counter ("Score: ");
        addObject(scoreCounter, 550, 25);

        GreenfootImage background = new GreenfootImage("grass.jpg");
        setBackground(background);

    }
    
    public void increaseScore()
    {
        scoreCounter.add(1);
    }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    //private void prepare()
