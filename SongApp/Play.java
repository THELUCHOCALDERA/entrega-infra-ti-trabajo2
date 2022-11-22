import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends Actor
{
    GreenfootSound sound = new GreenfootSound("Come_as_you_are_-_Nirvana_LongRiff.mp3");
    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
            sound.play();
            }
    }
}
