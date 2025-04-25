import greenfoot.*;

public class MyWorld extends World {

    public MyWorld() {
        super(600, 400, 1);

        Hero hero = new Hero();
        addObject(hero, 300, 200);

        GreenfootImage background = new GreenfootImage("grass.jpg");
        setBackground(background);

    }
}
    