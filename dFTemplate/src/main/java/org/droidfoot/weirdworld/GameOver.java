package org.droidfoot.weirdworld;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Banner
{
    /**
     * Act - do whatever the GameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int timeout = 0;
    public GameOver()
    {
        setImage("gameover.png");
    }
    public void act()
    {
        goToPlayAgain();
    }
    public void goToPlayAgain()
    {
        timeout++;
        if(timeout == 70)
        {
            Greenfoot.delay(5);
            Greenfoot.setWorld(new PlayAgainScreen());
        }
    }

}
