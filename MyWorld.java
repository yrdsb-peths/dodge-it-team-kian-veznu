import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Hero hero = new Hero();
        addObject(hero, 300, 200);
        
        Rock rock = new Rock();
        addObject(rock,0,200);
        
        Cactus cactus = new Cactus();
        addObject(cactus, 0, 300);
        
    }
}
