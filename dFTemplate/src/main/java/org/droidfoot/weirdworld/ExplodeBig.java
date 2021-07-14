package org.droidfoot.weirdworld;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ExplodeBig here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExplodeBig extends Actor
{
    /**
     * Act - do whatever the ExplodeBig wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int counterTime = 0;
    public ExplodeBig()
    {
        setImage("death-explode1.png");
    }
    public void act() 
    {
        counterTime++;
        if(counterTime == 40)
        {
            getWorld().removeObject(this);
        }
    }    
}
