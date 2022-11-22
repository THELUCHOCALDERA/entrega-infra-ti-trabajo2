import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mMusicapp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Musicapp extends Actor
{
    private World link;
    
    public Musicapp(World link)
    {
        this.link = link;
    }
    public void act()
    {
       if (Greenfoot.mouseClicked(this)){
           Greenfoot.setWorld(this.link);
       }
    }
}
