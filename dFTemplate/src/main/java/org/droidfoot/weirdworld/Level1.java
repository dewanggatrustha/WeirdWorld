package org.droidfoot.weirdworld;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends Banner
{
    /**
     * Act - do whatever the Level1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int timeout = 0;
    public Level1()
    {
        setImage("level1.png");
    }
    public void act() 
    {
        goToPlayAgain();
    }
    public void goToPlayAgain()
    {
        timeout++;
        if(timeout == 80)
        {
            timeout=0;
            Greenfoot.delay(8);
            Greenfoot.setWorld(new Main());
        }
    }

}
