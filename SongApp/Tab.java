import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tab extends World
{

    /**
     * Constructor for objects of class Tab.
     * 
     */
    public Tab()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1);
        prepare();

        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Tabs tabs = new Tabs();
        addObject(tabs,481,254);
        Play play = new Play();
        addObject(play,299,584);
    }
}
