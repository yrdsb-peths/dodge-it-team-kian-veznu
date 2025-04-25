import greenfoot.*;

public class MyWorld extends World {

    public MyWorld() {
        super(600, 400, 1);

        Hero hero = new Hero();
        addObject(hero, 300, 200);
        
        TopRock rockA = new TopRock();
        addObject(rockA,600,100);
        
        BottomRock rockB = new BottomRock();
        addObject(rockB,600,300);

        GreenfootImage background = new GreenfootImage("grass.jpg");
        setBackground(background);

    }
}
    