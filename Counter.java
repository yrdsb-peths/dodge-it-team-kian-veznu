import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A Counter class for use in Greenfoot games like DodgeIt.
 * Displays a number on the screen and animates toward changes.
 */
public class Counter extends Actor
{
    private int value = 0;
    private int target = 0;
    private String prefix;
    private int fontSize = 24;
    private static final Color TEXT_COLOR = Color.BLACK;
    private static final Color BACKGROUND_COLOR = new Color(0, 0, 0, 0); // Transparent

    public Counter()
    {
        this("Score: ");
    }

    public Counter(String prefix)
    {
        this.prefix = prefix;
        updateImage();
    }

    public void act()
    {
        if (value < target) {
            value++;
            updateImage();
        } else if (value > target) {
            value--;
            updateImage();
        }
    }

    public void add(int amount)
    {
        target += amount;
    }

    public void setValue(int newValue)
    {
        target = newValue;
        value = newValue;
        updateImage();
    }

    public int getValue()
    {
        return value;
    }

    public void setPrefix(String newPrefix)
    {
        this.prefix = newPrefix;
        updateImage();
    }

    private void updateImage()
    {
        String displayText = prefix + value;
        GreenfootImage image = new GreenfootImage(displayText, fontSize, TEXT_COLOR, BACKGROUND_COLOR);
        setImage(image);
    }
}
