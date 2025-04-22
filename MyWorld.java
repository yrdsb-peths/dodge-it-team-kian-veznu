import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Hero hero = new Hero();
        addObject(hero, 200, 250);
        
        Rock rock = new Rock();
        addObject(rock,0,200);

    }
}
